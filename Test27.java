/**
 * Test27
 * 分解质因数
 */

import java.util.Scanner;

public class Test27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入一个整数：");
        int num = scan.nextInt();
        System.out.print(num+"的质因数为");
        for (int i = 2; i < num; i++) {
            while (num%i==0) {
                num/=i;
                System.out.print(i+"*");
            }
        }
        System.out.println(num);
    }
}
