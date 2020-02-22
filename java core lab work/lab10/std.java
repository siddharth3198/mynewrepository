package lab10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class std {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub

	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
			Statement st=con.createStatement();  
			String sql="insert into student1 values('kishore',14)";
			ResultSet rs=st.executeQuery(sql);
			

		} catch (
				Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
				
	}

}
