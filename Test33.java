/**
 * Test33
 * 字符串传递2
 */
public class Test33 {

    public static void main(String[] args) {
        Person p = new Person();//p在栈内存p.name 在堆内存，大明在堆内存的常量池中
        method(p);//person = p 则person.name 同样指向p.name ，在重新赋值时p.name 会指向常量池中新创建的小明
        System.out.println(p.name);//小明
    }
    private static void method(Person person) {
        person.name = "小明";
    }
}




class Person {
    String name="大明";

}
