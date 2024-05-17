package Day03;

public class Operator {
    public static void main(String[] args) {
        //Operator[연산자]

        //산술 연산자
        // +, -, *, /[몫], %[나머지], ++, --
//        System.out.println(5%2); //1
//        int a = 10;
//        a++; //하나 올리기
//        System.out.println(a);
//        a--; //하나 내리기
//        a--; //하나 내리기
//        System.out.println(a);

        //비교 연산자: boolean
        // >, <, >=, <=, ==, !=
//        int b = 10;
//        int c = 5;
//        System.out.println(b > c); //true
//        System.out.println(b < c); //false
//        System.out.println(b >= c); //true
//        System.out.println(b <= c); //false
//        System.out.println(b == c); //false
//        System.out.println(b != c); //true

        //논리 연산자: and, or, not
        // &&[and], ||[or], ![not]
        // &&: 모두 true 이면 true
        // ||: 하나라도 true 이면 true

//        boolean m = true;
//        boolean n = false;
//        System.out.println(m && n); //false
//        System.out.println(m || n); //true
//        System.out.println(!n); //true

        //대입 연산자
        // =, +=, -=, *=, /=
        int h = 10;
        //h = h+5;
        h += 5; //15
        h *= 3; //45
        h -= 20; //25

        //삼항 연산자
        //조건 ? 참 : 거짓
        int i = 30;
        int j = 35;
        String result = i > j ? "아메리카노" : "라떼";
        System.out.println(result);

    }
}
