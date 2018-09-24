package mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

public class InsertSQL {
    public static void main(String[] args) throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/selenium_test";
        String user = "root";
        String pwd = "123456";

        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, pwd);
        if (!conn.isClosed())
            System.out.println("connect mysql successfully");

        Statement state = conn.createStatement();
        String createTable = "create table people(id int, name varchar(20), age int)";
        state.executeLargeUpdate(createTable);

        String[] arr = new String[]{"benchi", "kk", "mashaladi", "falali"};


        for (int i = 0; i <= 10 ; i++) {
            int n = new Random().nextInt(arr.length - 1);
            String insertData = String.format("insert into people values(%s, '%s', 18)", i, arr[n]);
//            System.out.println(insertData);
            conn.prepareStatement(insertData).execute();
        }
    }
}
