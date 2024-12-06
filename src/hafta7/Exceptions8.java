package hafta7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exceptions8 {
public static void main(String[] args) throws SQLException {
	// Veritabanı bağlantısı simülasyonu
    String databaseURL = "jdbc:mysql://localhost:3306/testdb";
    // Örnek veritabanı bağlantısı
    String username = "root";
    String password = "1234";
    Connection connection = DriverManager.getConnection(databaseURL, username, password);

}
}
