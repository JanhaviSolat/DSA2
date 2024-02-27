//SQL Injection Atteck
import java.sql.*;
import java.util.*;
class Demo3
{
	public static void main(String ar[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql:///abhidb","root","root");
			PreparedStatement st=con.prepareStatement("select * from login2 where Uname='-- ? AND Upass=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name");
			String s1=sc.nextLine();
			System.out.println("Enter pass");
			String s2=sc.nextLine();
			st.setString(1,s1);
			st.setString(2,s2);
			ResultSet rs=st.executeQuery();
			if(rs.next())
				System.out.println("Welcome");
		    else
				System.out.println("Invalid Data");
			con.close();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}