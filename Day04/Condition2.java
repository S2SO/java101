package Day04;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        //switch
//        int num = 2;
//        switch (num){
//            case 1:
//                System.out.println("1번 선택");
//                break;
//            case 2:
//                System.out.println("2번 선택");
//                break;
//            case 3:
//                System.out.println("3번 선택");
//                break;
//            default:
//                System.out.println("해당 번호 없음");
//                break;
//        }
//
//        String food = "돈까스";
//        switch (food){
//            case "돈까스":
//                System.out.println("돈까스 선택");
//                break;
//            case "마라탕":
//                System.out.println("마라탕 선택");
//                break;
//            case "초밥":
//                System.out.println("초밥 선택");
//                break;
//            default:
//                System.out.println("해당 음식 없음");
//                break;
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("요일 입력: ");
        String dayOfWeek = sc.next();
        switch (dayOfWeek){
            case "월요일":
                System.out.println("노잼 요일");
                break;
            case "화요일":
                System.out.println("나름 노잼 요일");
                break;
            case "수요일":
                System.out.println("슬슬 지칠 요일");
                break;
            case "목요일":
                System.out.println("슬슬 기분 좋을 요일");
                break;
            case "금요일":
                System.out.println("^~^");
                break;
            default:
                System.out.println("해당 요일 없음");
                break;
        }

    }
}
