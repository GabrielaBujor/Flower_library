import java.sql.*;

public class DB {

    public static void main(String[] args) {

        String colour = "White";
        String country = "Greece";
        Integer price = 8;

        String jdbcURL = "jdbc:mysql://localhost:3306/projectp3";
        String user = "root";
        String pass = "Tru31ov3OP23$";

        try{

            Connection connection = DriverManager.getConnection(jdbcURL, user, pass);

            Statement stmt = connection.createStatement();

            System.out.println("INDOOR FLOWERS:\n");

            ResultSet resultSet = stmt.executeQuery("select * from indoor");

            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("colour"));
                System.out.println(resultSet.getString("height"));
                System.out.println(resultSet.getString("fertilizer"));
                System.out.println(resultSet.getString("price"));
                System.out.println(resultSet.getString("country"));
                System.out.println('\n');
            }

            ResultSet resultSet1 = stmt.executeQuery("select * from outdoor");

            System.out.println("OUTDOOR FLOWERS:\n");

            while (resultSet1.next()){
                System.out.println(resultSet1.getString("name"));
                System.out.println(resultSet1.getString("colour"));
                System.out.println(resultSet1.getString("height"));
                System.out.println(resultSet1.getString("fertilizer"));
                System.out.println(resultSet1.getString("price"));
                System.out.println(resultSet1.getString("country"));
                System.out.println('\n');
            }


            Statement stmt2 = connection.createStatement();

            String Update = "UPDATE indoor SET price="+price+" WHERE country='"+country+"' AND colour='"+colour+"'";

            stmt2.executeUpdate(Update);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
