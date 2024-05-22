package Day04;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int num = sc.nextInt();
        if (num>0 && num%2==1){
            System.out.println("양의 홀수입니다.");
        } else if (num>0 && num%2==0) {
            System.out.println("양의 짝수입니다.");
        } else if (num<0 && num%2==-1) {
            System.out.println("음의 홀수입니다.");
        } else if (num<0 && num%2==0) {
            System.out.println("음의 짝수입니다.");
        }else {
            System.out.println("0입니다.");
        }

        System.out.println("첫 번째 정수 입력: ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 입력: ");
        int second = sc.nextInt();
        System.out.println("세 번째 정수 입력: ");
        int third = sc.nextInt();
        if (first>=second && first>=third){
            System.out.println("가장 큰 수: " + first);
        } else if (second>=first && second>=third) {
            System.out.println("가장 큰 수: " + second);
        } else {
            System.out.println("가장 큰 수: " + third);
        }

        System.out.println("영단어 압력: ");
        String word = sc.next();
        if (word == word.toLowerCase()){
            System.out.println(word.toUpperCase());
        }else {
            System.out.println(word.toLowerCase());
        }

        System.out.println("버스 노선 종류 입력(1.시내버스 2.광역버스 3.마을버스): ");
        int busType = sc.nextInt();
        String bus = "";
        double fare = 0;
        switch (busType){
            case 1:
                bus = "시내버스";
                fare = 1400;
                break;
            case 2:
                bus = "광역버스";
                fare = 2000;
                break;
            case 3:
                bus = "마을버스";
                fare = 1000;
            default:
                bus = "*오류(버스 노선 종류를 다시 입력해주세요.)";
        }

        System.out.println("나이 입력: ");
        int age = sc.nextInt();
        if (age<=7 || age>=65) {
            System.out.println(age + "살의 " + bus + "가격은 무료입니다.");
        } else if (8<=age && age<=19) {
            System.out.println(age + "살의 " + bus + " 가격은 " + fare*0.7 + "원입니다.");
        }else {
            System.out.println(age + "살의 " + bus + " 가격은 " + fare + "원입니다.");
        }


    }
}
