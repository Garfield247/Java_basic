/**
 * Test25
 * 编程求出所有三位的水仙花数。
 * 水仙花数是指一个 n 位数 ( n≥3 )，它的每个位上的数字的 n 次幂之和等于它本身。（例如：1^3 + 5^3 + 3^3 = 153）。
 */

public class Test25 {

    public static void main(String[] args) {
        for (int i = 100; i <=999; i++) {
            int a = i/100;
            int b = i%100/10;
            int c = i%10;
            if ((Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)) == i){
                System.out.println(i);
            }
        }
    }
}
/**
 * Math.pow(a, b)//计算a的b次方
 */
