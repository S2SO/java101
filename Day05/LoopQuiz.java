package Day05;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력: ");
        int n = sc.nextInt();
        for (int i=0; i<=n; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        int sum = 0;
        System.out.println("정수 입력: ");
        int m = sc.nextInt();
        for (int i=0; i<=m; i++){
            sum = sum + i;
        }
        System.out.println("0부터 " + m + "까지의 합: " + sum);

        System.out.println("단어 입력: ");
        String word = sc.next();
        System.out.println("정수 입력: ");
        int l = sc.nextInt();
        String newWord = "";
        for (int i=1; i<=l; i++){
            //newWord = newWord + word + i;
            newWord += word + i;
        }
        System.out.println(newWord);

        System.out.println("정수 입력: ");
        int k = sc.nextInt();
        for (int i=1; i<=9; i++){
            System.out.println(k+"*"+i+"="+k*i);
        }

    }
}
