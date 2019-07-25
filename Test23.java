/**
 * Test23
 * 解决“百钱买百鸡”问题。
 * 公鸡五钱一只，母鸡三钱一只，小鸡一钱三只，现有百钱欲买百鸡，列出买法
 */
public class Test23 {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {//公鸡
            for (int j = 0; j < 33; j++) {//母鸡
                for (int n = 0; n <= 100-i-j; n+=3) {//小鸡
                    if (i*5+j*3+n/3==100&&i+j+n==100){
                        System.out.println("公鸡："+i+",母鸡："+j+",小鸡："+n);
                    }
                }
            }
        }
    }
}
