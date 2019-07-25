/**
 * Test10
 * 打印三角形
 */


public class Test10 {

    public static void main(String[] args) {
        char[] chars = new char[]{'A','B','C','D','E','F'};
        int len = chars.length;
        for(int i=0;i<len;i++){
            System.out.print("|");
            for(int j=0;j<(len-i);j++){
                System.out.print(" ");
            }
            for(int x=0;x<=2*i;x++){
                System.out.print(chars[i]);
            }
            for (int j = 0; j < (len - i); j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

    }
}
