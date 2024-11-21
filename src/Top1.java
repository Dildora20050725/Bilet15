import java.util.Scanner;

public class Top1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matnni kiriting:");
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'd' || input.charAt(i) == 'D') {
                count++;
            }
        }

        System.out.println("'d' harfi soni: " + count);
    }
}
