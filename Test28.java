/**
 * Test28
 * 字符串的内存
 */
public class Test28 {

    public static void main(String[] args) {
        System.out.println("String 的两种赋值方式：");
        String s1 = "直接赋值";
        String s11 = "直接赋值";
        System.out.println(s1==s11);
        String s2 = new String("使用NEW");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("两种方式的区别：\n第一种方式会在堆内存的常量池中检索该对象,\n若存在则直接引用若不存在则再创建，并指向该对象\n 第二种回额外再堆内存种开辟一块内存存放该对象");
        System.out.println("------字符串相加时，编译期和运行期的分析-------");
        //字符串直接赋值时，要看值在编译期能不能确定，如果能确定就会在常量池中创建，并指向该对象如果不能就在运行期在堆种创建对象
        String a = "a";
        String a1 = a+1;//编译期a1的值不能确定到运行期才能确定
        String b = "a1";//会在常量池中直接创建
        System.out.println(b==a1);//false

        final String c = "c";//final 将c 定义为常亮，此时c1在编译期就能确定
        String c1 =c+1;
        String b1 = "c1";
        System.out.println(c1==b1);

        final String d =getD();//虽然这里d被定义为了常量，但是因为他是调用方法得到的返回值，所以只能在运行期才能被确定
        String d1 = d+1;
        String b2 = "d1";
        System.out.println(d1==b2);

        String e = "e"+1;//"e"是常量1也是常量所以在编译期e的值就可以确定
        String b3 = "e1";
        System.out.println(e==b3);
    }
    public static String  getD() {
        return "d";

    }
}

