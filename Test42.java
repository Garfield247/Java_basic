/**
 * Test42
 * 接口
 */
public class Test42 {

    public static void main(String[] args) {
        Person p = new Person();
        p.cry();
    }
}

class Person implements Hit{
    public void cry(){
        System.out.println("5555");
    }
}


interface Hit {

    String info = "da";//属性默认为常量public static final
    void cry();//接口中的方法默认为public
}

interface SubHit extends Hit{
    void eat();
    void default();//接口的默认方法
}
