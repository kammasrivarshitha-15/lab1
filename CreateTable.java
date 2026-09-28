import java.sql.*;

public class CreateTable {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/24761A05CC",
                "root",
                "varshitha");

        Statement st = con.createStatement();

        String sql = "CREATE TABLE IF NOT EXISTS 24761A05CC (" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(50)," +
                "age INT," +
                "branch VARCHAR(50))";
        st.executeUpdate(sql);
        System.out.println("Table created successfully!");

        con.close();
    }
}
