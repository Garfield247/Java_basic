/**
 * Test08
 * 数组的空指针异常java.lang.NullPointerException
 */
public class Test08 {

    public static void main(String[] args ) {
        String[] names = new String[2];
        names[0] = "aaa";
        System.out.println(names[0]);
        System.out.println(names[1].length());
    }
}
