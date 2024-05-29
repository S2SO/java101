package Day07;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] fruits = new String[5];
        for (int i=0; i<fruits.length; i++){
            System.out.println("좋아하는 과일 입력(영문): ");
            String fruit = sc.nextLine();
            fruits[i] = fruit.toUpperCase();
        }
        for (int i=0; i<fruits.length; i++){
            System.out.println(i+1 + "번째 과일: " + fruits[i]);
        }

        int[] arr = new int[5];
        for (int i=0; i<arr.length; i++){
            System.out.print("정수 입력: ");
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr.length-i + "번째 정수: " + arr[arr.length-1-i]);
        }

        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("정수 입력: ");
            arr1[i] = sc.nextInt();
        }
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) max = arr1[i];
        }
        System.out.println("가장 큰 수: " + max);

//        int[] arr2 = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("정수 입력: ");
//            numbers2[i] = sc.nextInt();
//        }
//        //54321
//        int small[] = new int[5];
//        for (int i = 0; i < 4; i++) {
//            if (arr2[i] < arr2[i + 1] && ) {
//
//            }
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(small[i]);
//        }

    }
}