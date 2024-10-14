package day5.Employee;

import java.util.*;

public class EmployeeCollection {
    public List<Employee> initializeEmployeData(){
        List<Employee> emplist = new ArrayList<>();
        Set<String> skills1= new TreeSet<>();
        skills1.add("java");
        skills1.add("C");
        emplist.add(new Employee(567, "aaa", 7500, skills1));
        Set<String> skills2= new TreeSet<>();
        skills2.add("python");
        skills2.add("c#");
        emplist.add(new Employee(100, "bbb", 500, skills2));
        Set<String> skills3= new TreeSet<>();
        skills3.add("selenium");
        skills3.add("C++");
        emplist.add(new Employee(237, "ccc", 15500, skills3));
        Set<String> skills4= new TreeSet<>();
        skills4.add("Django");
        skills4.add("R");
        emplist.add(new Employee(804, "ddd", 90500, skills4));

        return emplist;
    }
    public void printList(List<Employee> emplist){
        for(Employee e: emplist){
            System.out.println(e);
        }
    }

    public Employee searchEmployee(List<Employee> emplist, int empid){
        for(Employee e: emplist){
            if(e.getEmpid() == empid){
                return e;
            }
        }
        return null;
    }
    public List<Employee> filterEmployees(List<Employee> emplist,String criteria)
    {
        List<Employee> filtered = new ArrayList<>();
        for (Employee e: emplist)
        {
            if(e.getSkillset().contains(criteria))
                filtered.add(e);
        }
        return filtered;
    }

    public Map<Integer, Double> salaryMap(List<Employee> emplist){
        Map<Integer, Double> salmap = new TreeMap();
        for(Employee e: emplist){
            salmap.put(e.getEmpid(), e.getSalary());
        }
        return salmap;
    }

    public static void main(String[] args) {
        EmployeeCollection e = new EmployeeCollection();
        List<Employee> emplist = e.initializeEmployeData();
        e.printList(emplist);

        Employee found = e.searchEmployee(emplist, 804);
        System.out.println("Employee found=" + found);

        System.out.println("========Employee skilled at Java=============");
        List<Employee> byskill = e.filterEmployees(emplist, "Java");
        e.printList(byskill);

        System.out.println("========Employee Salary Mapping =============");
        Map<Integer, Double> sal = e.salaryMap(emplist);
        for(Map.Entry<Integer, Double> entry: sal.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }


        System.out.println("=============sort by employee id==============");
        Collections.sort(emplist);
        e.printList(emplist);


        int index = Collections.binarySearch(emplist, new Employee(567, null, 0, null));
        System.out.println("Found at index: " + index);

        System.out.println("=============sort by employee Name==============\n");
        emplist.sort(new NameComparetor());
        e.printList(emplist);


        index = Collections.binarySearch(emplist, new Employee(0, "bbb", 0, null),
                new NameComparetor());
        System.out.println("Found at index: " + index);

        System.out.println("=============sort by employee Salary==============\n");
        emplist.sort(new SalaryComparator());
        e.printList(emplist);

        System.out.println("++++++++++Minimum Salary++++++++++++++++++++++\n");
        System.out.println(Collections.min(emplist, new SalaryComparator()));

        System.out.println("++++++++++++++++++++Maximum Salary++++++++++++++\n");
        System.out.println(Collections.max(emplist, new SalaryComparator()));

        System.out.println("+++++++++++++==========Reverse order==========+++++++++++++++\n");
        Collections.reverse(emplist);
        e.printList(emplist);
    }
}
