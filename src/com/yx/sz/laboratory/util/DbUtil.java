package com.yx.sz.laboratory.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbUtil {

	
	Connection con = null;
	
	public Connection getConn(){
		 String urlstr="jdbc:mysql://localhost:3306/activiti2";
			 try {
				con=DriverManager.getConnection(urlstr,"root","");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return con;
	}
	
	public Statement getStmt(Connection conn){
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return stmt;
	}
	
	public ResultSet getRs(Connection conn,String sql){
		
		ResultSet rs = null;
		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void closeConn(Connection conn){
		if(conn != null){
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void closeStmt(Statement stmt){
		if(stmt != null){
			try {
				stmt.close();
				stmt = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void closeRs(ResultSet rs){
		if(rs != null){
			try {
				rs.close();
				rs = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
