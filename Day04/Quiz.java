package Day04;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int num = sc.nextInt();
        if (num > 0 && num % 2 == 1) {
            System.out.println("양의 홀수");
        } else if (num > 0 && (num % 2 == 0)) {
            System.out.println("양의 짝수");
        } else if (num < 0 && (num % 2 == -1)) {
            System.out.println("음의 홀수");
        }  else if (num < 0 && (num % 2 == 0)) {
            System.out.println("음의 짝수");
        } else{
            System.out.println("0입니다");
        }

        System.out.println("첫번째 정수 입력: ");
        int first = sc.nextInt();
        System.out.println("두번째 정수 입력: ");
        int second = sc.nextInt();
        System.out.println("세번째 정수 입력: ");
        int third = sc.nextInt();
        if (first > second && first > third){
            System.out.println(first);
        } else if (second > first && second > third){
            System.out.println(second);
        } else{
            System.out.println(third);
        }

        System.out.println("단어 입력: ");
        String word = sc.next();
        if (word == word.toUpperCase()){
            System.out.println(word.toLowerCase());
        } else{
            System.out.println(word.toUpperCase());
        }

        System.out.println("버스 노선 종류(1.시내버스 2.광역버스 3.마을버스): ");
        int busType = sc.nextInt();
        System.out.println("나이: ");
        int age = sc.nextInt();
        int fare = 0;
        String bus = "";
        switch (busType){
            case 1:
                bus = "시내버스";
                fare = 1200;
                break;
            case 2:
                bus = "광역버스";
                fare = 2000;
                break;
            case 3:
                bus = "마을버스";
                fare = 1000;
                break;
            default:
                bus = "오류";
                fare = 0;
                break;
        }

        if (age<=7 || age>=65){
            System.out.println(bus + "금액은 무료입니다");
        }else if (age > 8 && age<=19){
            System.out.println(bus + "금액은" + fare*0.7 + "입니다");
        }else{
            System.out.println(bus + "금액은" + fare + "입니다");
        }




//        if (busType==1){
//            String bus = "시내버스";
//            int price = 1200;
//        }else if (busType==2){
//            String bus = "광역버스";
//            int price = 2000;
//        }else if (busType==3){
//            String bus = "마을버스";
//            int price = 1000;
//        }else {
//            System.out.println("해당 버스 없음");
//        }
//
//        System.out.println(bus);
//
//        if (age<=7){
//            int ageRange = 1;
//        }else if (age<=19){
//            int ageRange = 2;
//        }else if (age>=65){
//            int ageRange = 3;
//        }else{
//            int ageRange = 4;
//        }
    }
}
