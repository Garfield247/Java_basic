/**
 * Test20
 * 输入的一个整数，按相反顺序输出该数
 */

import java.util.Scanner;

public class Test20 {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println("输入任意整数");
        int num = scan.nextInt();
        //plan1-使用StringBuilder 的reverse 直接进行反转
        StringBuilder strb= new StringBuilder(Integer.toString(num));
        System.out.println("1.反转之后为" +strb.reverse());
        //plan2-将字符串转换为字符数组，逆序拼接并打印
        String str = String.valueOf(num);
        //String 的toCharArray方法将String转化为char数组
        char[] chars = str.toCharArray();
        String temp = "";
        for (int i = chars.length-1; i>=0; i--) {
            temp+= chars[i];
        }
        System.out.println("2.反转之后为"+temp);
    }
}
/**
 * int->String
 * 第一种方法：s=i+""; //会产生两个String对象
 * 第二种方法：s=String.valueOf(i);直接使用String类的静态方法，只产生一个对象
 * 第三种方法： s = Integer.toString(i);
 *
 *
 * String->int
 * 第一种方法：i=Integer.parseInt(s);//直接使用静态方法，不会产生多余的对象，但会抛出异常
 * 第二种方法：i=Integer.valueOf(s).intValue();//Integer.valueOf(s) 相当于 new Integer(Integer.parseInt(s))，也会抛异常，但会多产生一个对象
 */
