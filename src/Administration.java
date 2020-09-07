import java.util.List;

public class Administration extends Employee{
    public boolean Vacation;

    public Administration(boolean vacation) {
        this.Vacation = vacation;
    }

    public Administration(String name, String cpr, boolean vacation) {
        super(name, cpr);
        this.Vacation = vacation;
    }

    public Administration(int hours, int salary, boolean vacation) {
        super(hours, salary);
        this.Vacation = vacation;
    }

    public Administration(String name, String cpr, int hours, int salary, boolean vacation) {
        super(name, cpr, hours, salary);
        this.Vacation = vacation;
    }

    public Administration(String name, String cpr, int hours, boolean vacation) {
        super(name, cpr, hours);
        this.Vacation = vacation;
    }

    public String getVacation(){
        if(Vacation){
            return "5";
        }
        else{
            return "";
        }
    }

    public static void printOut(List e){
        for(Object s : e) {
            System.out.println(s);
        }

    }


    @Override
    public String toString() {
        return name + "\t\t" + cpr + "\t\t" + 37 + "\t\t\t" + 23000 + "\t\t" +
                getVacation();
    }

}
