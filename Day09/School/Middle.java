package Day09.School;

public class Middle extends Student{
    public Middle(int grade, String name) {
        super(grade, name);
    }

    public void eating(){
//        super.study();
        System.out.println("급식 먹는 중");
    }
}
