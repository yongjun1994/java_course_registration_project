package sugang_project;

// 전공 클래스 정의
public class Major {
    private int studentId;  // 학생 아이디
    private int deptId;     // 학과 아이디
    private String deptName;    // 학과 이름

    // 학생 아이디 getter
    public int getStudentId() {
        return studentId;
    }

    // 학생 아이디 setter
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // 학과 아이디 getter
    public int getDeptId() {
        return deptId;
    }

    // 학과 아이디 setter
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    // 학과 이름 getter
    public String getDeptName() {
        return deptName;
    }

    // 학과 이름 setter
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
