package student_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountCreation {
    static Scanner scanner = new Scanner(System.in);
    static List<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        createAccount();
    }

    public static void createAccount() {
        System.out.println("--------------------------");
        System.out.println("   [계정 생성]");
        System.out.println("--------------------------");

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("아이디를 입력하세요: ");
        String username = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        // Create a new Member object
        Member member = new Member(name, username, password);

        // Add the member to the list of members
        members.add(member);

        System.out.println("계정이 생성되었습니다.");
    }
}

class Member {
    private String name;
    private String username;
    private String password;

    public Member(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
