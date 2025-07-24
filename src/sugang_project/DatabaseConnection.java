package sugang_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 데이터베이스 연결 인터페이스
public class DatabaseConnection {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // Oracle 데이터베이스 접속 URL
    private static final String USERNAME = "testuser"; // Oracle 데이터베이스 사용자 이름
    private static final String PASSWORD = "test1234"; // Oracle 데이터베이스 암호

    // 데이터베이스 연결 획득 메서드
    public static Connection getConnection() throws SQLException {
        // DriverManager를 사용하여 데이터베이스에 연결하고 Connection 객체를 반환
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    
    // main 메서드
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // 데이터베이스 연결 획득
            connection = getConnection();
            System.out.println("데이터베이스 연결 성공!");
            // 연결 종료
            connection.close();
            System.out.println("데이터베이스 연결 종료!");
        } catch (SQLException e) {
            // 연결 실패 시 예외 처리
            System.out.println("데이터베이스 연결 실패!");
            e.printStackTrace();
        }
    }
}
