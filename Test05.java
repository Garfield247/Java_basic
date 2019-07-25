/**
 * Test05
 * 关系运算符
 */
public class Test05{
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;

        //& 先算两边在计算
        //&& 先计算左边，如果为true再计算右边，如果为false就直接false，|，||同之
        System.out.println("a&b"+(a&b));
        //异或 相同为false不同为true
        System.out.println("a^b" + (a ^ b));
    }
}
