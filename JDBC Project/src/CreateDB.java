import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class CreateDB {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=root";

        String database = "MY_proof";
        String username = "root";
        String password = "Aayush@05";
    
        Connection connection = DriverManager.getConnection(url, username, password);
    }
}
