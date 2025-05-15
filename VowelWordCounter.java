

public class VowelWordCounter {

    public static int countWordsStartingWithVowel(String[] words) {
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toLowerCase(word.charAt(0));
                if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' ||
                    firstChar == 'o' || firstChar == 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] inputWords = {"Apple", "banana", "Orange", "umbrella", "Cat", "Elephant"};

        int vowelCount = countWordsStartingWithVowel(inputWords);
        System.out.println("Words starting with vowels: " + vowelCount);
        String a="Aryan";
   
       
    }
}
