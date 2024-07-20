 import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(maxOddBinary(str));
    }

    public static String maxOddBinary(String str) {
        int ones = 0;
        for (char c : str.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }
        if (ones == 0) {
            return new String(new char[str.length()]).replace('\0', '0');
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ones - 1; i++) {
            result.append('1');
        }
        for (int i = 0; i < str.length() - ones; i++) {
            result.append('0');
        }
        result.append('1');
        return result.toString();
    }
}
