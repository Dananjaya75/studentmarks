
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class StudentDAO {
    StudentDAO() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "1234");
            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM students";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String subject = rs.getString("subject");
                String grade = rs.getString("marks");
                // System.out.println(id + " " + name + " " + subject + " " + grade + "");

            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
