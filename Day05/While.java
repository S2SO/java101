package Day05;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

//        int a = 0;
//        while (a<10){
//            System.out.println("수업ㅇㅇㄹㅇ");
//            //끝내는 법
//            //1번 a++;
//            //2번 a++;
//            // if(a==7) break;
//        };

        Scanner sc = new Scanner(System.in);

                System.out.println("사칙연산 프로그램 시작");
        while(true){
            boolean isSystemOff = false;

            System.out.println("첫번째 정수 입력");
            int num1 = sc.nextInt();
            System.out.println("두번째 정수 입력");
            int num2 = sc.nextInt();
            System.out.println("원하는 결과를 누르세요.");
            System.out.println("0.프로그램 종료 1.더하기 프로그램 2.빼기 프로그램 3.곱셈 프로그램 4.제곱 프로그램 5.나누기 프로그램 6.나머지 프로그램 ");
            int programNumber = sc.nextInt();
            int result = 1;
            switch (programNumber){
                case 0:
                    isSystemOff = true;
                    break;
                case 1:
                    result = num1 + num2;
                    System.out.println("합: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("차: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("곱: " + result);
                    break;
                case 4:
                    for (int i=1; i<=num2; i++){
                        result*=num1;
                    }
                    System.out.println("제곱: " + result);
                    break;
                case 5:
                    result = num1 / num2;
                    System.out.println("나누기: " + result);
                    break;
                case 6:
                    result = num1 % num2;
                    System.out.println("나머지: " + result);
                    break;
                default:
                    System.out.println("다시 입력하세요.");
                    break;
            }
            if (isSystemOff) break;
        }
        System.out.println("프로그램을 종료합니다");



    }
}
