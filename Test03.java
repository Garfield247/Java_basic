/**
 * Test03
 * java 数据类型之间的转换
 */

public class Test03{
    public static void main(String[] args){
        //byte,short,int -> float -> long -> double
        //自动抓换
        int a = 10;
        float f = a;
        System.out.println(f);
        byte b=20;
        //Error 1默认是整形，与B运算玩会返回整数，计算不能用byte 接收,需要用int接收
        //byte c= b+1;
        int c = b+1;
        System.out.println(c);
        //如果非要用 byte,要进行强制转换 (type)object,强制抓换可能会损失精度
        byte d = (byte)(b+1);
        System.out.println(d);
        char c1 = 'a';
        char c2 = 'b';
        int x1 = c1;
        int x2 = c2;
        System.out.println(x1+"--"+x2);
    }
}
