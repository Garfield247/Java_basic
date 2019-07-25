/**
 * Test13
 * 最大值最小值
 *
 */

import java.util.Scanner;


public class Test13 {

    private static int find_max(int[] numlist) {
        int res = numlist[0];
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] > res) {
                res = numlist[i];
            }
        }
        return res;
    }

    private static int find_min(int[] numlist) {
        int res = numlist[0];
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] < res) {
                res = numlist[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("要比较的个数");
        int len = scan.nextInt();
        int[] numlist = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("数如第"+(i+1)+"/"+len+"个");
            numlist[i] = scan.nextInt();
        }
        System.out.print("输入的数字为：");
        for (int i = 0; i < len; i++) {
            System.out.print(numlist[i]+",");
        }
        System.out.println();
        int max = find_max(numlist);
        System.out.println("最大值："+max);
        int min = find_min(numlist);
        System.out.println("最小值：" + min);
    }
}
