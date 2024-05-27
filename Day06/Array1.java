package Day06;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
//        int[] engScores = new int[5];
//        engScores[0] = 60;
//        engScores[1] = 70;
//        engScores[2] = 60;
//        engScores[3] = 70;
//        engScores[4] = 90;
//
//        int[] eng_scores = {60, 70, 60, 70, 90};
//        for (int i=0; i < eng_scores.length; i++){
//            System.out.println(i+1 + "번째 학생 점수: "+eng_scores[i]);
//        }

        Scanner sc = new Scanner(System.in);
        int[] math_scores = new int[10];

        for (int i=0; i< math_scores.length; i++){
            System.out.println(i+1+"번째 학생의 수학점수: ");
            int math_score = sc.nextInt();
            math_scores[i] = math_score;
        }
        int sum = 0;
        for (int i=0; i< math_scores.length; i++){
            System.out.println(i+1 + "번째 학생의 수학점수: " + math_scores[i]);
            sum += math_scores[i];
        }
        double avg = (double) sum / math_scores.length;
        System.out.println("평균: " + avg + "점입니다.");

    }
}
