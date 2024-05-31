package Day08;

// 클래스: 나만의 데이터 타입[속성/프로퍼티/변수들] + 기능[메소드/함수]
public class Cat {
    String name;
    String breed;
    int age;

    public Cat(String name, String breed, int age) {
        this.name = name; //알트 인서트
        this.breed = breed;
        this.age = age;
    }

    void hissing(){
        System.out.println(this.name + "이 " + "하악질 합니다.");


    }
}
