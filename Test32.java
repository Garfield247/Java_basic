/**
 * Test32
 * 字符串传递
 */
public class Test32 {

    public static void main(String[] args) {
        String name = "大明";//name会在常量池中生成一个大明
        method(name);//将name=大明赋值给n,由于大明已经在常量池中，所以n不会再2创建新的对象，将会直接指向大明
        //当n赋值为小明的时候，将会在常量池创建一个对象小明，n指向小明 ，而name依然为大明
        System.out.println(name);
    }
    private static void method(String n) {
        n = "小明";
    }
}
