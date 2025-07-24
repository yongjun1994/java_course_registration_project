package sugang_project;
// 데이터베이스에 학생 정보를 추가


// 학생 데이터 액세스 객체 클래스
public class StudentDAO {
    private Connection connection;

    // 생성자
    public StudentDAO() {
        try {
            // 데이터베이스 연결 획득
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
			exit();
        }
    }

    // 학생 추가 메서드
    public void addStudent(Student student) {
        String query = "INSERT INTO student (STUDENT_ID, STUDENT_PWD, STUDENT_NAME, STUDENT_TEL, STUDENT_EMAIL, DEPT_ID, GRADE) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // 쿼리 매개변수 설정
            statement.setInt(1, student.getStudentId());
            statement.setString(2, student.getPassword());
            statement.setString(3, student.getStudentName());
            statement.setString(4, student.getStudentTel());
            statement.setString(5, student.getStudentEmail());
            statement.setInt(6, student.getDeptId());
            statement.setInt(7, student.getGrade());
            // 쿼리 실행
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 데이터베이스 쿼리를 위한 PreparedStatement 생성 메서드
    // (Read, Update, Delete 기능에도 유사하게 사용 가능)
    private PreparedStatement prepareStatement(Connection connection, String query, Student student) throws SQLException {
        // PreparedStatement 생성
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        // 쿼리 매개변수 설정
        preparedStatement.setInt(1, student.getStudentId());
        preparedStatement.setString(2, student.getPassword());
        preparedStatement.setString(3, student.getStudentName());
        preparedStatement.setString(4, student.getStudentTel());
        preparedStatement.setString(5, student.getStudentEmail());
        preparedStatement.setInt(6, student.getDeptId());
        preparedStatement.setInt(7, student.getGrade());
        return preparedStatement;
    }
}
