
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConnection
{
    public static void main(String[]args)
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println();
            con=DriverManager.getConnection("jdbc:mysq://localhost:3306","admin","admin");
            System.out.println();
            System.out.println(con);

        }	catch(ClassCastException | SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }


    }
}
