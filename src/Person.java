import java.util.ArrayList;
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
        List<Person> p = new ArrayList<>();

        p.addAll(m);
        p.addAll(e);
        System.out.println("Name\t\t\t\tCPR");
        System.out.println("================================");
        for(int i = 0; i < p.size(); i++){
            System.out.println(p.get(i).name + "\t\t" + p.get(i).cpr);
        }



/*
        System.out.println("Name\t\t\t\tCPR");
        System.out.println("================================");
        for(Object s : e) {
            System.out.println(s);
        }
        for(Object s : m){
            System.out.println(s);
        }*/
    }



    @Override
    public String toString(){
        return name + "\t\t" + cpr;
    }
}
