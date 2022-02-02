package Company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    protected double income;

    private static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public Company() {
        new ArrayList<String>();
        income = 0;
    }

    public void hire(Employee employee){
        this.income += employee.getPartOfIncome();
        employeeArrayList.add(employee);
    }

    public ArrayList<Employee> hireAll(ArrayList<Employee> employee) {
        employeeArrayList.addAll(employee);
        for(int i = 0; i < employee.size(); i++){
        this.income += employee.get(i).getPartOfIncome();}
        return employeeArrayList;
    }

    public void fire(Employee employee){
        setIncome(getIncome() - employee.getPartOfIncome());
        employeeArrayList.remove(employee);
    }

    public double getIncome()
    {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }


    public List<Employee> getTopSalaryStaff(int count){
        employeeArrayList.sort(Comparator.comparing(Employee::getMonthSalary).reversed());
        if(count < employeeArrayList.size() && count > 0){
        for(int i = 0; i < count; i++){
            Employee employee = employeeArrayList.get(i);
            System.out.println(employee.getInfo());
        }}
        return Collections.emptyList();
    }
    public List<Employee> getLowestSalaryStaff(int count){
        employeeArrayList.sort(Comparator.comparing(Employee::getMonthSalary));
        if(count < employeeArrayList.size() && count > 0){
        for(int i = 0; i < count; i++){
            Employee employee = employeeArrayList.get(i);
            System.out.println(employee.getInfo());
        }}
        return Collections.emptyList();
    }

}
