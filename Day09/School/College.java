package Day09.School;

public class College extends Student{
    private String major;
    public College(int grade, String name, String major) {
        super(grade, name);
        this.major = major;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "\n학생 전공: " + this.major;
    }


    public void partTime() {
        System.out.println("알바하는 중");
    }
}
