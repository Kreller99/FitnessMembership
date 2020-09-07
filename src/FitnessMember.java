import java.sql.SQLOutput;
import java.util.List;

public class FitnessMember extends Person{
    private boolean isBasic;

    public boolean isBasic() {
        return isBasic;
    }

    public void setBasic(boolean basic) {
        isBasic = basic;
    }

    public FitnessMember(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public String getMemberType(){
        if(isBasic){
            return "Basic";
        }
        else{
            return "Full";
        }
    }

    public int monthlyFee(){
        if(isBasic){
            return 199;
        }
            else{
                return 299;
        }
    }

    public static void printOut(List m){
        System.out.println("Name\t\t\t\tCPR\t\t\t\tMemberType\tFee");
        System.out.println("==================================================");
        for(Object s : m) {
            System.out.println(s);
        }

    }


    @Override
    public String toString() {
        return name + "\t\t" + cpr + "\t\t" + getMemberType() + "\t\t\t" + monthlyFee();
    }
}
