package Day09.RentCar;

public class Member {
    private String id;
    private String pw;
    private String name;
    private String address;
    private String phoneNum;

    public void registerMember(String id, String pw, String name, String address, String phone) {
        System.out.println("고객 정보를 등록합니다.");
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String checkMemberInfo (){
        System.out.println("고객 정보를 조회합니다.");
        System.out.println("-------------------");
        String memberInfo = "아이디: " + this.id
                + "\n비밀번호: " + this.pw
                + "\n이름: " + this.name
                + "\n주소: " + this.address
                + "\n전화번호: " + this.phoneNum;
        return memberInfo;
    }
}
