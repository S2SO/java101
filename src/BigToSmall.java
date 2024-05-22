import java.util.Scanner;

public class BigToSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("대문자 <-> 소문자 프로그램");
        System.out.println("영단어 입력: ");
        String word = sc.next();

        int length = word.length();
        String large = word.toUpperCase();
        String small = word.toLowerCase();
        String result = "";

        for (int i=0; i<length; i++){
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
    }
}
