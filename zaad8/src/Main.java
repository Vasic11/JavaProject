//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Franziska Waltraud","HR Manager", 40000);
        Employee employee2 = new Employee("Hubertus Andrea","Software Engineer", 60000);
        System.out.println("Employee Details: ");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        employee1.raiseSalary(8);
        employee2.raiseSalary(12);

        System.out.println("After raising salary: ");
        System.out.println("8% for 'Franziski Waltraud':");
        employee1.printEmployeeDetails();
        System.out.println("12% for 'Huberts Andrea':");
        employee2.printEmployeeDetails();
    }
}