public class Manager implements Employee {
    private final static int FixedSalary = 40000;
    private int PersonIncome;
    private company Company;
    private int MounthSalary;

    public void setCompany(company company) {
        Company = company;
    }

    public void CreatePersonIncome() {
        int maxIncome = 140000;
        int minIncome = 115000;
        PersonIncome = (int) ((Math.random() * (maxIncome - minIncome) + 1) + minIncome);
    }

    public int getPersonIncome() {
        return PersonIncome;
    }

    @Override
    public void CreateSalary() {
        MounthSalary = FixedSalary + ((PersonIncome * 5) / 100);
    }

    @Override
    public int getMounthSalary() {
        return MounthSalary;
    }

    public String toString() {
        return "\nтип работника: manager\nзарплата: " + MounthSalary + "\nдоход компании: " + Company.getIncome();
    }
}
