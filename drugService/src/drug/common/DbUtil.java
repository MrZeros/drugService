package drug.common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {

	private static String url="";
	private static String driver="";
	private static String user="";
	private static String passwd="";
	static{
		Properties p=new Properties();
		try {
			p.load(DbUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			url=p.getProperty("url");
			driver=p.getProperty("driver");
			user=p.getProperty("user");
			passwd=p.getProperty("passwd");
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection conn=null;
		try {
			 conn=DriverManager.getConnection(url, user, passwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeConnection(Connection conn,PreparedStatement ps,ResultSet rs){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
