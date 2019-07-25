/**
 * Test09
 * 猜数游戏输入任意一个数
 */
import java.util.Random;
import java.util.Scanner;



public class Test09 {

    private static Scanner inp;

    public static void main(String[] args) {
        int[] nums = new int[20];
        int len = nums.length;
        Random rand = new Random();
        for(int i=0;i<len;i++){
            nums[i] = rand.nextInt(20);
        }

        inp = new Scanner(System.in);
        System.out.println("输入0-20的数字");
        int input = inp.nextInt();
        System.out.println("您输入的是"+input);
        boolean flag = false;
        for (int i=0;i<len;i++){
            // System.out.println(nums[i]);
            if(input == nums[i]){
                System.out.println("OK!");
                flag = true;
                continue;
            }
        }
        if(flag){
            System.out.println("6666!");
        }else{
            System.out.println("cai");
        }
        System.out.println("所有数为");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + ",");
        }
    }

}
