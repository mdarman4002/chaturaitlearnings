import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(resultantString(s));
    }

    public static String resultantString(String s) {
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                result.reverse();
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
