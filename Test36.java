/**
 * Test36
 * 对象数组
 */

import java.util.Arrays;


public class Test36 {

    public static void main(String[] args) {
        HeroManager hm = new HeroManager();
        hm.add(new Hero(1,"瑞兹","流浪法师","男"));
        hm.add(new Hero(2, "盖伦", "德玛西亚之力", "男"));
        hm.add(new Hero(3,"艾希","寒冰射手","女"));
        hm.add(new Hero(4,"易","无极剑圣","男"));
        hm.add(new Hero(5,"索拉卡","众星之子","女"));
        hm.list();
        hm.delete(3);
        System.out.println("----delete 3------");
        hm.list();
        System.out.println("----update 2------");
        hm.update(new Hero(2,"盖伦","大保健","gay"));
        hm.list();
    }
}

//英雄管理类
class HeroManager{
    private Hero[] heros = new Hero[3];
    private int count=0;//当前下标（真实人数）

    //实现动态数组
    public void add(Hero hero){
        //判断是否存满。如果存满了则扩充数组
        if (count>=heros.length) {
            //扩充的算法（plan1：两倍，plan2：一半，向上取整）
            System.out.println("当前数组长度已满，长度为"+heros.length+",进行扩充");
            int newLen = heros.length*3/2+1;
            heros = Arrays.copyOf(heros, newLen);//将原来数组内的内容copy到一个新的长度的数组
            System.out.println("已进行扩充，长度为" + heros.length);
        }
        heros[count] = hero;
        System.out.println("添加Hero【"+hero.getName()+"】成功");
        count++;
    }

    public Hero find(int id){
        for (int i = 0; i < count;i++) {
            if(heros[i].getId()==id){
                return heros[i];
            }
        }
        return null;
    }

    public void update(Hero hero){
        Hero h = find(hero.getId());
        if (h != null) {
            h.setName(hero.getName());
            h.setTitle(hero.getTitle());
            h.setSex(hero.getSex());
        }
    }
    public void delete(int id){
        for (int i = 0; i < count; i++) {
            if(heros[i].getId()==id){
                System.out.println("删除"+ heros[i].getName());
                for (int j = i; j < count-1; j++) {//向前覆盖，实现删除切null不在中间
                    heros[j] = heros[j+1];
                }
                heros[count-1] = null;
                count--;
                break;
            }
        }
    }

    public void list(){
        for (int i = 0; i < count; i++) {
            heros[i].info();
        }
    }
}


//英雄类
class Hero{
    private String name;
    private String title;
    private String sex;
    private int id;

    public Hero(){}
    public Hero(int id,String name, String title, String sex){
        this.id = id;
        this.name = name;
        this.title = title;
        this.sex = sex;

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
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }
    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void info(){
        System.out.println("id:"+this.id+",title:"+this.title+",name:"+this.name+",sex:"+this.sex);
    }
}
