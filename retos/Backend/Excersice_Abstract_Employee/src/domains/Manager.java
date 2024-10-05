package domains;

import Abstract.Employee;

import javax.xml.namespace.QName;

public class Manager extends Employee {

    double baseSalary;
    double bonus;

    //Constructor

    public Manager (String name, int age, String gender, double baseSalary, double
                    bonus){
        super (name, age, gender);
        this.baseSalary=baseSalary;
        this.bonus =bonus;

    }

    //Metodos

    @Override
    public double getCalculateSalary() {
        return this.baseSalary+this.bonus;
    }

    @Override
    public void getDisplayEmployeeDetails( ) {
        System.out.println("nombre = " + super.getName());
        System.out.println("edad " + this.getAge());
        System.out.println("genero() = " + super.getGender());
        System.out.println("baseSalary = " + this.baseSalary);
        System.out.println("bonus = " + this.bonus);
        System.out.println("salario total = " + getCalculateSalary());
    }

}
