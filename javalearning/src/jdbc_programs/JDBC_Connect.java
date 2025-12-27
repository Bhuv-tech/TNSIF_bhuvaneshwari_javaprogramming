package jdbc_programs;

import java.sql.*;


public class JDBC_Connect {
	public static void main(String[] args) {
		//2nd step - Register
		
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "12345";
		
		
		try {
			
			//Load the driver - 3nd step
			Class.forName("org.postgresql.Driver");
			
			//Establishing the connection - 4th step
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			//Define SQL Query - 5th step
			
			Statement st = con.createStatement();
			
			//Execting the query - 6th Step
			
			String query = "SELECT * FROM batch_c78";
			
			//Process the Result - 7th step
			
			ResultSet rs = st.executeQuery(query);
			
			
			while(rs.next())
				
			{
				String table =
				        rs.getInt(1) + ":" +
				        rs.getString(2) + ":" +
				        rs.getString(3);

				System.out.println(table);

			}

			
			//close the resources - 8th step
			
			rs.close();
			st.close();
			con.close();
			
			
		}
		

		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
