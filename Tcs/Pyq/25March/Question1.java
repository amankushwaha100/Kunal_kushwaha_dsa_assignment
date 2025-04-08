import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sting: ");
        String input = sc.nextLine().trim();

        if(input.isEmpty()){
            System.out.println("Invalid Input");
            return ;
        }

        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        LinkedHashMap<Character, Integer> firstOccurrence = new LinkedHashMap<>();

        int maxFrequency = 0;
        char mostRepeatedChar = '\0';

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0)+ 1);
            firstOccurrence.putIfAbsent(ch, i);

            if(charCount.get(ch) > maxFrequency){
                maxFrequency = charCount.get(ch);
                mostRepeatedChar = ch;
            }
        }
        Character firstRepeating = null;
        for(char ch: charCount.keySet()){
            if(charCount.get(ch)>1){
                firstRepeating = ch;
                break;
            }
        }    
        Character firstNonRepeating = null;
        for(char ch: charCount.keySet()){
            if(charCount.get(ch)==1){
                firstNonRepeating = ch;
                break;
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " times, first occurrence at index " + firstOccurrence.get(entry.getKey()));
        }

        System.out.println("\nMost Repeated Character: " + mostRepeatedChar + " (appears " + maxFrequency + " times)");

        if (firstNonRepeating != null) {
            System.out.println("First Non-Repeating Character: " + firstNonRepeating);
        } else {
            System.out.println("First Non-Repeating Character: None, First Repeating Character: " + firstRepeating);
        }

        sc.close();

    }
}
