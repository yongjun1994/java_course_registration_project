package sugang_project;

// 학생 클래스 정의
public class Student {
    private int studentId;        // 학생 아이디
    private String password;      // 비밀번호
    private String studentName;   // 학생 이름
    private String studentTel;    // 학생 전화번호
    private String studentEmail;  // 학생 이메일
    private int deptId;           // 학과 아이디
    private int grade;            // 학년

    // 학생 아이디 getter
    public int getStudentId() {
        return studentId;
    }

    // 학생 아이디 setter
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // 비밀번호 getter
    public String getPassword() {
        return password;
    }

    // 비밀번호 setter
    public void setPassword(String password) {
        this.password = password;
    }

    // 학생 이름 getter
    public String getStudentName() {
        return studentName;
    }

    // 학생 이름 setter
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // 학생 전화번호 getter
    public String getStudentTel() {
        return studentTel;
    }

    // 학생 전화번호 setter
    public void setStudentTel(String studentTel) {
        this.studentTel = studentTel;
    }

    // 학생 이메일 getter
    public String getStudentEmail() {
        return studentEmail;
    }

    // 학생 이메일 setter
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    // 학과 아이디 getter
    public int getDeptId() {
        return deptId;
    }

    // 학과 아이디 setter
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    // 학년 getter
    public int getGrade() {
        return grade;
    }

    // 학년 setter
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
