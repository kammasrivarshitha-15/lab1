import java.sql.*;

public class InsertData {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/24761A05CC",
                "root",
                "varshitha");

        Statement st = con.createStatement();

        String sql = "INSERT INTO students VALUES " +
                "(11, 'Varsha','CSE')," +
                "(22, 'varshi','CSE')," +
                "(33, 'varshitha', 'CSE')";

        int rows = st.executeUpdate(sql);

        if (rows > 0) {
            System.out.println("Data inserted successfully!");
        }

        con.close();
    }
}
