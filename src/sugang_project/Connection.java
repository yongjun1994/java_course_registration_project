package sugang_project;

import java.sql.SQLException;


public class Connection {
	Connection conn = DriverManager.getConnection(url, username, password);
	ConnectionUtil.close(conn);

    public void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Connection closed successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error while closing connection: " + e.getMessage());
        }
    }
}


