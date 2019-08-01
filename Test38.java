/**
 * Test38
 * 单例设置模式
 * 保证在一个类中仅有一个实例，并提供他一个人访问它的全集访问点
 * 1. 构造方法私有化(防止在本类之外实例化对象)
 * 2. 生命一个本类对象
 * 3  提供一个静态方法获取对象实例
 *
 * 通常在工具类的设计中使用
 * 当一个类中没有 对象状态
 * 该类作为工具使用非常频繁
 */

public class Test38 {

    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        s1.type();
        Single2 s2 = Single2.getInstance();
        s2.type();
    }
}

class Single{
    private static Single single = new Single();
    private Single(){}//构造方法私有化，防止在奔雷外部实例化对象
    public static Single getInstance(){
        return single;
    }
    void type(){
        System.out.println("饿汉式");
    }
}

class Single2 {
    private static Single2 single2 = null;

    private Single2() {}// 构造方法私有化

    public static Single2 getInstance(){
        if (single2==null) {
            single2 = new Single2();
        }
        return single2;
    }
    void type(){
        System.out.println("懒汉式");
    }
}

