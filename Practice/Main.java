class Employee {
    int salary = 30000;

    void displaySalary() {
        System.out.println("Employee salary: " + salary);
    }}
class Manager extends Employee {
    int salary = 50000;

    @Override
    void displaySalary() {
        System.out.println("Manager salary: " + salary);       // child’s variable
        System.out.println("Employee salary: " + super.salary); // parent’s variable
        super.displaySalary();                                  // parent’s method
    }}
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displaySalary();
    }}