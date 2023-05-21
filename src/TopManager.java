public class TopManager implements Employee {
    public void setCompany(company company) {
        Company = company;
    }

    private company Company;
    private int MounthSalary;

    private final static int FixedSalary = 40000;

    public TopManager(){

    }

    public String toString(){
        return "\nтип работника: TopManager\nзарплата: " + MounthSalary + "\nдоход компании: " + Company.getIncome();
    }

    @Override
    public int getMounthSalary() {
        return MounthSalary;
    }
    @Override
    public void CreateSalary(){
        MounthSalary = FixedSalary;
        if(Company.getIncome() > 10000000){
            MounthSalary += 1.5 * MounthSalary;
        }
    }
}
