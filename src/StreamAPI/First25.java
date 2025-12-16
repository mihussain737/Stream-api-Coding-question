package StreamAPI;

import java.util.List;
import java.util.stream.Stream;

public class First25 {
    public static void main(String[] args) {
       /* 21. Find common elements between two lists
        Input: [1, 2, 3, 4] and [3, 4, 5, 6]
        Output: [3, 4]
        */
        List<Integer> l1=List.of(1, 2, 3, 4);
        List<Integer> l2=List.of(3,4,5,6);
        List<Integer> l3=l1.stream().filter(i->l2.contains(i)).toList();
        System.out.println(l3);

      /*  22. Merge two lists and remove duplicates
        Input: [1, 2, 3] and [3, 4, 5]
        Output: [1, 2, 3, 4, 5]
       */

        List<Integer> l4=List.of(1, 2, 3);
        List<Integer> l5=List.of(3,4,5);
        List<Integer> l6= Stream.concat(l4.stream(),l5.stream()).distinct().toList();
        System.out.println(l6);

      /*  23. Get elements greater than 10
        Input: [5, 15, 10, 20, 8]
        Output: [15, 20]
       */
        List<Integer> l7=List.of(5, 15, 10, 20, 8);
        List<Integer> l8=l7.stream().filter(i->i>10).toList();
        System.out.println(l8);

        /*
        24. Find all strings that end with ‘s’
        Input: ["apples", "banana", "grapes", "orange"]
        Output: ["apples", "grapes"]
         */
        List<String> l9 = List.of("apples", "banana", "grapes", "orange");
        List<String> l10=l9.stream().filter(i->i.endsWith("s")).toList();
        System.out.println(l10);

       /* 25. Count how many times a character appears in a string
        Input: "banana", char = 'a'
        Output: 3
        */
        String s="banana";
        long count = s.chars().mapToObj(c -> (char) c).filter(character -> character == 'a').count();
        System.out.println(count);
        System.out.println(s.chars()
                .filter(c -> c == 'a')
                .count());
    }
}
