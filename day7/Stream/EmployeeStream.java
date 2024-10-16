package day7.Stream;



import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {
    public List<Employee> initializeEmployeData(){
        List<Employee> emplist = new ArrayList<>();
        Set<String> skills1= new TreeSet<>();
        skills1.add("java");
        skills1.add("C");
        emplist.add(new Employee(567, "aaa", 7500, skills1, "Admin"));
        Set<String> skills2= new TreeSet<>();
        skills2.add("python");
        skills2.add("c#");
        emplist.add(new Employee(100, "bbb", 500, skills2, "Admin"));
        Set<String> skills3= new TreeSet<>();
        skills3.add("selenium");
        skills3.add("C++");
        emplist.add(new Employee(237, "ccc", 15500, skills3, "IT"));
        Set<String> skills4= new TreeSet<>();
        skills4.add("Django");
        skills4.add("R");
        emplist.add(new Employee(804, "ddd", 90500, skills4, "IT"));

        return emplist;
    }

    public static void main(String[] args) {
        EmployeeStream e = new EmployeeStream();
        List<Employee> emplist = e.initializeEmployeData();
        Stream<Employee> stream = emplist.stream();


        System.out.println("==============SORTING BY NAME==================");
        Comparator<Employee> byname = Comparator.comparing(Employee::getName);
        stream.sorted(byname).forEach(System.out::println);

        stream = emplist.stream();
        System.out.println("==============SORTING BY NAME for DEPT==================");
        Comparator<Employee> bydept = Comparator.comparing(Employee::getDepartment).thenComparing(byname);
        stream.sorted(bydept).forEach(System.out::println);


        stream = emplist.stream();
        System.out.println("==============FILTER BY SALARY==================");
        Predicate<Employee> salRange= (emp) -> {
            if(emp.getSalary() >= 6500 && emp.getSalary() < 17000)
                return true;
            else return false;
        };
        stream.filter(salRange).forEach((v) -> System.out.println(v));


        stream = emplist.stream();
        System.out.println("==============FILTER BY SKILLS==================");
        stream.filter((emp) -> emp.getSkillset().contains("Java")).forEach(System.out::println);


        stream = emplist.stream();
        System.out.println("==============GROUP BY DEPT==================");
        Map<String, List<Employee>> empbydept = stream.collect(Collectors.groupingBy(Employee::getDepartment));
        empbydept.forEach((k,v) -> System.out.println(k + "," + v));


        stream = emplist.stream();
        System.out.println("==============Mapping BY EMPID AND DEPT==================");
        stream.map((emp) -> new Department(emp.getEmpid(), emp.getDepartment()));
        

        stream = emplist.stream();
        System.out.println("==============Getting TOTAL SALARY==================");
        double totalsal = stream.mapToDouble(Employee::getSalary).reduce(0, (e1, e2) -> e1+e2);
        System.out.println(totalsal);

    }
}
