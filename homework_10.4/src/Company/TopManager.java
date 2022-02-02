package Company;

public class TopManager implements Employee{
    private Company company;
    private final double FIXEDSALARY = 130000.0;
    private double salary;
    public TopManager(Company company){
        this.company = company;
    }
    @Override
    public double getMonthSalary() {
        this.salary = company.income > 10_000_000 ? FIXEDSALARY + FIXEDSALARY * 1.5 : FIXEDSALARY;
        return this.salary;
    }

    @Override
    public double getPartOfIncome() {
        return 0;
    }

    public String getInfo(){
        String info = "Позиция: Топ Менеджер " + " ЗП: " + getMonthSalary();
        return info;
    }
}
