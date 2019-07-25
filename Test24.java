/**
 * Test24
 * 求 1~10000 之间的所有“完全数”
 * 完全数是该数的所有因子之和等于该数的数。例如，6 的因子有 1、2、3，且 6=1+2+3，所以6 是完全数。
 */
public class Test24 {

    public static void main(String[] args) {
        int num = 0;
        while (num<10000) {
            int sum = 0;
            for (int i = num-1; i>0; i--) {
                if (num%i==0){
                    sum+=i;
                }
            }
            if (sum==num){
                System.out.print(num+"是完全数，因子为：");
                for (int i = num - 1; i > 0; i--) {
                    if (num % i == 0) {
                        System.out.print(i+",");
                        sum += i;
                    }
                }
                System.out.println();
            }
            num+=1;
        }
    }
}
