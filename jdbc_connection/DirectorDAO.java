package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DirectorDAO {
Connection connection;
public DirectorDAO(){
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="INVENTORY1";
	String pass="INVENTORY1";
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection=DriverManager.getConnection(url, user, pass);
		connection.setAutoCommit(false);
		System.out.println("database is connected");
	}
	catch(ClassNotFoundException  e){
		e.printStackTrace();
	}
	catch (SQLException e) {
		e.printStackTrace();
	}}
	public void save(int dno,String dname){
		String sql="INSERT INTO PRODUCT VALUES(?,?)";
		PreparedStatement p;
		try {
			p=connection.prepareStatement(sql);
			p.setInt(1, dno);
			p.setString(2, dname);
			int rows=p.executeUpdate();
			System.out.println(rows+"inserted");
			p.close();
			System.out.println("director inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void list(){
		String sql="SELECT * FROM PRODUCT";	
		Statement s;
		try{
			s=connection.createStatement();
			ResultSet rs= s.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getInt("PRODUCT_ID")+rs.getString("PRODUCT_NAME"));
			}
			rs.close();
			s.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DirectorDAO dao=new DirectorDAO();
		dao.save(2, "vijay");
		dao.list();
	}
}
