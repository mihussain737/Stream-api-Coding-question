package StreamAPI;


import java.util.*;

class Employee implements Comparable<Employee>{
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }



    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }

}

public class First55 {
    public static void main(String[] args) {
//
//        51. Filter employees with salary > 50000
//        Input: [Emp("John",50000), Emp("Sara",60000)]
//        Output: [Emp("Sara",60000)]
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("John",50000));
        list.add(new Employee("Sara",60000));

        List<Employee> list1 = list.stream().filter(employee -> employee.getSalary() > 50000).toList();
        System.out.println(list1);

//        52. Sort employees by name
//        Input: [Emp("Zoe"), Emp("Alex")]
//        Output: [Emp("Alex"), Emp("Zoe")]
        List<Employee> l2=new ArrayList<>();
        l2.add(new Employee("Zoe"));
        l2.add(new Employee("Alex"));
        List<Employee> l2a = l2.stream().sorted().toList();
        System.out.println(l2a);

        System.out.println(l2a.stream().sorted(Comparator.comparing(employee -> employee.getName())).toList());

//        53. Find duplicate elements in a list
//        Input: [1, 2, 3, 2, 4, 1]
//        Output: [1, 2]
        List<Integer> l3 = List.of(1, 2, 3, 2, 4, 1);

        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = l3.stream()
                .filter(n -> !seen.add(n))
                .distinct()
                .toList();

        System.out.println(duplicates);


//        54. Remove duplicates but preserve order
//        Input: [1, 2, 3, 2, 1]
//        Output: [1, 2, 3]
        List<Integer> l4=List.of(1, 2, 3, 2, 1);
//        List<Integer> list2 = l4.stream().distinct().toList();
//        System.out.println(list2);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for(int x:l4){
            linkedHashSet.add(x);
        }
        System.out.println(linkedHashSet);

//        55. Reverse a list using stream
//        Input: [1, 2, 3, 4, 5]
//        Output: [5, 4, 3, 2, 1]
        List<Integer> l5=List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = l5.stream().sorted((a, b) -> b.compareTo(a)).toList();
        System.out.println(list2);
    }
}
