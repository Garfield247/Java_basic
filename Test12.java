/**
 * Test12
 * 多维数组求平均值
 */
public class Test12 {

    public static void main(String[] args) {
        int[][] score = new int[][]{{34,21,43},{12,32,56},{232,343,45,233}};
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum+=score[i][j];
            }
            double sum2 = (double)sum;
            double mean = sum2/score[i].length;
            System.out.println("第"+i+"个的平均值为"+mean);
        }
    }
}
