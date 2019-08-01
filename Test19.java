/**
 * Test19
 * 根据输入的年、月、日，给出该天是该年的第多少天
 */
import java.util.Scanner;


public class Test19 {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println("year");
        int year = scan.nextInt();
        System.out.println("month");
        int month = scan.nextInt();
        System.out.println("day");
        int day = scan.nextInt();
        int days = 0;
        if (month>12) {
            System.out.println("一年只有12个月！");
        }
        if (day>31) {
            System.out.println("没有多余31天的月！");
        }
        switch (month) {
            case 12:days+=30;
            case 11:days+=31;
            case 10:days+=30;
            case 9 :days+=31;
            case 8 :days+=31;
            case 7 :days+=30;
            case 6 :days+=31;
            case 5 :days+=30;
            case 4 :days+=31;
            case 3 :
                if (year%4==0) {
                    System.out.println("闰年");
                    days+=29;
                }else{
                    System.out.println("平年");
                    days+=28;
                }
            case 2 :days+=31;
            case 1 :days+=day;
        }
        System.out.println(days);
    }
}
