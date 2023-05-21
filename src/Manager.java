public class Manager implements Employee{
    public void setCompany(company company) {
        Company = company;
    }

    private company Company;
    private int MounthSalary;

    public void CreatePersonIncome() {
        int maxIncome = 140000;
        int minIncome = 115000;
        PersonIncome = (int) ((Math.random()*(maxIncome-minIncome)+1)+minIncome);
    }

    public int getPersonIncome() {
        return PersonIncome;
    }

    private int PersonIncome;

    private final static int FixedSalary = 40000;


    public Manager(){

    }

    public String toString(){
        return "\nтип работника: manager\nзарплата: " + MounthSalary + "\nдоход компании: " + Company.getIncome();
    }

    @Override
    public void getMounthSalary() {
        MounthSalary = FixedSalary + ((PersonIncome * 5) / 100);
    }
}
