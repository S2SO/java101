import java.util.Scanner;

public class BigToSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("대문자 <-> 소문자 프로그램");
        System.out.println("영단어 입력: ");
        String word = sc.nextLine();
        String result = "";

        // 변수 설정 ver.
        String large = word.toUpperCase();
        String small = word.toLowerCase();

        for (int i=0; i<word.length(); i++){
            String ist=word.substring(i,i+1);
            String istL=large.substring(i,i+1);
            String istS=small.substring(i,i+1);

            if (ist.equals(istL)) {
                result += istS;
            }else {
                result += istL;
            }
        }
        System.out.println(result);

        // 변수 미설정 ver.
//       for (int i=0; i<word.length(); i++){
//            if (word.substring(i,i+1).equals(word.toUpperCase().substring(i,i+1))) {
//                result += word.toLowerCase().substring(i,i+1);
//            }else {
//                result += word.toUpperCase().substring(i,i+1);
//            }
//        }
//        System.out.println(result);
        
    }
}
