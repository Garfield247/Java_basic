/**
 * Test07
 * for循环&数组
 */
public class Test07 {
    public static void main(String[] args) {
        int[] il= new int[10];
        for(int i=0;i<il.length;i++){
            il[i] = i*3;
        }
        for(int i=0;i<il.length;i++){
            System.out.println(il[i]);
        }
    }
}
