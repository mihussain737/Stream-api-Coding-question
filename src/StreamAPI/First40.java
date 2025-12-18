package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class First40 {
    public static void main(String[] args) {
//        36. Create a comma-separated string of numbers > 10
//        Input: [5, 12, 20, 8, 15]
//        Output: "12, 20, 15"
        List<Integer> l1=List.of(5, 12, 20, 8, 15);
        String s = l1.stream().filter(integer -> integer > 10).map(integer -> String.valueOf(integer))
                .reduce((a, b) -> a + "," + b).orElse(null);
        System.out.println(s);
        System.out.println(l1.stream()
                .filter(i -> i > 10)
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));

//        37. Convert list of integers to list of strings
//        Input: [1, 2, 3]
//        Output: ["1", "2", "3"]
        List<Integer> l2=List.of(1,2,3);
        List<String> l2a=l2.stream().map(String::valueOf).toList();
        System.out.println(l2a);

//        38. Find the most frequent element
//        Input: [1, 2, 2, 3, 3, 3]
//        Output: 3
        List<Integer> l3=List.of(1, 2, 2, 3, 3, 3);
        int mostFrequent = l3.stream()
                .collect(Collectors.groupingBy(
                        i -> i,                // key = element
                        Collectors.counting()  // value = frequency
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(mostFrequent);

//        39. Filter out all uppercase strings
//        Input: ["Hello", "WORLD", "Java", "STREAM"]
//        Output: ["WORLD", "STREAM"]
        List<String> l4=List.of("Hello", "WORLD", "Java", "STREAM");
        List<String> list = l4.stream().filter(i -> i.matches("[A-Z]+")).toList();
        System.out.println(list);

//        40. Replace null values with "N/A"
//        Input: [null, "apple", null, "banana"]
//        Output: ["N/A", "apple", "N/A", "banana"]
        List<String> l5= Arrays.asList(null, "apple", null, "banana");
        List<String> list1 = l5.stream().map(sTemp -> sTemp == null ? "N/A" : sTemp).toList();
        System.out.println(list1);
    }
}
