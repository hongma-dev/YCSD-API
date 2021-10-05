package YCSDAPI.DB;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class DBConnectTest {
	
	
	// MySQL Connector 의 클래스. DB 연결 드라이버 정의
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    // DB 경로
    private static final String URL = "jdbc:mysql://ec2-3-139-91-9.us-east-2.compute.amazonaws.com:3306/YCSD";
    private static final String USER = "root";
    private static final String PASSWORD = "hongma123";

    @Test
    public void testConnection() throws Exception {
        // DBMS에게 DB 연결 드라이버의 위치를 알려주기 위한 메소드
        Class.forName(DRIVER);
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
