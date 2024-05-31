package Day08;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie[] movies = new Movie[10];
        int movieCount = 0;
//        movies[movieCount++] = new Movie("IT코리아 영화",8000);

        Beverage[] beverages = new Beverage[10];
        int beverageCount = 0;
        beverages[beverageCount++] = new Beverage("콜라",2000);

        while (true){
            System.out.println("CGV 판매 프로그램");
            System.out.println("1.영화 구매\n2.음료 구매\n3.영화 추가\n4.음료 추가\n5.종료");
            int code = sc.nextInt();

            switch (code){
                case 1:
                    for (int i=0; i<movieCount; i++){
//                    System.out.println(i+". "+ movies[i].name + " " + movies[i].price + "원" );
                    }
                    System.out.print("번호 선택: ");
                    int movieNumber = sc.nextInt();
                    System.out.print("인원수: ");
                    int people = sc.nextInt();
//                    System.out.println(movies[movieNumber].name + " 영화가 " + people + "개 판매");
//                    System.out.println("총 금액: "+ movies[movieNumber].price * people + "원");
                    break;
                case 2:
                    for (int i=0; i<beverageCount; i++){
                        System.out.println(i+". "+ beverages[i].name + " " + beverages[i].price + "원" );
                    }
                    System.out.print("번호 선택: ");
                    int beverageNumber = sc.nextInt();
                    System.out.print("개수: ");
                    int amount = sc.nextInt();
                    System.out.println(beverages[beverageNumber].name + " 음료가 " + amount + "개 판매");
                    System.out.println("총 금액: "+ beverages[beverageNumber].price * amount + "원");
                    break;
                case 3:
                    System.out.println("영화 제목: ");
                    String movieName = sc.nextLine();
                    System.out.println("영화 가격: ");
                    int moviePrice = sc.nextInt();
//                    movies[movieCount++] = new Movie(movieName,moviePrice);
                    System.out.println("등록 완료");

                case 4:
                    System.out.println("음료 이름: ");
                    String beverageName = sc.nextLine();
                    System.out.println("음료 가격: ");
                    int beveragePrice = sc.nextInt();
//                    movies[movieCount++] = new Movie(beverageName,beveragePrice);
                    System.out.println("등록 완료");

                case 5:
                    System.out.println("프로그램 종료");
                    break;

                default:
                    System.out.println("다시 입력해주세요");
                    break;
            }
            if (code==5) break;
        }
    }
}
