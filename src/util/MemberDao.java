package util;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//Dao -> Data Assess Object -> DML
public class MemberDao {
	private Connection getConnection() {
	Connection conn = null;
	try {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/OracleDB");
		conn = ds.getConnection();
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	return conn;
}
	
}
