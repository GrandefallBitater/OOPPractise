public class Operator implements Employee{
    private int MounthSalary;
    public void setCompany(company company) {
        Company = company;
    }

    private company Company;

    private final static int FixedSalary = 20000;

    public Operator(){

    }

    public String toString(){
        return "\nтип работника: Operator\nзарплата: " + MounthSalary;
    }

    @Override
    public void getMounthSalary() {
        int Income  = Company.getIncome();
        MounthSalary = FixedSalary + ((Income * 5) / 100);
    }
}
