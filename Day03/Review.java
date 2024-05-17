package Day03;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이 몇 살?");
        int age = sc.nextInt();
        int birth = 2025-age;
        System.out.println("당신은 "+ birth +"년생이군요");

        System.out.println("반지름 입력:");
        int radius = sc.nextInt();
        double area = (3.14*radius*radius);
        System.out.println("원의 넓이는 " + area + "입니다.");
    }
}
