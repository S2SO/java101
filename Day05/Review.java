package Day05;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키(cm)를 입력하세요");
        double height = sc.nextDouble();
        System.out.println("몸무게(kg)를 입력하세요");
        double weight = sc.nextDouble();

        double bmi = weight / (height*height*0.0001);
        System.out.println(bmi);
        if (bmi<18.5){
            System.out.println("저체중입니다.");
        } else if (bmi>=18.5 && bmi<25) {
            System.out.println("정상 체중입니다.");
        } else if (bmi>=25 && bmi<30) {
            System.out.println("과체중입니다.");
        } else{
            System.out.println("비만입니다.");
        }


        System.out.println("메뉴를 입력해주세요.(1. 아메리카노-4000원 2.카페라떼-4500원 3.카푸치노-5000원) ");
        int menu = sc.nextInt();

        int coffeeprice = 0;
        switch (menu){
            case 1:
                coffeeprice = 4000;
                break;
            case 2:
                coffeeprice = 4500;
                break;
            case 3:
                coffeeprice = 5000;
                break;
            default:
                System.out.println("메뉴를 다시 입력해주세요.");
                break;
        }

        System.out.println("수량을 입력해주세요.");
        int amount = sc.nextInt();
        System.out.println("멤버십 카드 보유 여부(1.예 2.아니오): ");
        int membership = sc.nextInt();

        boolean isMember = membership==1;
        double totalPrice = coffeeprice * amount * (isMember ? 0.9 : 1);
        System.out.println("총 가격: " + totalPrice + "원");

//        switch (membership){
//            case 1:
//                System.out.println("총 가격은 " + (coffeeprice*amount)*0.9 + "원 입니다.");
//                break;
//            case 2:
//                System.out.println("총 가격은 " + coffeeprice*amount + "원 입니다.");
//                break;
//            default:
//                System.out.println("멤버십 카드 보유 여부를 다시 입력해주세요.");
//        }

    }
}
