package Day06;

import java.util.Locale;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] menus = new String[5];
//        for (int i=0; i< menus.length; i++){
//            System.out.print("커피 메뉴 입력: ");
//            menus[i] = sc.next();
//        }
//
//        for (int i=0; i< menus.length; i++){
//            System.out.println(i+1 + "번째 커피 메뉴: " + menus[i].toUpperCase());
//        }

        //next() : 단어 단위
        //nextLine() : 문장

        Scanner sc = new Scanner(System.in);
        String[] menus = new String[5];
        for (int i=0; i< menus.length; i++){
            System.out.println("커피 이름과 가격 입력(ex. 아메리카노 5000): ");
            menus[i] = sc.nextLine();
        }

int sum = 0;
        for (int i=0; i< menus.length; i++){
            System.out.println(i+1 + "번째 커피: "+ menus[i] + "원");
            sum += Integer.parseInt(menus[i].split(" ")[1]);
        }
        double adv = (double) sum/ menus.length;
        System.out.println("가격 평균: " + adv);
    }
}
