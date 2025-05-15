import java.util.*;
import java.util.stream.Collectors;

public class groupStream {

    public static void main(String[] args) {
        String[] words = {
            "apple", "banana", "apricot", "blueberry", "cherry",
            "avocado", "blackberry", "cranberry", "date"
        };
        Map<Character, List<String>> groupedWords = Arrays.stream(words)
            .collect(Collectors.groupingBy(
                word -> word.charAt(0),                       
                Collectors.collectingAndThen(
                    Collectors.toList(),                       
                    list -> list.stream()
                               .sorted()
                               .collect(Collectors.toList())  
                )
            ));

        groupedWords.forEach((letter, wordList) -> {
            System.out.println(letter + ": " + wordList);
        });
    }
}
