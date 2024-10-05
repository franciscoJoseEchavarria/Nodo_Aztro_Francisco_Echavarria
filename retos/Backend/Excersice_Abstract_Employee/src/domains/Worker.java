package domains;

import Abstract.Employee;

public class Worker extends Employee {

    double hourlyRate;
    double hoursWorked;

    public Worker(String name, int age, String gender, double hourlyRate, double hoursWorked) {
        super(name, age, gender);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double getCalculateSalary() {
        return this.hourlyRate*this.hoursWorked;
    }

    @Override
    public void getDisplayEmployeeDetails() {
        System.out.println("getName() = " + super.getName());
        System.out.println("super.getAge() = " + super.getAge());
        System.out.println("super.getGender() = " + super.getGender());
        System.out.println("this.hourlyRate = " + this.hourlyRate);
        System.out.println("this.hoursWorked = " + this.hoursWorked);
        System.out.println("this.getCalculateSalary() = " + this.getCalculateSalary());
    }
}
