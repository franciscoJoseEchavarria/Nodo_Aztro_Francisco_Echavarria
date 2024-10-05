package Abstract;

abstract public class Employee {
    //Atributos
    private String name;
    private int age;
    private String gender;

    //Constructor

    public Employee (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    //Metodos

    public abstract double getCalculateSalary();

    public abstract void getDisplayEmployeeDetails();

    //Metodos getter en setter


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
