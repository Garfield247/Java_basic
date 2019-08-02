/**
 * Test41
 * 抽象类
 */
public class Test41 {

    public static void main(String[] args) {

    }
}

class Man extends Person{// 具体类继承抽象类必须继承抽象类的方法
    public void eat(){
        System.out.println("chi");
    }
}

abstract class Person{//抽象类、并不能被实例化，不能声明为final
    private String name;

    public abstract void eat();//抽象方法,抽象类不一定有抽象方法，但抽象方法一定在抽象类之内

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
