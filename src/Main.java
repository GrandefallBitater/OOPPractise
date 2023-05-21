import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        company firstCompany = new company();
        List<Employee> StaffList = new ArrayList<>();
        StaffList = CreateStaff(180,80,10);
        firstCompany.hireAll(StaffList);

        System.out.println("\nСписок из пятнадцати зарплат по убыванию:");
        List<Employee> topSalaryStaff = firstCompany.getTopSalaryStaff(15);
        if(topSalaryStaff == null){
            System.out.println("некорретное число работников");
        }else {
            for (Employee e :
                    topSalaryStaff) {
                System.out.println(e.getMounthSalary());
            }
        }

        System.out.println("\nСписок из тридцати зарплат по возрастанию:");
        List<Employee> lowestSalaryStaff = firstCompany.getLowestSalaryStaff(30);
        if(topSalaryStaff == null){
            System.out.println("некорретное число работников");
        }else {
            for (Employee e :
                    lowestSalaryStaff) {
                System.out.println(e.getMounthSalary());
            }
        }

        //увольняем 50% сотрудников

    }

    private static List<Employee> CreateStaff(int OperatorCount, int ManagerCount, int TopManagerCount){
        List<Employee> ListOfEmployee = new ArrayList<>();
        for(int i = 0; i < OperatorCount; i++){
            Operator sub = new Operator();
            ListOfEmployee.add(sub);
        }
        for(int i = 0; i < ManagerCount; i++){
            Manager sub = new Manager();
            ListOfEmployee.add(sub);
        }
        for(int i = 0; i < TopManagerCount; i++){
            TopManager sub = new TopManager();
            ListOfEmployee.add(sub);
        }
        return ListOfEmployee;
    }
}