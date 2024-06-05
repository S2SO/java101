package Day10.Company;

public class Assistant extends Worker{
    private double hourlyRate = 0.9;

    public Assistant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double pay() {
        return super.getSalary()*this.hourlyRate;
    }
}
