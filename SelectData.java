import java.sql.*;

public class SelectData {

private static final String url = "jdbc:mysql://localhost:3306/bcis2";
 private static final String username = "root";
 private static final String password = "";

public static void main(String arg[]) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(url, username, password);
 String query = "SELECT * FROM student";
 PreparedStatement ps = con.prepareStatement(query);

        ResultSet rs = ps.executeQuery();
while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            Date dob = rs.getDate(3);
            int age = rs.getInt(4);

            System.out.println("id: " + id + " Name: " + name + " Date of birth: " + dob + " Age: " + age);
        }
        ps.close();
        con.close();
    }
}
