/**
 * Test26
 *
 * 古典问题：数兔子
 * 有一对兔子，从出生后第 3 个月起每个月都生一对兔子，小兔
 * 子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数
 * 为多少？
 */
import java.util.Scanner;

public class Test26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        if (month>2){
            int b = (month-1)/2;
            int rubbit  = (int)Math.pow(2,b);
            System.out.println(rubbit);
        }else{
            System.out.println("2");
        }

    }
}
/**
 * 1 2
 * 2 2
 * 3 4
 * 4 4
 * 5 8
 * 每过两个月翻一倍
 */
