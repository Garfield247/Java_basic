/**
 * Test42
 * 接口
 * 接口是一组行为的规范、定义
 */
public class Test42 {

    public static void main(String[] args) {
        Person p = new Person();
        p.cry();
    }
}

class Person implements Hit,Eat{//一个类可以实现多个接口
    public void cry(){
        System.out.println("5555");
    }
}

//interface  定义接口关键字
interface Hit {

    String info = "da";//属性默认为常量public static final
    void cry();//接口中的方法默认为public
}

interface SubHit extends Hit,Eat{//接口可以被继承,可以多继承
    void eat();
    static void default(){//JDK1.8新特性
        System.out.println("default");
    }//
}

interface Eat{
    void eat();

}
