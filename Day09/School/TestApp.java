package Day09.School;

public class TestApp {
    public static void main(String[] args) {
        Middle kim = new Middle(2,"김민재");
        College son = new College(4,"손흥민","의학부");

        System.out.println(kim.getInfo());
        System.out.println(son.getInfo());
    }
}
