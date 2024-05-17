package Day03;

import java.util.Locale;
import java.util.Scanner;

public class StringADV {
    public static void main(String[] args) {
        String icecream = "chocolate";

        // icecream.length() - 글자수
        // icecream.charAt(3) - 3 번째 알파벳
        // icecream.substring(0, 3) - 0~2번째까지 짤라서 돌려줌
        // icecream.contains("co") - co를 갖는지(true/false)
        // icecream.indexOf("h") - "h"는 몇번째인지. 없으면 -1
        // icecream.equals("choco") - "choco"랑 똑같은지(true/false)
        // icecream.equalsIgnoreCase("CHOCOLATE") - 대소문자 상관없이 같은지(true/false)
        // icecream.toUpperCase() - 대문자화
        // icecream.toLowerCase() - 소문자화
        // icecream.replace("a", "b") - "a"를 "b"로 바꿈
        // icecream.replaceAll("a", "b") - "a"를 "b"로 모두 바꿈
        // icecream.startsWith("choco") - "choco"로 시작하는지(true/false)


//        Scanner sc = new Scanner(System.in);
//        System.out.println("비밀번호를 입력하세요.");
//        String password = sc.next();
//
//        boolean isLengthOver8 = password.length() >= 8;
//        boolean hasExclamation = password.contains("!");
//
//        String result = isLengthOver8 && hasExclamation ? "올바르게 설정했습니다." : "다시 설정해주세요.";
//        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        System.out.println("이메일를 입력하세요.");
        String email = sc.next();
        boolean hasAtmark = email.contains("@");
        boolean webName = email.contains("naver") || email.contains("gmail");
        String result = hasAtmark && webName ? "올바른 이메일" : "다시 입력";
        System.out.println(result);

        System.out.println("과일 이름을 입력하세요.");
        String fruit = sc.next();
        String result1 = fruit.length() <= 6 ? fruit.toUpperCase() : fruit.substring(0,3);
        System.out.println(result1);
    }
}
