import java.util.List;

public class Instructor extends Employee{


    public Instructor() {
    }


    public Instructor(String name, String cpr) {
        super(name, cpr);
    }

    public Instructor(int hours, int salary) {
        super(hours, salary);
    }

    public Instructor(String name, String cpr, int hours/*, int salary*/) {
        super(name, cpr, hours);
        super.salary = 456;
    }

    public static void printOut(List e){
        for(Object s : e) {
            System.out.println(s);
        }

    }

    public int getSalary() {
        return salary * super.getHours();
    }

    @Override
    public String toString() {
        return name + "\t\t" + cpr + "\t\t" + hours + "\t\t\t" + getSalary();
    }
}
