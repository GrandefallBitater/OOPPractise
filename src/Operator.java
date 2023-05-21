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
        return "\nтип работника: Operator\nзарплата: " + MounthSalary + "\nдоход компании: " + Company.getIncome();
    }

    @Override
    public int getMounthSalary() {
        return MounthSalary;
    }
    @Override
    public void CreateSalary(){
        MounthSalary = FixedSalary;
    }

}
