/**
 * Test37
 * foreach循环、可变参数、代码块
 */
public class Test37 {
    static{
        System.out.println("静态块");// 在创建对象时执行，在构造块之前执行
    }

    {
        System.out.println("构造块");//在创建对象时执行，在构造方法之前执行
    }
    public Test37(){
        System.out.println("构造方法");
    }
    public static void main(String[] args) {
        String[] names = {"ming","gang","hua","wei","lili"};
        Test37 t = new Test37();
        System.out.println(t);
        for (String name:names){
            System.out.println(name);
        }
        System.out.println("-----可变参数-------");
        output("ming", "gang", "hua", "wei", "lili");
    }

    //可变参数,可变参数只能有一个，并且只能在参数列表的最后一个（params）
    public static void output(String ... params) {//普通代码块：大括号里面的代码块
        for (String s:params){
            System.out.println(s);
        }
    }
}

