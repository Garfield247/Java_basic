/**
 * Test04
 * 运算符
 */
import java.util.Scanner;
public class Test04{

    private static Scanner in;

    public static void main(String[] args){
        System.out.print("input");
        in = new Scanner(System.in);
        int x1 = in.nextInt();
        int num1 = x1/3;
        System.out.print(num1);
    }
}
