/**
 * Test02
 * java 8种基本数据类型
 */

public  class Test02{
    public static void main(String[] args){
        System.out.println("类型|占用空间|取值范围|默认值|例");
        boolean b = true;//1bit
        System.out.println("Boolean|1bit|true OR false|false|"+b);
        byte bytes = 127;//1bit
        System.out.println("byte|1bit|-128~127|0|"+bytes);
        int i = 10;//4bit
        System.out.println("int|4bit|-2^31~2^31-1|0|"+i);
        short s = 20;//2bit
        System.out.println("short|2bit|-2^15~2^15-1|0|"+s);
        long x = 100l;//8bit
        System.out.println("long|8bit|-2^63~2^63-1|0L|" + x);
        float f = 10.25f;//4bit
        System.out.println("float|4bit|----|0.0f|" + f);
        double d = 31.34d;//8bit
        System.out.println("double|8bit|----|0.0d|" + d);
        char a = 'a';//2bit
        System.out.println("char|2bit|/u0000-/uffff|null|" + a);
        char a2 = 97;
        System.out.print(a2);
    }
}
