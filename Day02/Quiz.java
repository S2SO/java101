package Day02;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇년생인가요?");
        int birth = sc.nextInt();
        System.out.println((2025-birth) + "살이군요!");

        System.out.println("정삼각형의 밑변은?");
        int base = sc.nextInt();
        System.out.println("정삼각형의 높이은?");
        int height = sc.nextInt();
        System.out.println("정삼각형의 넓이는 " + ((base*height)/2));

        System.out.println("정사각형의 한 변은?");
        int side = sc.nextInt();
        System.out.println("정사각형의 넓이는 " + (side*side));

        System.out.println("원화를 입력하세요.");
        int won = sc.nextInt();
        System.out.println((won*0.1139)+"엔");
    }
}
