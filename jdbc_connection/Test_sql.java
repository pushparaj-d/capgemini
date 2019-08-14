package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test_sql {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "application", "application");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ACCOUNT");
			ResultSetMetaData resultSet=rs.getMetaData();
			int colcount=resultSet.getColumnCount();
			for(int i=1;i<=colcount;i++){
				String colname=resultSet.getColumnName(i);
				String coltype=resultSet.getColumnTypeName(i);
				System.out.println(colname+":"+coltype);
			}
			/*while (rs.next()) {
				
				System.out.println(rs.getString("DIRECTOR_NAME"));
			}*/
			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
