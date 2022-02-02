import java.time.LocalDate;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
        Calendar c = Calendar.getInstance();
        //TODO Метод должен вернуть сотрудника с максимальной зарплатой среди тех,
        // кто пришёл в году, указанном в переменной year
        return staff.stream()
                .filter(e -> {
                    c.setTime(e.getWorkStart());
                    if(c.get(Calendar.YEAR) != year){
                        return false;
                    }
                    return true;
                })
                .max(Comparator.comparing(Employee::getSalary)).get();
    }
}