/**
 * Test39
 * 类的继承
 * Java 只能实现单继承，但可以多层继承
 * 继承只能继承非私有的属性和方法
 * 构造方法不能被继承
 */
public class Test39 {

    public static void main(String[] args) {
        //子类实例化时会先实例化父类
        Dog d = new Dog("二哈");
        d.info();
        d.desc();
    }
}

//父类
class Animal{
    public Animal(String name){
        System.out.println("Animal");
    }
    //如果属性需要被子类继承，可以和使用protected关键字进行声明
    protected String name;
    protected void desc(){
        System.out.println("animal name is"+name);
    }
}

//子类
//extends 只能单继承
class Dog extends Animal{
    public Dog(String name){
        super(name);//当父类的构造方法有参数时使用super调用父类的构造方法//必须在子类构造方法的第一行
        System.out.println("Dog");
        this.name = name;
    }
    public void info(){
        System.out.println("name:"+name);
    }
    //重写父类方法
    //返回值、方法名、参数列表必须一致
    // 子类抛出的异常不能超过父类抛出的异常
    //子类方法的访问级别必须大于父类的访问级别
    public void desc(){
        super.desc();//调用父类的方法
        System.out.println("Dog name is" + name);
    }
}


