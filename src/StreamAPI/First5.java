package StreamAPI;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class First5 {
    /*
     * Stream API Practice Questions
     *
     * 1. Find even numbers from a list
     *    Input : [1, 2, 3, 4, 5, 6]
     *    Output: [2, 4, 6]
     */
    
    public static void evenNoList(){
        List<Integer> l1=List.of(1, 2, 3, 4, 5, 6); //null value then exception on of()
        List<Integer>  evenList = l1.stream()
                .filter(i -> i % 2 == 0).toList();
        System.out.println("Even List:: "+evenList);

    }
    /*
     * 2. Convert strings to uppercase
     *    Input : ["apple", "banana", "grape"]
     *    Output: ["APPLE", "BANANA", "GRAPE"]
     */
    public static void upperCaseList(){
        List<String> l2=List.of("apple", "banana", "grape");
        List<String> upperList = l2.stream()
                .map(s -> s.toUpperCase()).toList();
        System.out.println("UpperCaseList:: "+upperList);
    }

    /*
     * 3. Count strings starting with 'A'
     *    Input : ["Apple", "Banana", "Avocado", "Apricot", "berry"]
     *    Output: 3
     */
    public static void aStarting(){
        List<String> l2=List.of("Apple", "Banana", "Avocado", "Apricot", "berry");
        long countA=l2.stream()
                        .filter(i->i.startsWith("A")).count();

        System.out.println("Starting with a count:: "+countA);
    }
    /*
     * 4. Square each number in a list
     *    Input : [2, 3, 4]
     *    Output: [4, 9, 16]
     */
    public static void squareEachList(){
        List<Integer> l4=List.of(2, 3, 4);
        List<Integer> l4square=l4.stream()
                        .map(integer -> integer*integer).toList();

        System.out.println("Square List:: "+l4square);
    }

    /*
     * 5. Remove duplicates from a list
     *    Input : [1, 2, 2, 3, 4, 4, 5]
     *    Output: [1, 2, 3, 4, 5]
     */
    public static void duplicateRemovedList(){
        List<Integer> l5=List.of(1, 2, 2, 3, 4, 4, 5);
        List<Integer> l5result=l5.stream()
                .distinct()
                        .toList();

        Set<Integer> result = l5.stream()
                .collect(Collectors.toSet());

        System.out.println("duplicate removed list:: "+l5result);
    }

    public static void main(String[] args) {
        evenNoList();
        upperCaseList();
        aStarting();
        squareEachList();
        duplicateRemovedList();
    }

}
