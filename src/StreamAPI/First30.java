package StreamAPI;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class First30 {
    public static void main(String[] args) {

//        26. Get top 3 highest numbers
//        Input: [5, 3, 9, 1, 12, 7]
//        Output: [12, 9, 7]
        List<Integer> l1=List.of(5, 3, 9, 1, 12, 7);
        List<Integer> l1a = l1.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(l1a);

//        27. Group names by their starting letter
//        Input: ["Alice", "Aaron", "Bob", "Brian"]
//        Output: {A=[Alice, Aaron], B=[Bob, Brian]}
        List<String> l2=List.of("Alice", "Aaron", "Bob", "Brian");
        Map<Character, List<String>> l2a = l2.stream().collect(Collectors.groupingBy(i -> i.charAt(0)));
        System.out.println(l2a);

//        28. Convert a list of strings to a map (key = string, value = length)
//        Input: ["cat", "elephant", "dog"]
//        Output: {cat=3, elephant=8, dog=3}
        List<String> l3=List.of("cat", "elephant", "dog");
//        Map<Integer, List<String>> collect = l3.stream()
//                .collect(Collectors.groupingBy(i -> i.length()));
        Map<String, Integer> result =
                l3.stream()
                        .collect(Collectors.toMap(
                                str -> str,
                                str -> str.length()
                        ));
        System.out.println(result);


//        29. Count duplicate strings
//        Input: ["apple", "banana", "apple", "orange", "banana", "apple"]
//        Output: {apple=3, banana=2, orange=1}
        List<String> l4=List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> collect = l4.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect);

//        30. Find the first element greater than 50
//        Input: [10, 20, 60, 40]
//        Output: 60
        List<Integer> l5=List.of(10, 20, 60, 40);
//        Integer i1 = l5.stream().filter(i -> i > 50).limit(1).toList().get(0);
//        System.out.println(i1);
        System.out.println(l5.stream()
                .filter(i -> i > 50)
                .findFirst()
                .orElse(null));

    }
}
