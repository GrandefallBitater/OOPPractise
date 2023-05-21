import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        company test = new company();
        Manager l = new Manager();

        test.hire(l);
        System.out.println(l.getPersonIncome());
        test.showEmployee();
    }
}