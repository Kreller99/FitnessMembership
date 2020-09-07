import java.util.List;

public class Employee extends Person{
    public int hours;
    public int salary;

    public Employee(){
    }

    public Employee(String name, String cpr){
        super(name, cpr);
    }

    public Employee(int hours, int salary) {
        this.hours = hours;
        this.salary = salary;
    }

    public Employee(String name, String cpr, int hours, int salary) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }

    public Employee(String name, String cpr, int hours) {
        super(name, cpr);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void printOut(List e){
        System.out.println("Name\t\t\t\tCPR\t\t\t\tHours\t\tSalary\t\tVacation");
        System.out.println("============================================================================");
        for(Object s : e) {
            System.out.println(s);
        }

    }

}
