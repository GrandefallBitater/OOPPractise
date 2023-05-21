public class Operator implements Employee {
    private final static int FixedSalary = 20000;
    private int MounthSalary;
    private company Company;

    public void setCompany(company company) {
        Company = company;
    }

    @Override
    public int getMounthSalary() {
        return MounthSalary;
    }

    @Override
    public void CreateSalary() {
        MounthSalary = FixedSalary;
    }

    public String toString() {
        return "\nтип работника: Operator\nзарплата: " + MounthSalary + "\nдоход компании: " + Company.getIncome();
    }
}
