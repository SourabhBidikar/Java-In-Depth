import java.sql.*;

public class JDBCEx1 {

	static final String DB_URL="jdbc:mysql://localhost:3306/sakila";
	static final String USER="root";
	static final String PWD="root";
	
	static final String SELECT_QUERY="select * from actor where actor_id<11;";
	
	
	public static void main(String[] args) {
		
		
		
	try(Connection con=DriverManager.getConnection(DB_URL,USER,PWD)){
		
		Statement stmt=con.createStatement();
		
		ResultSet set=stmt.executeQuery(SELECT_QUERY);
		
		
		while(set.next()) {
			int id=set.getInt("actor_id");
			String name=set.getString("first_name");
		
			System.out.println("ID: "+id+" name: "+name);
		}
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}

	}

}
