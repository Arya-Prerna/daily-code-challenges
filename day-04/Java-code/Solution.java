import java.util.*;

public class Solution {
    public static String palindrome(String n) {
        StringBuilder reversed = new StringBuilder(n);
        reversed = reversed.reverse();
        return n.equals(reversed.toString()) ? "Palindrome" : "Not a palindrome";
    }
    public static int vowels(String n){
        String input = n.toLowerCase();
        int count = 0;
        String vowel = "aeiou";
        for(int i=0; i<input.length(); i++){
            for (int j = 0; j < vowel.length(); j++) {
                if (input.charAt(i) == vowel.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String reverseStr(String n) {
        return new StringBuilder(n).reverse().toString();
    }

    public static String caesarCipher(String n, int shift){
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<n.length(); i++){
            char c = n.charAt(i);
            if(Character.isLetter(c)){
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char shifted = (char) ((c-base+shift)%26+base);
                ans.append(shifted);
            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }

    public static boolean anagram(String n1, String n2){
        if (n1.length() != n2.length()){
            return false;
        }
        char[] array1 = n1.toCharArray();
        char[] array2 = n2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shift = 0;
        String word2 = "";
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        System.out.println();
        System.out.println(palindrome(word));
        System.out.println();
        System.out.println(vowels(word));
        System.out.println();
        System.out.println(reverseStr(word));
        System.out.println();
        System.out.print("Enter the shift value: ");
        shift = sc.nextInt();
        // `nextInt()` leaves the newline in the buffer, so we must consume it
        // before calling `nextLine()` for the next input.
        sc.nextLine();
        System.out.print(caesarCipher(word, shift));
        System.out.println();
        System.out.print("Enter the string 2 for anagram: ");
        word2 = sc.nextLine();
        System.out.println(anagram(word, word2));
        sc.close();
    }
}
