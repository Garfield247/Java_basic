/**
 * Test40 实现一个化妆品商城中的化妆品管理
 * 1.化妆品类
 * 2.化妆品管理类1.进货2.输出化妆品信息
 * 3.使用继承实现一个可按单价输出所有化妆品的功能
 * 4.使用继承实现一个只输出进口化妆品的功能
 */
import java.util.Arrays;

public class Test40 {

    public static void main(String[] args) {
        System.out.println("-------CosmeticManager---------");
        CosmeticManager cm = new CosmeticManager();
        cm.add(new Cosmetic("纪梵希", 324.23f,"进口"));
        cm.add(new Cosmetic("大宝", 123.23f,"国产"));
        cm.add(new Cosmetic("阿玛尼", 442.23f,"进口"));
        cm.add(new Cosmetic("香奈儿", 334.23f,"进口"));
        cm.printInfo();

        System.out.println("------SortCosmeticManager------");
        SortCosmeticManager scm = new SortCosmeticManager();
        scm.add(new Cosmetic("纪梵希", 324.23f,"进口"));
        scm.add(new Cosmetic("大宝", 123.23f,"国产"));
        scm.add(new Cosmetic("阿玛尼", 442.23f,"进口"));
        scm.add(new Cosmetic("香奈儿", 334.23f,"进口"));
        scm.printInfo();

        System.out.println("------ImportCosmeticManager-----");
        ImportCosmeticManager icm = new ImportCosmeticManager();
        icm.add(new Cosmetic("纪梵希", 324.23f,"进口"));
        icm.add(new Cosmetic("大宝", 123.23f,"国产"));
        icm.add(new Cosmetic("阿玛尼", 442.23f,"进口"));
        icm.add(new Cosmetic("香奈儿", 334.23f,"进口"));
        icm.printInfo();
    }
}
class SortCosmeticManager extends CosmeticManager{
    public void printInfo(){
        Cosmetic[] temp = super.cosmetics;
        //冒泡排序
        for (int i = 0; i < super.count-1; i++) {
            for (int j = 0; j < super.count-1-i; j++) {
                if(temp[j].getPrice()>temp[j+1].getPrice()){
                    Cosmetic tmp = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < super.count; i++) {
            System.out.println(temp[i].getInfo());
        }
    }
}
class ImportCosmeticManager extends CosmeticManager{
    public void printInfo() {
        Cosmetic[] temp = super.cosmetics;
        for (int i = 0; i < super.count; i++) {
            if (temp[i].getType().equals("进口")) {
                System.out.println(temp[i].getInfo());
            }
        }
    }
}
//化妆品管理类
class CosmeticManager{
    protected Cosmetic[] cosmetics = new Cosmetic[3];
    protected int count = 0;

    // 进货
    public void add(Cosmetic c){
        if(count>=cosmetics.length){
            int newLen = cosmetics.length*3/2+1;
            cosmetics = Arrays.copyOf(cosmetics,newLen);
        }
        cosmetics[count] = c;
        count++;
    }
    //输出信息
    public void printInfo(){
        for (int i = 0; i < count; i++) {
            System.out.println(cosmetics[i].getInfo());
        }
    }
}

//化妆品类
class Cosmetic{
    private String name;
    private float price;
    private String type;

    public Cosmetic(){}
    public Cosmetic(String name,float price,String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    public String getInfo(){
        return "name:"+name+",price:"+price+",type:"+type;
    }

}
