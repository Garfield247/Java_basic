/**
 * Test15
 * 选择排序
 */
public class Test15 {

    public static void main(String[] args) {
        int[] nums = new int[] { 212, 3312, 423, 32, 234, 32, 423, 41, 3, 21 };
        int len = nums.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if (nums[i]>nums[j]) {
                    int temp = 0;
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + ",");

        }
    }
}
