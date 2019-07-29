/**
 * Test30
 * 值传递
 */
public class Test30 {

    public static void main(String[] args) {
        int x = 10;//x基本数据类型 ，局部变量 ，存在栈里
        method(x);//执行到这里的时候mx=x=10,然后 mx=20 ,变化的之后mx ，x没有变化依然是10
        System.out.println(x);//10
    }
    private static void method(int mx) {
        mx = 20;
    }
}
