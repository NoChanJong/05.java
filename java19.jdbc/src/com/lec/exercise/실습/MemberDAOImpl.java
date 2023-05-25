package com.lec.exercise.실습;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MemberDAOImpl implements MemberDAOService {

	private MemberVO insertMember() {
		MemberVO member = new MemberVO();
		
		String member_id = JOptionPane.showInputDialog("회원 ID를 입력하세요.");
		String member_pw = JOptionPane.showInputDialog("회원 PW를 입력하세요.");
		String member_name = JOptionPane.showInputDialog("회원 이름을 입력하세요.");
		String member_age = JOptionPane.showInputDialog("회원 나이를 입력하세요.");
		String member_gender = JOptionPane.showInputDialog("회원 성별을 입력하세요.");
		String member_email = JOptionPane.showInputDialog("회원 이메일를 입력하세요.");
		
		member.setMember_id(Integer.parseInt(member_id));
		member.setMember_pw(member_pw);
		member.setMember_name(member_name);
		member.setMember_age(Integer.parseInt(member_age));
		member.setMember_gender(member_gender);
		member.setMember_email(member_email);
		return member;
	}
	
	@Override
	public void createMember() {
		MemberVO member = insertMember();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		String sql = cf.getInsert();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, member.getMember_id());
			pstmt.setString(2, member.getMember_pw());
			pstmt.setString(3, member.getMember_name());
			pstmt.setInt(4, member.getMember_age());
			pstmt.setString(5, member.getMember_gender());
			pstmt.setString(6, member.getMember_email());
			int row = pstmt.executeUpdate();
			System.out.println(row + "건이 성공적으로 등록되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public ArrayList<MemberVO> listMember() {
		ArrayList<MemberVO> memberList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect()
				+ " order by member_id desc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO member = new MemberVO();
				member.setMember_id(rs.getInt(1));
				member.setMember_pw(rs.getString("member_pw"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(rs.getString("member_email"));
				memberList.add(member);
			}
		} catch (Exception e) {
			System.out.println("회원관리목록 조회 실패");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return memberList;
	}

	@Override
	public MemberVO viewMember(int member_id) {
		MemberVO member = new MemberVO();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = cf.getSelect() + " where member_id=?";
			int sa_id = member_id;
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sa_id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member.setMember_id(rs.getInt("member_id"));
				member.setMember_pw(rs.getString("member_pw"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(rs.getString("member_email"));
			} else {
				System.out.println("회원 ID(" + member_id + ") - 의 정보가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("선택한 회원id 정보 조회 실패");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return member;
	}

	@Override
	public void updateMember(int member_id) {
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = cf.getUpdate();
		try {
			pstmt = conn.prepareStatement(sql);
			
			String member_name = JOptionPane.showInputDialog("회원 이름을 입력하세요.");
			String member_age = JOptionPane.showInputDialog("회원 나이를 입력하세요.");
			String member_gender = JOptionPane.showInputDialog("회원 성별을 입력하세요.");
			String member_email = JOptionPane.showInputDialog("회원 이메일를 입력하세요.");
			
			pstmt.setString(1, member_name);
			pstmt.setString(2, member_age);
			pstmt.setString(3, member_gender);
			pstmt.setString(4, member_email);
			pstmt.setInt(5, member_id);
			
			int row = pstmt.executeUpdate();
			System.out.println("회원관리 정보수정이 " + row + "건 처리되었습니다.");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public void deleteMember(int member_id) {
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = cf.getDelete();
		try {
			pstmt = conn.prepareStatement(sql);
				
			pstmt.setInt(1, member_id);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public ArrayList<MemberVO> findByNameMember(String member_name) {
		ArrayList<MemberVO> memberList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = cf.getSelect() + " where member_name like ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + member_name + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVO member = new MemberVO();
				member.setMember_id(rs.getInt("member_id"));
				member.setMember_pw(rs.getString("member_pw"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(rs.getString("member_email"));
				memberList.add(member);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return memberList;
	}

	@Override
	public ArrayList<MemberVO> findByEmailMember(String member_email) {
ArrayList<MemberVO> memberList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = cf.getSelect() + " where member_email like ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + member_email + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVO member = new MemberVO();
				member.setMember_id(rs.getInt("member_id"));
				member.setMember_pw(rs.getString("member_pw"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(rs.getString("member_email"));
				memberList.add(member);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return memberList;
	}
}















































