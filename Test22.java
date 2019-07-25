/**
 * Test22
 * 200到500之间的素数
 */
public class Test22 {

    public static void main(String[] args) {
        int start = 200;
        System.out.print("200-500之间的素数有：");
        while (start<=500) {
            boolean flag = true;
            for (int i = 2; i < start; i++) {
                if(start%i==0){
                    flag = false;
                }
            }
            if (flag){
                System.out.print(start+",");
            }
            start+=1;
        }


    }
}
