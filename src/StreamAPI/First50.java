package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class First50 {
    public static void main(String[] args) {
//        45. Limit a list to first 3 elements
//        Input: [1, 2, 3, 4, 5]
//        Output: [1, 2, 3]
        List<Integer> l1=List.of(1, 2, 3, 4, 5);
        System.out.println(l1.stream().limit(3).toList());

//        46. Filter only numeric strings from a list
//        Input: ["12", "abc", "3", "xyz", "42"]
//        Output: ["12", "3", "42"]
        List<String> l2=List.of("12", "abc", "3", "xyz", "42");
        List<String> list = l2.stream().filter(s -> s.matches("\\d+")).toList();
        System.out.println(list);

//        47. Remove empty strings from a list
//        Input: ["Java", "", "Spring", "", "Stream"]
//        Output: ["Java", "Spring", "Stream"]
        List<String> l3 = List.of("Java", "", "Spring", "", "Stream");
        List<String> l3a=l3.stream().filter(i->!i.isEmpty()).toList();
        System.out.println(l3a);

//        48. Sort a list of strings in alphabetical order
//        Input: ["Banana", "Apple", "Mango"]
//        Output: ["Apple", "Banana", "Mango"]
        List<String> l4=List.of("Banana", "Apple", "Mango");
        List<String> list1 = l4.stream().sorted(String::compareTo).toList();
        System.out.println(list1);
        System.out.println(l4.stream().sorted((s1, s2) -> s1.compareTo(s2)));

//        49. Convert comma-separated string to list
//        Input: "a,b,c,d"
//        Output: ["a", "b", "c", "d"]
        String s="a,b,c,d";
        List<String> sa = Arrays.stream(s.split(",")).toList();
        System.out.println(sa);
        
//        50. Get length of longest string in list
//        Input: ["cat", "elephant", "dog"]
//        Output: 8
        List<String> l5=List.of("cat", "elephant", "dog");
        Integer l5a = l5.stream().sorted((a,b)->b.compareTo(a)).map(i -> i.length()).toList().get(0);
        System.out.println(l5a);
    }
}
