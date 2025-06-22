package javaString;
import java.util.*;

public class WordLengthFinder {
	
	public static String[] splitWords(String text) {
        String[] words = new String[100];
        int index = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }
        if (!word.equals("")) {
            words[index++] = word;
        }
        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = words[i];
        }
        return result;
    }

    public static int findLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        for (int i = 0; i < data.length; i++) {
            String word = data[i][0];
            int length = Integer.parseInt(data[i][1]);
            System.out.printf("%-15s %-10d\n", word, length);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        String[] words = splitWords(text);
        String[][] result = getWordsWithLengths(words);
        displayResult(result);
	}

}
