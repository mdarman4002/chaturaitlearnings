import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
           
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            
            
            if (2 * l <= r) {
               
                System.out.println(l + " " + (2 * l));
            } else {
                
                System.out.println("-1 -1");
            }
        }
        
        scanner.close();
    }
}
