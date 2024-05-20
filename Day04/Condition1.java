package Day04;

import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {
        //is ~ else
//        int num = 0;
//
//       if (num > 0){
//           System.out.println("양수입니다");
//       } else if (num==0) {
//           System.out.println("0입니다");
//       } else{
//           System.out.println("음수입니다");
//       }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("영어 점수는?");
//        int engScore = sc.nextInt();
//        if (engScore >= 90){
//            System.out.println("A");
//        } else if (engScore>=80) {
//            System.out.println("B");
//        } else if (engScore>=70) {
//            System.out.println("C");
//        }else{
//            System.out.println("과락");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("x 입력: ");
//        int x = sc.nextInt();
//        System.out.println("y 입력: ");
//        int y = sc.nextInt();
//        if (x>0 && y>0){
//            System.out.println("제1사분면");
//        } else if (x<0 && y>0) {
//            System.out.println("제2사분면");
//        } else if (x<0 && y<0) {
//            System.out.println("제3사분면");
//        } else if (x>0 && y<0){
//            System.out.println("제4사분면");
//        }else if (x==0 && y==0){
//            System.out.println("원점");
//        }else if (y==0){
//            System.out.println("x축 위에 존재");
//        }else{
//            System.out.println("y축 위에 존재");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("비밀번호 설정:");
        String pw = sc.next();
        boolean isValidLength = pw.length()>=10;
        boolean hasSpecialChar = pw.contains("!") || pw.contains("@") || pw.contains("#") || pw.contains("$");
        boolean startWithApple = pw.startsWith("apple");
        if (!isValidLength){
            System.out.println("10글자 이상 작성하세요.");
        } else if (!hasSpecialChar) {
            System.out.println("반드시 !@#$를 포함해야 합니다");
        } else if (!startWithApple){
            System.out.println("반드시 apple로 시작해야 합니다.");
        }else {
            System.out.println("올바른 비밀번호를 설정하였습니다.");
        }

        System.out.println("구매 가격:");
        int price = sc.nextInt();
        if (price >= 200000){
            System.out.println("할인된 가격: " + price*0.8 + "원");
        }else if(price >= 10000){
            System.out.println("할인된 가격: " + price*0.9 + "원");
        }else if(price >= 5000){
            System.out.println("할인된 가격: " + price*0.95 + "원");
        }else{
            System.out.println("할인 적용 안 됨");
        }

    }
}
