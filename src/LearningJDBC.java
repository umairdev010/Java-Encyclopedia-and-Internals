import java.sql.*;    // here we take first step

public class LearningJDBC {
    static void main(String[] args) {

        // JAVA DATABASE CONNECTIVITY

        // There are 7 steps in jdbc
        // 1. import connector
        // 2. load driver
        // 3. register driver
        // 4. create connection
        // 5. create statement
        // 6. execute statement
        // 7. close connection
        try {

            Class.forName("org.postgresql.Driver");  // here we load driver in the file this is 2nd step which is optional but as safety

            String url = "jdbc:postgresql://localhost:5432/testing";
            String user = "postgres";
            String password = "00987";

            Connection conn = DriverManager.getConnection(url,user,password);  // here we make connection step 4

            System.out.println("Connected to DataBase");

            String sql = "SELECT * FROM STUDENTS";

            Statement task = conn.createStatement();
            ResultSet result = task.executeQuery(sql);

            while (result.next()){
                System.out.print(result.getInt("id") + " - ");
                System.out.print(result.getString("name") + " - ");
                System.out.println(result.getInt("marks"));
            }

            sql = "INSERT INTO STUDENTS (id , name , marks) VALUES (? , ? , ?)";

            PreparedStatement task1 = conn.prepareStatement(sql);
            task1.setInt(1 , 4);
            task1.setString(2 , "farhan");
            task1.setInt(3 , 97);

            int row = task1.executeUpdate();

            System.out.println("Rows inserted : " + row);

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }



}
