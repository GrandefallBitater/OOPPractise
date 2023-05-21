import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        company firstCompany = new company();
        List<Employee> StaffList = new ArrayList<>();
        StaffList = CreateStaff(180,80,10);
        firstCompany.hireAll(StaffList);

        System.out.println("\nСписок из пятнадцати зарплат по убыванию:");
        TopSalary(15, firstCompany);

        System.out.println("\nСписок из тридцати зарплат по возрастанию:");
        LowestSalary(30, firstCompany);

        //увольняем 50% сотрудников
        int size = firstCompany.getListOfEmployee().size();
        size = size / 2;
        for (int i = 0; i < size; i++){
            firstCompany.fire((int)(Math.random()*(firstCompany.getListOfEmployee().size()-1-0)+1)+0);
        }
        System.out.println("\nудаление прошло успешно");

        System.out.println("\nСписок из пятнадцати зарплат по убыванию:");
        TopSalary(15, firstCompany);

        System.out.println("\nСписок из тридцати зарплат по возрастанию:");
        LowestSalary(30, firstCompany);
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

    private static void TopSalary(int count, company firstCompany){

        List<Employee> topSalaryStaff = firstCompany.getTopSalaryStaff(count);
        if(topSalaryStaff == null){
            System.out.println("некорретное число работников");
        }else {
            for (Employee e :
                    topSalaryStaff) {
                System.out.println(e.getMounthSalary() + " руб");
            }
        }
    }

    private static void LowestSalary(int count, company firstCompany) {
        List<Employee> lowestSalaryStaff = firstCompany.getLowestSalaryStaff(count);
        if(lowestSalaryStaff == null){
            System.out.println("некорретное число работников");
        }else {
            for (Employee e :
                    lowestSalaryStaff) {
                System.out.println(e.getMounthSalary() + " руб");
            }
        }
    }
}