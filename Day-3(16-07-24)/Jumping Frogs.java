import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int leaves = scanner.nextInt();
        int[] frogs = new int[N];
        for (int i = 0; i < N; i++) {
            frogs[i] = scanner.nextInt();
        }

        Set<Integer> visited = new HashSet<>();
        for (int frog : frogs) {
            for (int i = frog; i <= leaves; i += frog) {
                visited.add(i);
            }
        }

        int unvisited = leaves - visited.size();
        System.out.println(unvisited);
    }
}
