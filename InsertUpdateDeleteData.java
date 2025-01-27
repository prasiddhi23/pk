import java.sql.*;
import java.util.Scanner;

public class InsertUpdateDeleteData {

    private static final String url = "jdbc:mysql://localhost:3306/bcis2";
    private static final String username = "root";
    private static final String password = "";

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Insert Data");
        System.out.println("2. Update Data");
        System.out.println("3. Delete Data");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        if (choice == 1) {
            String insertQuery = "INSERT INTO student(id, name, dob, age) VALUES(?, ?, ?, ?)";

            System.out.println("Enter id:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter Date of Birth (YYYY-MM-DD):");
            String dob = sc.nextLine();

            System.out.println("Enter age:");
            int age = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(insertQuery);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDate(3, Date.valueOf(dob));
            ps.setInt(4, age);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                System.out.println("Data added successfully");
            } else {
                System.out.println("Insert operation failed");
            }

            ps.close();
        } else if (choice == 2) {
            String updateQuery = "UPDATE student SET name = ?, dob = ?, age = ? WHERE id = ?";

            System.out.println("Enter id of the student to update:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter new name:");
            String name = sc.nextLine();

            System.out.println("Enter new Date of Birth (YYYY-MM-DD):");
            String dob = sc.nextLine();

            System.out.println("Enter new age:");
            int age = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(updateQuery);

            ps.setString(1, name);
            ps.setDate(2, Date.valueOf(dob));
            ps.setInt(3, age);
            ps.setInt(4, id);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                System.out.println("Data updated successfully");
            } else {
                System.out.println("Update operation failed");
            }

            ps.close();
            } else if (choice == 3) {
            String deleteQuery = "DELETE FROM student WHERE id = ?";

            System.out.println("Enter id of the student to delete:");
            int id = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(deleteQuery);

            ps.setInt(1, id);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                System.out.println("Data deleted successfully");
            } else {
                System.out.println("Delete operation failed");
            }

            ps.close();
        } else {
            System.out.println("Invalid choice");
        }

        con.close();
        sc.close();
    }
}
