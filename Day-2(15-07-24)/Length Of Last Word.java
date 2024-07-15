import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s)); 
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        
        
        String[] words = s.split(" ");
        
       
        String lastWord = words[words.length - 1];
        
        
        return lastWord.length();
    }
}
