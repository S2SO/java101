package Day09.RentCar;

public class Car {
    private String carNumber;
    private String carName;
    private String carColor;
    private String carSize;
    private String carMaker;


    public void registerCar(String carNumber, String carName, String carColor, String carSize, String carMaker){
        System.out.println("차 정보를 등록합니다.");
        this.carNumber = carNumber;
        this.carName = carName;
        this.carColor = carColor;
        this.carSize = carSize;
        this.carMaker = carMaker;
    }

    public String checkCarInfo(){
        System.out.println("렌터카 정보를 조회합니다.");
        System.out.println("---------------------");
        String carInfo = "차 번호: " + this.carNumber
                + "\n차 이름: " + this.carName
                + "\n차 색상: " + this.carColor
                + "\n차 크기: " + this.carSize
                + "\n차 제조사: " + this.carMaker;
        return carInfo;
    }

    public String getCarNumber() {
        return carNumber;
    }
}
