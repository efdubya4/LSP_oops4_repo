package src.org.howard.edu.lsp.midterm.question4;
/**
 * WordProcessor is a class for processing a sentence and finding the longest words.
 * WordProcessor objects are created with a sentence.
 * WordProcessor can find all the longest words in the sentence, handling varying amounts of whitespace.
 * If the input is empty or contains no words, it returns an empty list.
 */

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {
    private String sentence; // Stores the sentence to be processed

    // Constructor
    public WordProcessor(String sentence) {
        this.sentence = sentence;
    }

    /**
     * Finds all longest words in the sentence.
     *
     * @return A list of the longest words in the order they appear in the sentence.
     */
    public List<String> findLongestWords() {
        List<String> longestWords = new ArrayList<>();
        if (sentence == null || sentence.trim().isEmpty()) {
            return longestWords; // Return empty list for empty or null input
        }

        // Split the sentence into words, handling varying amounts of whitespace
        String[] words = sentence.trim().split("\\s+");

        // Find the length of the longest word
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        // Collect all words with the maximum length
        for (String word : words) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        return longestWords;
    }
}
    

