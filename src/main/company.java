package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class company {

    private final static int maxIncome = 20000000;
    private final static int minIncome = 8000000;
    private int Income;
    private List<Employee> ListOfEmployee = new ArrayList<>();

    public company() {
        this.Income = createIncome();
    }

    public List<Employee> getListOfEmployee() {
        return ListOfEmployee;
    }

    public int getIncome() {
        return Income;
    }

    private int createIncome() {
        return (int) ((Math.random() * (maxIncome - minIncome) + 1) + minIncome);
    }

    private Employee PrepareEmployee(Employee employee) {
        if (employee instanceof Manager) {
            ((Manager) employee).setCompany(this);
            ((Manager) employee).CreatePersonIncome();
        } else if (employee instanceof TopManager) {
            ((TopManager) employee).setCompany(this);
        } else if (employee instanceof Operator) {
            ((Operator) employee).setCompany(this);
        }
        employee.CreateSalary();
        return employee;
    }

    public void hire(Employee employee) {
        Employee employee1 = PrepareEmployee(employee);
        ListOfEmployee.add(employee1);
    }

    public void hireAll(List<Employee> listOfEmployees) {
        for (Employee e :
                listOfEmployees) {
            PrepareEmployee(e);
        }
        ListOfEmployee.addAll(listOfEmployees);
    }

    public void showEmployee() {
        for (Employee e : ListOfEmployee) {
            System.out.println(e.toString());
        }
    }

    public void fire(int Index) {
        ListOfEmployee.remove(Index);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if ((count <= 0) || (count > ListOfEmployee.size())) {
            return null;
        }
        ListOfEmployee.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getMounthSalary() > o2.getMounthSalary()) {
                    return -1;
                } else if (o1.getMounthSalary() < o2.getMounthSalary()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        List<Employee> sub = ListOfEmployee.subList(0, count);
        return sub;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if ((count <= 0) || (count > ListOfEmployee.size())) {
            return null;
        }
        ListOfEmployee.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getMounthSalary() > o2.getMounthSalary()) {
                    return 1;
                } else if (o1.getMounthSalary() < o2.getMounthSalary()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        List<Employee> sub = ListOfEmployee.subList(0, count);
        return sub;
    }

    public String toString() {
        return "\nприбыль компании: " + Income;
    }
}
