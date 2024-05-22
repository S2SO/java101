package Day05;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //for문
//        for (int i = 0; i < 5; i++) {
//            System.out.println("i는 " + i);
//            System.out.println("meow");
//        }

        for (int i = 0; i<=100; i++) {
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("n 입력: ");
        int n = sc.nextInt();
        for (int i = 0; i<=n; i++){
            System.out.println(i);
        }

        System.out.println("m 입력: ");
        int m = sc.nextInt();
        System.out.println("l 입력: ");
        int l = sc.nextInt();
        for (int i = m; i<=l; i++){
            System.out.println(i);
        }
    }
}
