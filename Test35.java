/**
 * Test35
 * static关键字
 * 静态属性和静态方法是归类所有，不用创建对象即可使用
 * 静态方法内不能调用非静态属性和方法
 * 静态属性和方法一般用于该类全局的一些相关内容
 * 
 */
public class Test35 {

    public static void main(String[] args) {
        Book book1 = new Book("python",9.9f);
        System.out.println(Book.count);
        Book book2 = new Book("java", 9.8f);
        System.out.println(Book.count);
        Book book3 = new Book("golang",9.6f);
        System.out.println(Book.count);
        book1.info();
        // book1.count = 1;//静态属性使用的错误案例
        // System.out.println(book1.count);//静态属性使用的错误案例
        book2.info();
        // System.out.println(book2.count);//静态属性使用的错误案例
        book3.info();

    }
}
class Book{
    private String name;
    private float price;
    static int count = 0;

    public Book(String name,float price){
        this.name = name;
        this.price = price;
        count++;
    }

    public void info() {
        System.out.println("name:"+this.name+",price:"+this.price);
    }
}
