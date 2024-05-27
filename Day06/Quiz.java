package Day06;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] emails = new String[3];
        for (int i=0; i<3; i++){
            System.out.println("email 주소 입력: ");
            String email = sc.nextLine();
            emails[i] = email.split("@")[0];

        }

        for (int i=0; i<3; i++) {
            System.out.println(i+1 + "번째 이메일 아이디: " + emails[i]);
        }}
}
