package Company;

public class Operator implements Employee{
    private final double FIXEDSALARY = 70000.0;
    @Override
    public double getMonthSalary() {
        return FIXEDSALARY;
    }

    @Override
    public double getPartOfIncome() {
        return 0;
    }

    public String getInfo(){
        String info = "Позиция: Оператор " + " ЗП: " + getMonthSalary();
        return info;
    }
}
