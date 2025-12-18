package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class First45 {
    public static void main(String[] args) {
//        41. Find all prime numbers in a list
//        Input: [2, 3, 4, 5, 6, 7, 8, 9, 10]
//        Output: [2, 3, 5, 7]
        List<Integer> l1 =List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> primes = l1.stream()
                .filter(n -> n > 1) // prime numbers are > 1
                .filter(n -> {
                    for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0) {
                            return false; // not prime
                        }
                    }
                    return true; // prime
                })
                .toList();

        System.out.println(primes);


//        42. Check if a list contains only unique elements
//        Input: [1, 2, 3, 4, 5]
//        Output: true
        List<Integer> l2=List.of(1,2,3,4,5,6);
        boolean isUnique = l2.stream()
                .distinct()
                .count() == l2.size();
        System.out.println(isUnique);

//        43. Sum of squares of odd numbers
//        Input: [1, 2, 3, 4, 5]
//        Output: 35 (1² + 3² + 5²)
        List<Integer> l3=List.of(1, 2, 3, 4, 5);
        Integer i = l3.stream().filter(integer -> integer % 2 != 0).map(integer -> integer * integer)
                .reduce(Integer::sum).orElse(null);
        System.out.println(i);

//        44. Skip first 3 elements and return rest
//        Input: [10, 20, 30, 40, 50]
//        Output: [40, 50]
        List<Integer> l4=List.of(10, 20, 30, 40, 50);
        List<Integer> list = l4.stream()
                .skip(3).toList();
        System.out.println(list);

//        45. Limit a list to first 3 elements
//        Input: [1, 2, 3, 4, 5]
//        Output: [1, 2, 3]
        List<Integer> l5=List.of(1,2,3,4,5);
        List<Integer> list1 = l5.stream()
                .limit(3).toList();
        System.out.println(list1);

    }
}
