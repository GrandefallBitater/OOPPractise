public class Manager implements Employee{
    public void setCompany(company company) {
        Company = company;
    }

    private company Company;
    private int MounthSalary;

    private final static int FixedSalary = 40000;


    public Manager(){

    }

    public String toString(){
        return "\nтип работника: manager\nзарплата: " + MounthSalary;
    }

    @Override
    public void getMounthSalary() {
        int Income  = Company.getIncome();
        MounthSalary = FixedSalary + ((Income * 5) / 100);
    }
}
