import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class EmployeeDetailsList
{
    public static void main(String[] args){
        Employee[] employees = {
                new Employee( "Red", 31, "IT"),
                new Employee( "Green", 41, "IT"),
                new Employee("Black", 35, "Sales"),
                new Employee("Yellow", 19, "Marketing"),
                new Employee("Pink", 62, "IT"),
                new Employee("Blue", 23, "Sales"),
                new Employee("Brown", 42, "Marketing")};

        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);

        // display all Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);


        // Functions for getting first and last names from an Employee
        Function<Employee, String> byname = Employee::getname;

        // Comparator for comparing Employees by first name then last name
        Comparator<Employee> names =
                Comparator.comparing(byname);

        // sort employees by name
        System.out.printf(
                "%nEmployees in ascending order by name:%n");
        list.stream()
                .sorted(names)
                .forEach(System.out::println);

        Function<Employee, Integer> age = Employee::getage;

        // Employees by age
        Comparator<Employee> sortAge =
                Comparator.comparing(age);

        System.out.printf(
                "%nEmployees in ascending order by Employee age:%n");

        // Comparator for comparing sort by age
        list.stream()
                .sorted(sortAge)
                .forEach(System.out::println);

        Function<Employee, String> byDept = Employee::getDepartment;

        // Comparator for comparing Employees by dept
        Comparator<Employee> sortDept =
                Comparator.comparing(byDept);

        // sort by dept
        System.out.printf(
                "%nEmployees in ascending order by Employee Department:%n");
        list.stream()
                .sorted(sortDept)
                .forEach(System.out::println);
    }
}
class Employee{
    private String name;
    private int age;
    private String department;

    // constructor
    public Employee( String name,
                    int age, String department)
    {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // set name
    public void setname(String name)
    {
        this.name = name;
    }

    // get name
    public String getname()
    {
        return name;
    }

    // set age
    public void setage(int age)
    {
        this.age = age;
    }

    // get age
    public int getage()
    {
        return age;
    }

    // set department
    public void setDepartment(String department)
    {
        this.department = department;
    }

    // get department
    public String getDepartment()
    {
        return department;
    }

    // return Employee's first and last name combined
    public String getName()
    {
        return String.format("%s %s", getname());
    }

    // return a String containing the Employee's information
    @Override
    public String toString()
    {
        return String.format(" %-8s %s  %s",
            getname(), getage(), getDepartment());
    }
}