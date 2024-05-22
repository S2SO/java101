package Day05;

public class DoubleLoop {
    public static void main(String[] args) {
//        for(int i=0; i<10; i++){
//            for (int j=0; j<10; j++){
//                System.out.println("i: "+i+"j: "+j);
//            }
//        }

        for(int i=2; i<=9; i++){
            for (int j=1; j<=9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }

    }
}
