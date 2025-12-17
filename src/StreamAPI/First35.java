package StreamAPI;

import java.util.Comparator;
import java.util.List;

public class First35 {
    public static void main(String[] args) {

//        31. Check if all numbers are positive
//        Input: [2, 4, 6, 8]
//        Output: true
        List<Integer> l1=List.of(2, 4, 6, 8);
        boolean b = l1.stream().allMatch(i -> i > 0);
        System.out.println(b);

//        32. Check if any number is negative
//        Input: [2, -1, 5, 7]
//        Output: true
        List<Integer> l2=List.of(2, -1, 5, 7);
        boolean b1 = l2.stream().anyMatch(i -> i < 0);
        System.out.println(b1);

//        33. Find average of list elements
//        Input: [10, 20, 30, 40, 50]
//        Output: 30.0
        List<Integer> l3=List.of(10, 20, 30, 40, 50);
        double v = l3.stream().reduce((a, c) -> a + c).get() / (double) (l3.size());
        System.out.println(v);

        System.out.println(l3.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0));

//        34. Sort strings by their length
//        Input: ["cat", "elephant", "dog", "bee"]
//        Output: ["cat", "dog", "bee", "elephant"]
        List<String> l4=List.of("cat", "elephant", "dog", "bee");
        List<String> list = l4.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(list);

//        35. Extract digits from a string
//        Input: "a1b2c3d4"
//        Output: [1, 2, 3, 4]
        String s="a1b2c3d4";
        List<Integer> list1 = s.chars().filter(Character::isDigit)
                .map(c->c-'0').boxed().toList();
        System.out.println(list1);

    }
}
