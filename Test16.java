/**
 * Test16
 * 模拟双色球
 */

import java.util.Random;
import java.util.Scanner;


public class Test16 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan  = new Scanner(System.in);

        int[] redBall = new int[33];

        int[] sysRedBall = new int[6];
        int sysBlueBall = 0;
        int[] userRedBall = new int[6];
        int userBlueBall = 0;

        //模拟红球池
        for (int i = 0; i < redBall.length; i++) {
            redBall[i] = i+1;
        }
        // for (int i = 0; i < redBall.length; i++) {
        //     System.out.print(redBall[i]);
        // }
        //系统选球
        for (int i = 0; i < sysRedBall.length; i++) {
            while (true) {
                int index = rand.nextInt(33);
                if(redBall[index] != -1){
                    sysRedBall[i] = redBall[index];
                    redBall[index] = -1;
                    break;
                }
            }
        }
        sysBlueBall = rand.nextInt(16)+1;


        //用户选球
        System.out.println("请选择6个红球【1-33】");
        for (int i = 0; i < userRedBall.length; i++) {
            while (true) {
                System.out.println("第" + (i + 1) + "个红球");
                int urb = scan.nextInt();
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if(urb==userRedBall[j]){
                        System.out.println("这个号码您已经选过了！！！");
                        flag = false;
                    }
                }
                if(flag){
                    userRedBall[i] = urb;
                    System.out.println("选号成功");
                    break;
                }
            }

        }
        System.out.println("请选择篮球【1-16】");
        userBlueBall = scan.nextInt();

        System.out.println("您的投注号码为");
        System.out.print("红球：【");
        for (int i = 0; i < userRedBall.length; i++) {
            System.out.print(userRedBall[i] + " ");
        }
        System.out.println("】篮球：【" + userBlueBall + "】");

        System.out.println("开奖号码为");
        System.out.print("红球：【");
        for (int i = 0; i < sysRedBall.length; i++) {
            System.out.print(sysRedBall[i] + " ");
        }
        System.out.println("】篮球：【" + sysBlueBall + "】");
        //对比结果
        int redNum = 0;
        int blueNum = 0;
        int[] trueRedNum = new int[6];
        for ( int i = 0; i < userRedBall.length; i++) {
            for (int j = 0; j < sysRedBall.length; j++) {
                if (userRedBall[i] == sysRedBall[j]) {
                    trueRedNum[redNum] = userRedBall[i];
                    redNum+=1;
                }
            }
        }
        if (userBlueBall == sysBlueBall) {
            blueNum =1;
        }
        System.out.print("红球中"+redNum+"个,");
        if (redNum>0) {
            System.out.print("分别为");
            for (int i = 0; i < trueRedNum.length; i++) {
                if (trueRedNum[i] != 0) {
                    System.out.print(trueRedNum[i] + "、");
                }
            }
        }


        System.out.print("篮球"+blueNum+"个");



    }
}
