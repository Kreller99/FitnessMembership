import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        List<Person> m = new ArrayList<>();
        m.add(new FitnessMember("Hans Inge", "123456-7890", false));
        m.add(new FitnessMember("Inger Støjberg", "310878-2442", true));
        m.add(new FitnessMember("Christian Haugaard", "120799-1733", false));
        m.add(new FitnessMember("Michael Petersen", "060487-2357", true));
        m.add(new FitnessMember("Daniel Petersen", "160388-1323", true));

        List<Person> e = new ArrayList<>();
        e.add(new Instructor("Peter Ingemann", "132456-7890",20));
        e.add(new Administration("Peter Nielsen", "152346-7890", true));

        Main.intro(m,e);

    }

    public static void intro(List m, List e) throws FileNotFoundException {
        System.out.println("\n\nWelcome to Fitness Terminal!");
        System.out.println("Which type of persons would you like to view?");
        System.out.println("");
        System.out.println("1. Members\n2. Employee\n3. View All People");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int cat = sc.nextInt();
        switch (cat) {
            case 1:
                Main.memberMenu(m);
                break;

            case 2:
                Main.employeeMenu(e);
                break;

            case 3:
                Main.allPersons(e, m);
                break;

        }



    }

    public static void memberMenu(List m) throws FileNotFoundException {
        FitnessMember.printOut(m);

        /*System.out.println("Name\t\t\t\tCPR\t\t\t\tMemberType\tFee");
        System.out.println("==================================================");

        //FitnessMember fitnessMember = new FitnessMember(String name, String cpr, boolean isBasic);

        for (Object s : m) {
            System.out.println(s);
        }*/
    }

    public static void employeeMenu(List e){
        Employee.printOut(e);


    }

    public static void allPersons(List e, List m){
        Person.printOut(e, m);
    }
}
