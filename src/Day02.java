import java.util.Scanner;

public class Day02 {
        public static void main(String[] args) {
            //int 정수
            //double 실수
            //char 문자
            //String 문자열
            //boolean 논리(true/false)

            //Scanner sc = new Scanner(System.in) : '새로운' 스캐너 받겠다. 여러개 입력해도 이건 하나만 써도 ok
            //int a = sc.nextInt() : 변수선언. 지금 입력하는 정수int를 a에 저장하겠다
            //String a = sc.next() 또는 sc.nextLine() : 지금 입력하는 문자열String을 a에 저장하겠다
            //스캐너 선언할 떄 이름은 보통 sc로 함.

            Scanner sc = new Scanner(System.in);
            System.out.println("몇년생이신가요?");
            int birth = sc.nextInt();
            System.out.println((2025-birth) + "살이시군요!");

            System.out.println("직각삼각형의 밑변은?");
            int base = sc.nextInt();
            System.out.println("직각삼각형의 높이는?");
            int height = sc.nextInt();
            System.out.println("직각삼각형의 넓이는 " + ((base*height)/2));

            System.out.println("정사각형의 높이는?");
            int side = sc.nextInt();
            System.out.println("정사각형의 넓이는 " + (side*side));

            System.out.println("원화를 입력하시오.");
            int won = sc.nextInt();
            System.out.println((won*0.1139) + "엔");
        }
}
