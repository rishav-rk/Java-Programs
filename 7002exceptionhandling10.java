// Write a Java program to throw the SQL Query, insert, delete, update, if not successful then throw an exceptioned

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
class Main {
    private static Connection con;
    Main(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodb","root","");
        }
        catch(ClassNotFoundException cnf_e)
        {
            System.out.println("Error in finding class");
        }
        catch(SQLException sql_e)
        {
            System.out.println(sql_e.toString());
        }
    }
    public static void main(String[] args) {
        new Main();
        try
        {
                Statement  ps = con.createStatement();

        }
        catch(SQLException sqle)
        {
                        System.out.println(sqle.toString());
        }
        System.out.println(con);
    }
}
