/**
 * Test17
 * 输入一个字符，判断它是否为小写字母，如果是，将它转换成大写
 */
import java.util.Scanner;


public class Test17 {
    // 小写字母（a-z）的ascll值为97-122
    // 大写字母（A-Z）的ascll值为65-90
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入任意字母");
        char input = scan.next().charAt(0);
        if (input>=97&&input<=122) {
            char caps = (char)(input-32);
            System.out.println(input+"是小写字母，转换为大写字母为"+caps);
        }else{
            System.out.println("不是 小写");
        }
    }
}
