package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sql_test2 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "application", "application");
			//Statement stmt = con.createStatement();
			con.setAutoCommit(false);
			PreparedStatement rs = con.prepareStatement("INSERT INTO ACCOUNT VALUES(?,?)");
			rs.setInt(1, 123);
			rs.setString(2, "aarun");
			rs.setString(3, "savings");
			rs.setFloat(4, 12000);
			int rows=rs.executeUpdate();
			System.out.println(rows+"inserted");
			/*while (rs.next()) {
				
				System.out.println(rs.getString("DIRECTOR_NAME"));
			}*/
			con.commit();
			rs.close();
			//stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(SQLException e){
			System.out.println(e);
		}

	}
}
