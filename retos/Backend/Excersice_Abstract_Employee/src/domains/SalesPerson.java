package domains;

public class SalesPerson extends Manager {

    double comissionRate;

    public SalesPerson(String name, int age, String gender, double baseSalary, double bonus, double comissionRate) {
        super(name, age, gender, baseSalary, bonus);
        this.comissionRate = comissionRate;
    }

    public double getTotalSalary(){
        return getCalculateSalary() * this.comissionRate; 
    }
    
    @Override
    public double getCalculateSalary() {
        return super.getCalculateSalary();
    }

    @Override
    public void getDisplayEmployeeDetails() {
        super.getDisplayEmployeeDetails();

        System.out.println("comissionRate = " + comissionRate);
        System.out.println("this.getTotalSalary() = " + this.getTotalSalary());
    }
}
