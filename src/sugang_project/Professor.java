package sugang_project;

// 교수 클래스 정의
public class Professor {
    private int professorId;        // 교수 아이디
    private String professorName;   // 교수 이름
    private String professorTel;    // 교수 전화번호
    private String professorEmail;  // 교수 이메일

    // 교수 아이디 getter
    public int getProfessorId() {
        return professorId;
    }

    // 교수 아이디 setter
    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    // 교수 이름 getter
    public String getProfessorName() {
        return professorName;
    }

    // 교수 이름 setter
    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    // 교수 전화번호 getter
    public String getProfessorTel() {
        return professorTel;
    }

    // 교수 전화번호 setter
    public void setProfessorTel(String professorTel) {
        this.professorTel = professorTel;
    }

    // 교수 이메일 getter
    public String getProfessorEmail() {
        return professorEmail;
    }

    // 교수 이메일 setter
    public void setProfessorEmail(String professorEmail) {
        this.professorEmail = professorEmail;
    }
}
