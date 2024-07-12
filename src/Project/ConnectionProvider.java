package Project;
import java.sql.*;
/**
 *
 * @author Student
 */
public class ConnectionProvider 
{   
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","123456");
            return con;
        }
        catch(Exception e)
         {
            System.out.println(e);
            return null;
        }
    }
}