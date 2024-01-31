
import java.sql.*;

public class JDBCInsertInto {
	static final String DB_URL="jdbc:mysql://localhost:3306/sakila";
	static final String USER="root";
	static final String PWD="root";
	
	static final String INSERT_TABLE1="INSERT INTO table1 ( tName, tCity)"
			+ "VALUES ('Sourabh', 'Belgaum')";
	
	public static void main(String[] args) {
			try(Connection con= DriverManager.getConnection(DB_URL,USER,PWD)){
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate(INSERT_TABLE1);
			System.out.println("values inserted in table1");
			
			
			ResultSet rs=stmt.executeQuery("select * from table1");
			
			
			while(rs.next()) {
				int id=rs.getInt("tid");
				String name=rs.getString("tName");
				String city= rs.getString("tCity");
				
				System.out.println(id+" "+name+" "+city);
			}
			
			//con.close() //no need to close here as we are using try with resources
			
			
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
