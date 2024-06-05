package Day10.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Intern kim = new Intern("kim",2700);
        Assistant lee = new Assistant("lee",3300);
        SeniorAssistant park = new SeniorAssistant("park",3600);

        System.out.println(kim.pay());

    }
}
