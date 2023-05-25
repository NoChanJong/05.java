package com.lec.ex01_basic;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEmployeeMain {

	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PWD = "tiger";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) throws Exception {
		// 실습. select empno, ename, job from emp;
		// 사원정보를 employees.html(table태그)파일로 저장
		
		Path path = Paths.get("src/com/lec/ex01_basic/employees.html");
		
		FileChannel fc = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		
		String table = "<table border=\"1\">";
		table += "<thead><td>사원번호</td><td>사원이름</td><td>직급</td></thead>";
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			
			String sql = "select empno, ename, job from emp";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				
				table += "<tr>";
				table += "<td>" + empno + "</td>";
				table += "<td>" + ename + "</td>";
				table += "<td>" + job + "</td>";
				table += "</tr>";
			}
			table += "</table>";
			
			Charset cs = Charset.defaultCharset();
			ByteBuffer buffer = cs.encode(table);
			
			int byteCount = fc.write(buffer);
			System.out.println("file.txt : " + byteCount + " bytes 쓰기 성공");
			
			fc.close();
			
		} catch (Exception e) {
			System.out.println("DB연결실패.");
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
	}

}






































