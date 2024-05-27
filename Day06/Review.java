package Day06;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CGV 영화 및 음료 판매 프로그램");
        while(true){
            System.out.println("1.영화 판매 \n2.음료 판매 \n3.종료");
            int codeNumber = sc.nextInt();
            switch (codeNumber){
                case 1:
                    System.out.println("1.어벤져스 2.스파이더맨 3.베트맨");
                    int movieNumber = sc.nextInt();
                    System.out.println("인원수를 입력하세요.");
                    int members = sc.nextInt();

                    String movieName = "";
                    if (movieNumber==1){
                        movieName = "어벤져스";
                    } else if (movieNumber==2) {
                        movieName = "스파이더맨";
                    } else if (movieNumber==3) {
                        movieName = "베트맨";
                    }else{
                        System.out.println("영화를 다시 선택해주세요.");
                        movieName = "오류";
                    }
                    System.out.println(movieName + " 영화 티켓 " + members + "장을 판매했습니다!");
                    break;
                case 2:
                    System.out.println("1.콜라 2.사이다 3.환타");
                    int beverage = sc.nextInt();
                    System.out.println("개수를 입력하세요.");
                    int members1 = sc.nextInt();
                    String beverageName = "";
                    if (beverage==1){
                        beverageName = "콜라";
                    } else if (beverage==2) {
                        beverageName = "사이다";
                    } else if (beverage==3) {
                        beverageName = "환타";
                    }else{
                        System.out.println("음료를 다시 선택해주세요.");
                        beverageName = "오류";
                    }
                    System.out.println(beverageName + " 음료 " + members1 + "개를 판매했습니다!");
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("다시 선택해주세요.");
                    break;
            }
            if (codeNumber==3) break;
        }


    }
}
