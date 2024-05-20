package Day04;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        //Token[최소한의 단위] = 123 int string
        //Operator: 산술, 논리, 대입, 비교, 삼항, ...
        //"hello".~~~() [문자열을 가공하는 기능]

        Scanner sc = new Scanner(System.in);
        System.out.println("비밀번호 설정: ");
        String pw = sc.next();
        boolean hasSpecialChar = pw.contains("!") || pw.contains("#") || pw.contains("$");
        boolean startsWithIT = pw.startsWith("IT") || pw.startsWith("it");
        boolean isValidLength = 8 <= pw.length() && pw.length() <= 20;
        String passOrNot = hasSpecialChar && startsWithIT && isValidLength ? "완료!" : "실패!";
        System.out.println("비밀번호 설정 " + passOrNot);

    }
}
