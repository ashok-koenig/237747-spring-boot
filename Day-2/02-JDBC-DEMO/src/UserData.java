import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserData {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/demo_db";
        String username = "postgres";
        String password = "postgres";

        Connection connection = null;
        try{
            // Step 1: Register the PostgreSQL Driver
            Class.forName("org.postgresql.Driver");

            // Step 2: Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Step 3: Create a statement
            Statement statement = connection.createStatement();

            // Step 4: Execute a query
            String query = "select * from users";
            ResultSet resultSet = statement.executeQuery(query);

            // Step 5: Process the result set
            while(resultSet.next()){
                System.out.println("First Name: "+ resultSet.getString("first_name"));
                System.out.println("Last Name: "+ resultSet.getString("last_name"));
                System.out.println("Email: "+ resultSet.getString("email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
