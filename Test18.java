/**
 * Test18
 * 输入三个正整数，判断是否能组成三角形
 */

import java.util.Scanner;

public class Test18 {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println("依次输入三个正整数");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a<=0||b<=0||c<=0){
            System.out.println("必须输入正整数");
        }
        if ((a+b)>c&&(a+c)>b&&(b+c)>a) {
            System.out.println("正整数"+a+"、"+b + "、"+c+"能够构成三角形");
        }else{
            System.out.println("正整数" + a + "、" + b + "、" + c + "不能够构成三角形");
        }
    }
}
