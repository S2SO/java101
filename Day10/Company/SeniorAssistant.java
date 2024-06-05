package Day10.Company;

public class SeniorAssistant extends Worker{
    private double hourlyRate = 1;

    public SeniorAssistant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double pay() {
        return super.getSalary()*this.hourlyRate;
    }
}
