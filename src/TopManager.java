public class TopManager implements Employee {
    private final static int FixedSalary = 40000;
    private company Company;
    private int MounthSalary;

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
        if (Company.getIncome() > 10000000) {
            MounthSalary += 1.5 * MounthSalary;
        }
    }

    public String toString() {
        return "\nтип работника: TopManager\nзарплата: " + MounthSalary + "\nдоход компании: " + Company.getIncome();
    }
}
