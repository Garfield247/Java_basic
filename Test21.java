/**
 * Test21
 * 计算1-200之间的3的倍数之和
 */
public class Test21 {

    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        System.out.print(sum);
        while (num<=200) {
            if (num%3 == 0) {
                System.out.print("+"+num);
                sum+=num;
            }
            num+=1;
        }
        System.out.println("="+sum);
    }
}
