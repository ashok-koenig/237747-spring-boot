import java.sql.*;
import java.util.Scanner;

public class UsersCRUD {

    static void addUser(Connection connection, Scanner scanner) throws  SQLException{
        System.out.println("Enter first name: ");
        String first_name = scanner.nextLine();
        System.out.println("Enter last name: ");
        String last_name = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        String sql = "insert into users(first_name, last_name, email) values(?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, first_name);
        statement.setString(2, last_name);
        statement.setString(3, email);
        int rowsInserted = statement.executeUpdate();
        System.out.println(rowsInserted + " user inserted");
    }

    static void updateUser(Connection connection, Scanner scanner) throws  SQLException{
        System.out.println("Enter first name: ");
        String first_name = scanner.nextLine();
        System.out.println("Enter last name: ");
        String last_name = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter user id to update: ");
        int user_id = scanner.nextInt();

        String sql = "update users set first_name=?, last_name=?, email=? where user_id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, first_name);
        statement.setString(2, last_name);
        statement.setString(3, email);
        statement.setInt(4, user_id);
        int rowsUpdated = statement.executeUpdate();
        System.out.println(rowsUpdated + " user updated");
    }

    static void deleteUser(Connection connection, Scanner scanner) throws  SQLException{

        System.out.println("Enter user id to delete: ");
        int user_id = scanner.nextInt();

        String sql = "delete from users where user_id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, user_id);
        int rowsDeleted = statement.executeUpdate();
        System.out.println(rowsDeleted + " user deleted");
    }

   static void displayUsers(Connection connection) throws SQLException {
        String sql = "select * from users";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("User ID \t First Name \t Last Name \t Email");
        while (resultSet.next()){
            System.out.println(resultSet.getInt("user_id")+ "\t"+
                    resultSet.getString("first_name")+ "\t"+
                    resultSet.getString("last_name")+ "\t"+
                    resultSet.getString("email")
            );
        }
    }
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/demo_db";
        String username = "postgres";
        String password = "postgres";

        Connection connection = null;
        Scanner scanner = new Scanner(System.in);
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");

//            addUser(connection, scanner);
//            updateUser(connection, scanner);
            deleteUser(connection, scanner);
            displayUsers(connection);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
