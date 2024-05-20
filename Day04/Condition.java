package Day04;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        //if문
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if (num > 0){
//            System.out.println(num + "는 양수입니다");
//        }
//        System.out.println("프로그램 끝");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 1){
            System.out.println("홀수입니다.");
        }
        System.out.println("프로그램 끝");

        String word = sc.next();
        if (word.contains("a")){
            System.out.println(word + "에 'a'가 포함되네요.");
        }
        System.out.println("프로그램 끝");
    }
}
