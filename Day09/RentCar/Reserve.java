package Day09.RentCar;

public class Reserve {
    private String resNumber;
    private String resCarNumber;
    private String resDate;
    private String useBeginDate;
    private String useEndDate;



    public String checkResInfo(){
        System.out.println("예약 정보를 조회합니다.");
        System.out.println("---------------------");
        String reserveInfo = "예약 번호: " + this.resNumber
                + "\n예약 차 번호: " + this.resCarNumber
                + "\n예약 일자: " + this.resDate
                + "\n차 이용 시작 일자: " + this.useBeginDate
                + "\n차 반납 예정 일자: " + this.useEndDate;
        return reserveInfo;
    }

    public void reserveCar(String resNumber, String resCarNumber, String resDate, String useBeginDate, String useEndDate) {
        System.out.println("렌터카를 예약합니다.");
        this.resNumber = resNumber;
        this.resCarNumber = resCarNumber;
        this.resDate = resDate;
        this.useBeginDate = useBeginDate;
        this.useEndDate = useEndDate;
    }

}
