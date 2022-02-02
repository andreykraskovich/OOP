package Company;

public class Manager implements Employee{
    private Company company;
    private final double FIXEDSALARY = 100000.0;
    private double salary;
    private String info;
    private double partOfIncome = (115000.0 + 25000.0 * Math.random());
    public Manager(Company company){
        this.company = company;
    }
    @Override
    public double getMonthSalary() {
        salary = FIXEDSALARY + partOfIncome * 0.05;
        return (int)this.salary;
    }

    public String getInfo(){
        info = "Позиция: Менеджер " + " ЗП: " + getMonthSalary();
        return info;
    }

    public double getPartOfIncome(){
        return this.partOfIncome;
    }


}
