package com.lec.exercise.실습;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MemberMenu {

	private double ver;
	
	public MemberMenu(double ver) {
		this.ver = ver;
	}

	public void mainMemberMenu() {
		MemberDAOImpl mdao = MemberFactory.getInstance();
		
		while(true) {
			int menuNo = mainMenuUi();
			
			switch (menuNo) {
			case 1: makeMember(mdao); break;
			case 2: listMember(mdao); break;
			case 3: contentMember(mdao); break;
			case 4: updateMember(mdao); break;
			case 5: deleteMember(mdao); break;
			case 6: findByNameMember(mdao); break;
			case 7: findByEmailMember(mdao); break;
			case 0: System.out.println("프로그램종료."); System.exit(0);
			}
		}
	}

	private void findByEmailMember(MemberDAOImpl mdao) {
		String email = JOptionPane.showInputDialog("검색할 이메일을 입력하세요");
		ArrayList<MemberVO> members = mdao.findByEmailMember(email);
		System.out.println("=====================================================");
		System.out.println("회원ID\t\t회원PW\t\t이름\t\t나이\t\t성별\t\t이메일");
		System.out.println("=====================================================");
		
		if((members == null) || (members.equals(""))) {
			return;
		} else {
			for(MemberVO member:members) {
				System.out.println(member.toString());
			}
		}
		System.out.println("------ 회원관리목록 출력 종료 ------\n\n"); 
	}

	private void findByNameMember(MemberDAOImpl mdao) {
		String name = JOptionPane.showInputDialog("검색할 이름을 입력하세요");
		ArrayList<MemberVO> members = mdao.findByNameMember(name);
		System.out.println("=====================================================");
		System.out.println("회원ID\t\t회원PW\t\t이름\t\t나이\t\t성별\t\t이메일");
		System.out.println("=====================================================");
		
		if((members == null) || (members.equals(""))) {
			return;
		} else {
			for(MemberVO member:members) {
				System.out.println(member.toString());
			}
		}
		System.out.println("------ 회원관리목록 출력 종료 ------\n\n"); 
	}

	private void deleteMember(MemberDAOImpl mdao) {
		String member_id = JOptionPane.showInputDialog("삭제할 ID를 입력하세요.");
		
			mdao.deleteMember(Integer.parseInt(member_id));
			System.out.println(member_id + "의 정보가 성공적으로 삭제되었습니다.");
	}

	private void updateMember(MemberDAOImpl mdao) {
		String member_id = JOptionPane.showInputDialog("수정할 ID를 입력하세요.");
		
			mdao.updateMember(Integer.parseInt(member_id));
			System.out.println("=====================================================");
			System.out.println("회원ID\t\t회원PW\t\t이름\t\t나이\t\t성별\t\t이메일");
			System.out.println("=====================================================");
			System.out.println(mdao.viewMember(Integer.parseInt(member_id)));
		
	}

	private void contentMember(MemberDAOImpl mdao) {
		String member_id = JOptionPane.showInputDialog("조회할 ID를 입력하세요.");
		
		if((member_id ==null) || member_id.equals("")) {
			return;
		} else {
			MemberVO member = mdao.viewMember(Integer.parseInt(member_id));
			System.out.println("=====================================================");
			System.out.println("회원ID\t\t회원PW\t\t이름\t\t나이\t\t성별\t\t이메일");
			System.out.println("=====================================================");
			System.out.println(member);
		}
	}

	private void listMember(MemberDAOImpl mdao) {
		ArrayList<MemberVO> members = mdao.listMember();
		System.out.println("=====================================================");
		System.out.println("회원ID\t\t회원PW\t\t이름\t\t나이\t\t성별\t\t이메일");
		System.out.println("=====================================================");
		
		for(MemberVO member:members) {
			System.out.println(member.toString());
		}
		System.out.println("------ 회원관리목록 출력 종료 ------\n\n"); 
	}

	private void makeMember(MemberDAOImpl mdao) {
		mdao.createMember();
	}

	private int mainMenuUi() {
		String menuNo = JOptionPane.showInputDialog(
					"===== 회원관리애플리케이션 V" + ver + "=====\n\n" +
					"1. 신규회원등록\n" +
					"2. 전체회원조회\n" +
					"3. 회원상세조회\n" +
					"4. 회원정보수정\n" +
					"5. 회원정보삭제\n" +
					"6. 이름별 회원정보 검색\n" +
					"7. email별 회원정보 검색\n" +
					"0. 종료\n\n" +
					"처리할 작업번호를 입력하세요."
		);
		if((menuNo == null) || (menuNo.equals("")))	{
			return 0;
		} else {
			return Integer.parseInt(menuNo);
		}
	}
}



















































