public class Top4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32},
                {33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48},
                {49, 50, 51, 52, 53, 54, 55, 56}
        };

        int count = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                if (array[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        System.out.println("Toq sonlar soni: " + count);
    }
}
