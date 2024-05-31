package Day08;

public class Member {
    private String id;
    private String pw;
    private String name;
    private String address;
    private String phone;

    void registerMember(String id, String pw, String name, String address, String phone) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
