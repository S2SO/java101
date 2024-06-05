package Day10.Company;

public class Intern extends Worker {
    private double hourlyRate = 0.8;

    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double pay() {
        return super.getSalary()*this.hourlyRate;
    }
}
