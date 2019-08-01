import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FIRST string:");
        String firstWord, secondWord;
        firstWord = sc.nextLine();
        System.out.println("Enter SECOND string:");
        secondWord = sc.nextLine();
        char[] word1 = firstWord.toLowerCase().replaceAll(" ", "").toCharArray();
        char[] word2 = secondWord.toLowerCase().replaceAll(" ", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        if (Arrays.equals(word1, word2))
            System.out.println(Arrays.equals(word1, word2) + "! the words are anagrams!");
        else
        System.out.println(Arrays.equals(word1, word2) + "! the words ARE NOT the anagrams, please try again.");
    }
}
