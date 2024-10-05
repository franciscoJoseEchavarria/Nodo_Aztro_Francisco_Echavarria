import Abstract.Employee;
import domains.Manager;
import domains.SalesPerson;
import domains.Worker;

public class Main {
    public static void main(String[] args) {

        Employee manager = new Manager("juan", 25, "Masculino", 3000, 2000);
        Employee worker = new Worker("pedro", 40, "Masculino", 180, 30);
        Employee salesPersona = new SalesPerson("ana maria", 30, "femenino", 3000, 1000, 0.7);

        System.out.println("manager = " + worker);
        System.out.println(" ***** ");
        worker.getDisplayEmployeeDetails();
        System.out.println(" ***** ");
        salesPersona.getDisplayEmployeeDetails();


    }
}