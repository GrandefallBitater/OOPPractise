import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class company {

    private int Income;

    private List<Employee> ListOfEmployee = new ArrayList<>();
    public company(){
        this.Income = createIncome();
    }

    private int createIncome() {
        int maxIncome = 140000;
        int minIncome = 115000;
        return (int) ((Math.random()*(maxIncome-minIncome)+1)+minIncome);
    }

    public void hire(Employee employee){
        if(employee instanceof Manager){
            ((Manager) employee).setCompany(this);
        } else if (employee instanceof TopManager) {
            ((TopManager) employee).setCompany(this);
        } else if (employee instanceof Operator) {
            ((Operator) employee).setCompany(this);
        }
        employee.getMounthSalary();
        ListOfEmployee.add(employee);
    }

    public void showEmployee(){
        for (Employee e: ListOfEmployee) {
            System.out.println(e.toString());
        }
    }

    public void hireAll(List<Employee> listOfEmployees){
        ListOfEmployee.addAll(listOfEmployees);
    }

    public void fire(){

    }

    public int getIncome(){
        return Income;
    }

    public List<Employee> getTopSalaryStaff(int count){
        return null;
    }

    public List<Employee> getLowestSalaryStaff(int count){
        return null;
    }

    public String toString(){
        return "\nприбыль компании: " + Income;
    }
}
