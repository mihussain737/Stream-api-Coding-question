package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class First60 {
    public static void main(String[] args) {
//        56. Count vowels in a string
//        Input: "streamapi"
//        Output: 3
        String str = "streamapi";
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        long count = Arrays.stream(str.split(""))
                .filter(vowels::contains).distinct()
                .count();
        System.out.println(count);

//        57. Remove special characters from a list of strings
//        Input: ["he!!o", "wo@rld", "java#"]
//        Output: ["heo", "world", "java"]
//
//        58. Filter strings that contain digit
//        Input: ["abc1", "xyz", "test2", "data"]
//        Output: ["abc1", "test2"]
//
//        59. Replace negative numbers with 0
//        Input: [1, -2, 3, -4, 5]
//        Output: [1, 0, 3, 0, 5]
//
//        60. Find character frequency in a string
//        Input: "hello"
//        Output: {h=1, e=1, l=2, o=1}
    }
}
