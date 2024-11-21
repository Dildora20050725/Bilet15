import java.util.Scanner;

public class Top6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n sonini kiriting:");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                int diff = i;
                while (diff >= j) {
                    diff -= j;
                }
                if (diff == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
