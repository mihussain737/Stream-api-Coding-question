package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class First10 {
    public static void main(String[] args) {
        /*
        6. Find the maximum number in a list
        Input: [5, 3, 9, 2, 8]
        Output: 9
        */
        List<Integer> l6=List.of(5, 3, 9, 2, 8);
        Integer l6A = l6.stream().max(Comparator.naturalOrder()).orElse(null);
        System.out.println(l6A);

        System.out.println(l6.stream()
                .max(Integer::compareTo)
                .orElse(null));

        System.out.println(l6.stream()
                .reduce(Integer::max)
                .orElse(null));

        System.out.println(l6.stream()
                .sorted()
                .reduce((first, second) -> second)
                .orElse(null));

        /*
        7. Find the minimum number in a list
        Input: [7, 3, 9, 1, 6]
        Output: 1
        */
        List<Integer> l7=List.of(7, 3, 9, 1, 6);
        Integer l7A = l6.stream().min(Comparator.naturalOrder()).orElseGet(null);
        System.out.println(l7A);

        System.out.println(l6.stream()
                .reduce(Integer::min)
                .orElse(null));

        System.out.println(l6.stream()
                .sorted(Comparator.reverseOrder())
                .reduce((first, second) -> second)
                .orElse(null));

        /*8. Sum all numbers in a list
        Input: [1, 2, 3, 4, 5]
        Output: 15
        */
        List<Integer> l8=List.of(1, 2, 3, 4, 5);
        System.out.println(l8.stream().reduce((first,second)->first+second).orElse(null));
        System.out.println(l8.stream().reduce(Integer::sum).orElse(null));

        /*
        9. Join strings with comma
        Input: ["Java", "Python", "C++"]
        Output: "Java, Python, C++"
        */

        List<String> l9=List.of("Java", "Python", "C++");
        String collect = l9.stream().collect(Collectors.joining(", "));
        System.out.println(collect);
        System.out.println(l9.stream()
                .reduce((a, b) -> a + ", " + b) // combine two elements at a time
                .orElse(""));

        /*
        10. Filter strings with length > 4
        Input: ["cat", "elephant", "dog", "lion"]
        Output: ["elephant"]
                 */

        List<String> l10=List.of("cat", "elephant", "dog", "lion");
        System.out.println(l10.stream().filter(i->i.length()>5).toList());
    }
}
