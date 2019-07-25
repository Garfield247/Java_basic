/**
 * Test14
 * 冒泡排序
 */
public class Test14 {


    public static void main(String[] args) {
        int[] nums = new int[]{212,3312,423,32,234,32,423,41,3,21};
        int len = nums.length;
        for (int i = 0; i < len-1; i++) { //控制比较的轮数
            System.out.println("比较第"+i+"轮");
            for (int j = 0; j < len-1-i; j++) { //控制每轮比较的个数
                if (nums[j]<nums[j+1]) {
                    int temp = 0;
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+",");
        }
    }
}
