package javaString;
import java.util.Scanner;

public class ShortestLongestWord {
	
	public static String[] splitWords(String text) {
        text += " ";
        String[] temp = new String[text.length()];
        int count = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                temp[count++] = word;
                word = "";
            }
        }
        String[] words = new String[count];
        for (int i = 0; i < count; i++) words[i] = temp[i];
        return words;
    }

    public static int length(String str) {
        int len = 0;
        try {
            while (true) str.charAt(len++);
        } catch (Exception e) {}
        return len;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String[] words = splitWords(sc.nextLine());

        String shortest = words[0], longest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (length(words[i]) < length(shortest)) shortest = words[i];
            if (length(words[i]) > length(longest)) longest = words[i];
        }

        System.out.println("Shortest word: " + shortest + " (Length: " + length(shortest) + ")");
        System.out.println("Longest word: " + longest + " (Length: " + length(longest) + ")");
	}

}
