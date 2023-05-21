import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        company test = new company();
        Employee l = new Operator();
        test.hire(l);
        test.showEmployee();
    }
}