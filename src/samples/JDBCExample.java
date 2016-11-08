import java.sql.*;
public class JDBCExample {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost/CODINGGROUND";

   static final String USER = "root";
   static final String PASS = "root";

   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;

   try{
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "select * from users";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String name = rs.getString("name");
         String sex = rs.getString("sex");

         System.out.print("ID: " + id);
         System.out.print(", Name: " + name);
         System.out.print(", Age: " + age);
         System.out.println(", Sex: " + sex);
      }
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
}
}
