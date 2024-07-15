import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int N = scanner.nextInt();
        
        
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }
        
        
        int result = countBuildingsWithSunriseView(heights);
        
        
        System.out.println(result);
        
        scanner.close();
    }

    public static int countBuildingsWithSunriseView(int[] heights) {
        int count = 0;
        int maxHeight = 0;
        
        for (int height : heights) {
            if (height > maxHeight) {
                count++;
                maxHeight = height;
            }
        }
        
        return count;
    }
}
