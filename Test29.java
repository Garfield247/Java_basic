/**
 * Test29
 * String常用的方法
 *
 */
public class Test29 {

    public static void main(String[] args) {
        String s = "abdsanjhdfh123214";
        //长度
        System.out.println(s.length());
        //指定索引位置的字符
        char c = s.charAt(0);
        System.out.println(c);
        //转换为字符数组
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            System.out.print(cs[i]+",");
        }
        System.out.println();
        //字符串的截取
        String s1 = new String(s.toCharArray(),0,5);//字符数组
        System.out.println(s1);
        System.out.println(s.substring(0, 5));//字符串

        //判断是否以***开头/结尾
        // System.out.println(s.startsWith('a'));不能传入字符
        System.out.println(s.startsWith("abd"));
        System.out.println(s.endsWith("214"));
        //替换,会生成新的对象
        System.out.println(s.replace("d", "*"));
        System.out.println(s.replaceAll("\\d", "0"));
        System.out.println(s);

        //拆分
        String s2 = "sad,sdfd,eq,42,23,dsfsd,sa";
        String[] ss = s2.split(",");
        for (int i = 0; i < ss.length; i++) {
            System.out.print(ss[i]+"|");
        }
        System.out.println();
        //查找索引
        System.out.println(s2.indexOf("eq"));



    }
}
