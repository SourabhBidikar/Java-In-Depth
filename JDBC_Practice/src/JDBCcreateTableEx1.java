import java.sql.*;

public class JDBCcreateTableEx1 {

	static final String DB_URL="jdbc:mysql://localhost:3306/sakila";
	static final String USER="root";
	static final String PWD="root";
	
	static final String CREATE_QUERY="create table "
			+ "table1(tId int(20) primary key auto_increment,"
			+ "tName varchar(200) not null, "
			+ "tCity varchar(200))";
	
	static final String INSERT_TABLE1="INSERT INTO table1 ( tName, tCity)"
			+ "VALUES ('Sourabh', 'Belgaum')";
	
	public static void main(String[] args) {
		
		try(Connection con= DriverManager.getConnection(DB_URL,USER,PWD)){
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate(CREATE_QUERY);
			System.out.println("table created");
			
			
			
			//con.close() //no need to close here as we are using try with resources
			
			
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
