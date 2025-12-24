package practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OneToTwenty {
    public static void main(String[] args) {
//        1. Find even numbers from a list
//        Input: [1, 2, 3, 4, 5, 6]
//        Output: [2, 4, 6]
//
//        2. Convert strings to uppercase
//        Input: ["apple", "banana", "grape"]
//        Output: ["APPLE", "BANANA", "GRAPE"]
//
//        3. Count strings starting with 'A'
//        Input: ["Apple", "Banana", "Avocado", "Apricot", "berry"]
//        Output: 3
        List<String> l3=List.of("Apple", "Banana", "Avocado", "Apricot", "berry");
        long l3C = l3.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(l3C);

//        4. Square each number in a list
//        Input: [2, 3, 4]
//        Output: [4, 9, 16]
//
//        5. Remove duplicates from a list
//        Input: [1, 2, 2, 3, 4, 4, 5]
//        Output: [1, 2, 3, 4, 5]
//
//        6. Find the maximum number in a list
//        Input: [5, 3, 9, 2, 8]
//        Output: 9
        List<Integer> l6=List.of(5, 3, 9, 2, 8);
        Integer i = l6.stream().max(Comparator.naturalOrder()).orElse(null);
        System.out.println(i);

//        7. Find the minimum number in a list
//        Input: [7, 3, 9, 1, 6]
//        Output: 1

//        8. Sum all numbers in a list
//        Input: [1, 2, 3, 4, 5]
//        Output: 15
        List<Integer> l8=List.of(1, 2, 3, 4, 5);
        Integer sum = l8.stream().reduce((a, b) -> a + b).orElse(null);
        System.out.println(sum);

        int sum1 = l8.stream().mapToInt(Integer::intValue).sum();
        System.out.println(l8.stream().mapToInt(i1->i1).sum());
        System.out.println(sum1);

//        9. Join strings with comma
//        Input: ["Java", "Python", "C++"]
//        Output: "Java, Python, C++"
        List<String> l9=List.of("Java", "Python", "C++");
        String s = l9.stream().reduce((a, b) -> a+", "+b).orElse(null);
        System.out.println(s);
//        10. Filter strings with length > 4
//        Input: ["cat", "elephant", "dog", "lion"]
//        Output: ["elephant"]
//
//        11. Sort a list of integers
//        Input: [5, 1, 4, 2, 3]
//        Output: [1, 2, 3, 4, 5]
//
//        12. Reverse sort a list of integers
//        Input: [5, 1, 4, 2, 3]
//        Output: [5, 4, 3, 2, 1]
//
//        13. Count frequency of elements
//        Input: [1, 2, 2, 3, 3, 3]
//        Output: {1=1, 2=2, 3=3}
        List<Integer> l13=List.of(1, 2, 2, 3, 3, 3,3);
        Map<Integer, Long> collect = l13.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        System.out.println(collect);

//        14. Get distinct characters from a string
//        Input: "hello"
//        Output: [h, e, l, o]
        String str="hello";
        List<String> list = Arrays.stream(str.split("")).distinct().toList();
        System.out.println(list);

//        15. Filter palindromes
//        Input: ["madam", "apple", "racecar", "hello"]
//        Output: ["madam", "racecar"]
//
//        16. Find second highest number
//        Input: [10, 20, 30, 40, 50]
//        Output: 40
//
//        17. Group strings by length
//        Input: ["hi", "hello", "world", "bye"]
//        Output: {2=[hi], 3=[bye], 5=[hello, world]}
        List<String> l17=List.of("hi", "hello", "world", "bye");
        Map<Integer, List<String>> collect1 = l17.stream().collect(Collectors.groupingBy(a -> a.length()));
        System.out.println(collect1);

//        18. Flatten a list of lists
//        Input: [[1, 2], [3, 4], [5]]
//        Output: [1, 2, 3, 4, 5]
//
//        19. Partition integers into even and odd
//        Input: [1, 2, 3, 4, 5, 6]
//        Output: {false=[1, 3, 5], true=[2, 4, 6]}
        List<Integer> l19=List.of(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> collect2 = l19.stream().collect(Collectors.groupingBy(a -> a % 2 == 0));
        System.out.println(collect2);


//        20. Remove nulls from a list
//        Input: [null, "apple", null, "banana"]
//        Output: ["apple", "banana"]
    }
}
