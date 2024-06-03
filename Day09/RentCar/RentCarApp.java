package Day09.RentCar;

public class RentCarApp {
    public static void main(String[] args) {
        Member member = new Member();
        Car car = new Car();
        Reserve reserve = new Reserve();

        member.registerMember("1","1234","김자바","부평역","010-1234-1234");
        car.registerCar("01가0001","모닝","황금색","2000","기아");
        reserve.reserveCar("01", car.getCarNumber(),"2024-06-03","2024-06-04","2024-06-05");

        System.out.println(reserve.checkResInfo());
    }
}
