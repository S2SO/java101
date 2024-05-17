package Day03;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("영어 점수 입력:");
//        int eg_score = sc.nextInt();
//        String passOrNot = eg_score >= 60 ? "합격" : "불합격";
//        System.out.println(passOrNot + "입니다.");
//
//        System.out.println("정수 입력:");
//        int num = sc.nextInt();
//        String result = num > 0 ? "양수" : "음수";
//        System.out.println(result + "입니다.");

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수 입력: ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 입력: ");
        int second = sc.nextInt();
        int bigger = first > second ? first : second;
        System.out.println("더 큰 수는 " + bigger + "입니다.");

        System.out.println("정수 입력: ");
        int num = sc.nextInt();
        int absNum = num >= 0 ? num : -num;
        System.out.println("절대값은 " + absNum + "입니다.");

        System.out.println("정수 입력: ");
        int num1 = sc.nextInt();
        String result = num1 % 2 == 0 ? "짝수" : "홀수";
        System.out.println(num1 + "은(는) " + result + "입니다.");
    }
}
