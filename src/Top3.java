public class Top3 {
    public static void p_function(int... nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        p_function(20, 30);
        p_function(40, 60, 80);
    }
}
