import Company.Company;
import Company.TopManager;
import Company.Manager;
import Company.Operator;
import Company.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        ArrayList<Employee> topManager = new ArrayList<>();
        ArrayList<Employee> manager = new ArrayList<>();
        ArrayList<Employee> operator = new ArrayList<>();
        for (int c = 0; c < 10; c++){
            TopManager topManager1 = new TopManager(company);
            topManager.add(topManager1);
        }
        for (int c = 0; c < 80; c++){
            Manager manager1 = new Manager(company);
            manager.add(manager1);
        }
        for (int c = 0; c < 180; c++){
           Operator operator1 = new Operator();
           operator.add(operator1);
        }
        company.hireAll(topManager);
        company.hireAll(manager);
        company.hireAll(operator);
        System.out.println(company.getIncome());
        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));
        for(int i = 0; i < 90; i++){
            company.fire(operator.get(i));
        }
        for (int a = 0; a < 5; a++){
            company.fire(topManager.get(a));
        }
        for (int b = 0; b < 40; b++){
            company.fire(manager.get(b));
        }
        System.out.println(company.getIncome());
        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));

    }
}
