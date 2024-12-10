import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseOperation {
    private String url;
    private String username;
    private String password;

    public DatabaseOperation(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void saveToDatabase(String type, String brand) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO vehicle (vehicle_type, vehicle_brand) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, type);
            preparedStatement.setString(2, brand);
            preparedStatement.executeUpdate();
            System.out.println(type + " with brand " + brand + " has been saved to the database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
