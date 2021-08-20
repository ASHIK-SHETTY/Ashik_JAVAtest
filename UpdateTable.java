import java.sql.*;
import java.sql.Connection; 
public class UpdateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String username = "SYSTEM";
		String password = "abcd";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		
		/*String createQuery="CREATE TABLE test(ID NUMBER(2),NAME VARCHAR(10), SUBJECT VARCHAR(10),MARKS NUMBER(20))";
		stmt.executeUpdate(createQuery);
		
		String insertQuery="insert into test(ID, NAME , SUBJECT, MARKS) values (1, 'Sasuke','Physics',45)";
		stmt.executeUpdate(insertQuery);
		insertQuery="insert into test(ID, NAME , SUBJECT, MARKS) values (2, 'Naruto','Physics',28)";
		stmt.executeUpdate(insertQuery);
		insertQuery="insert into test(ID, NAME , SUBJECT, MARKS) values (3, 'Todoroki','Physics',43)";
		stmt.executeUpdate(insertQuery);
		insertQuery="insert into test(ID, NAME , SUBJECT, MARKS) values (4, 'Itachi','Physics',49)";
		stmt.executeUpdate(insertQuery);*/
		String updateQuery = " UPDATE test SET marks=100 WHERE id=3";
		stmt.executeUpdate(updateQuery);
		
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM test ");
		
		System.out.println("Query execution" + rs);
		
		while(rs.next()) {
			System.out.println(rs.getString("ID") + " : " +  rs.getString("NAME")+ " : " +  rs.getString("SUBJECT")+ " : " +  rs.getString("MARKS"));
		}
		con.close();

	}

}
