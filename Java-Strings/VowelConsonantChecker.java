package javaString;
import java.util.*;

public class VowelConsonantChecker {
	
	 public static String checkCharType(char ch) {
	        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
	        if (ch >= 'a' && ch <= 'z') {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
	            else return "Consonant";
	        } else {
	            return "Not a Letter";
	        }
	    }

	    public static String[][] getCharTypes(String text) {
	        String[][] result = new String[text.length()][2];
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);
	            result[i][0] = String.valueOf(ch);
	            result[i][1] = checkCharType(ch);
	        }
	        return result;
	    }

	    public static void displayTable(String[][] table) {
	        System.out.printf("%-10s %-15s\n", "Character", "Type");
	        for (String[] row : table) {
	            System.out.printf("%-10s %-15s\n", row[0], row[1]);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] result = getCharTypes(input);
        displayTable(result);
	}

}
