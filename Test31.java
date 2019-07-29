/**
 * Test31
 *  引用传递
 */
public class Test31 {


    public static void main(String[] args) {
        Weapon w = new Weapon();//w在栈内存w.age在堆内存
        method(w);//w1=w(内存地址)   w1也指向w.age ，所以操作的也是w.age
        System.out.println(w.age);//5
    }
    private static void method(Weapon w1) {
        w1.age = 5;
    }
}

class Weapon {

    int age = 2;
}
