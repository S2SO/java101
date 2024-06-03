package Day09.School;

public class Student {

    private String name;
    private int grade;

    public Student(int grade, String name) {
        this.name = name;
        this.grade = grade;
    }
    public String getInfo() {
        String StudentInfo = "학생 이름: " + this.name
                + "\n학생 학년: " + this.grade;
        return StudentInfo;
    }
    public void study() {
        System.out.println("공부 중");
    }
    public void test() {
        System.out.println("시험 보는 중");
    }
}
