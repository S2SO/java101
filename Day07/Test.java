package Day07;

public class Test {
    public static void main(String[] args) {
        Student kim = new Student("김민재","경영학과",27);
        System.out.println(kim.name + kim.major);

        TestCode lee = new TestCode("math",60);
        System.out.println(lee.testName+lee.testScore);



    }
}
