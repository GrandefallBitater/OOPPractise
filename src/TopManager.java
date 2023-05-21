public class TopManager implements Employee {
    public void setCompany(company company) {
        Company = company;
    }

    private company Company;
    private int MounthSalary;

    private final static int FixedSalary = 60000;

    public TopManager(){

    }

    public String toString(){
        return "\nтип работника: TopManager\nзарплата: " + MounthSalary;
    }

    @Override
    public void getMounthSalary() {
        int Income  = Company.getIncome();
        MounthSalary = FixedSalary + ((Income * 5) / 100);
    }
}
