package Day07;

import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
//        int arr[][] = new int[3][3];
//        int[][] arr2 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println(arr2[1][2]); //6
//
//        for (int i=0; i<arr2.length; i++){
//            for (int j=0; j<arr2[i].length; j++){
//                System.out.println(i+1 + "번째 배열 " + (j+1) + "번째 숫자: " + arr2[i][j]);
//            }
//        }

        Scanner sc = new Scanner(System.in);

//        String menus[][] = new String[2][3];
//        for (int i=0; i<menus.length; i++){
//            for (int j=0; j<menus[i].length; j++){
//                if (i==0){
//                    System.out.print(j+"번째 빵 입력: ");
//                    menus[0][j] = sc.nextLine();
//                }else {
//                    System.out.print(j+"번째 커피 입력: ");
//                    menus[1][j] = sc.nextLine();
//                }
//            }
//        }
//
//        for (int i=0; i<menus.length; i++){
//            for (int j=0; j<menus[i].length; j++){
//                if (i==0){
//                    System.out.println(j+"번째 빵: " + menus[i][j]);
//                }else {
//                    System.out.println(j+"번째 커피: " + menus[i][j]);
//                }
//            }
//        }

        int[][] scores = new int[4][3];
        String[] course = {"C언어","java","python"};
        for (int i=0; i<scores.length; i++){
            for (int j=0; j<scores[i].length; j++){
                System.out.print((i+1)+"번째 학생의 "+course[j]+" 시험 점수 입력: ");
                scores[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i=0; i<scores.length; i++) sum += scores[i][1];
        System.out.println("java 점수 평균: " + (double)sum/scores.length);


        float a = 3.14f;









//        for (int i = 0; i < menus[0].length; i++) {
//            System.out.println(i + 1 + "번째 빵 입력: ");
//            menus[0][i] = sc.nextLine();
//        }
//        for (int i = 0; i < menus[1].length; i++) {
//            System.out.println(i + 1 + "번째 커피 입력: ");
//            menus[1][i] = sc.nextLine();
//        }
//
//        String bread = "";
//        for (int i = 0; i < menus[0].length; i++) {
//            bread += menus[0][i] + " ";
//        }
//        System.out.println("빵 메뉴: "+bread);
//        String coffee = "";
//        for (int i = 0; i < menus[1].length; i++) {
//            coffee += menus[1][i] + " ";
//        }
//        System.out.println("커피 메뉴: "+coffee);
    }
}
