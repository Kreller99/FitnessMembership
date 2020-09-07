import java.util.List;

public class Person {
    public String name;
    public String cpr;

    public Person(){

    }

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public static void printOut(List e, List m){
        System.out.println("Name\t\t\t\tCPR");
        System.out.println("================================");
        for(Object s : e) {
            System.out.println(s);
        }.
        for(Object s : m){
            System.out.println(s);
        }
    }



    @Override
    public String toString(){
        return name + "\t\t" + cpr;
    }
}
