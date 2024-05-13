package Day02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
//        Scanner a = new Scanner(System.in);
//        System.out.println("프로그램 시작");
//        String text = a.next();
//        System.out.println("입력한 글은 "+text);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("당신의 이름은?");
//        String name = sc.next();
//        System.out.println("당신의 나이은?");
//        String age = sc.next();
//        System.out.println("당신의 MBTI은?");
//        String mbti = sc.next();
//        System.out.println("당신의 이름은 " + name + ", 나이는 " + age + ", MBTI는 " + mbti);

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 입력");
        int second = sc.nextInt();
        System.out.println("두 수의 합: " + (first+second));
        System.out.println("두 수의 차: " + (first-second));
        System.out.println("첫 번째의 제곱: " + (first*first));
        System.out.println("두 번째의 제곱: " + (second*second));

    }
}
