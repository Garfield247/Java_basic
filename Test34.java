/**
 * Test34
 * 对象的一对一关系`
 */
public class Test34 {

    public static void main(String[] args) {
        Hero jax = new Hero();
        jax.setName("贾克斯");
        jax.setAge(100);

        Weapon light = new Weapon();
        light.setName("路灯");
        light.setStar(5);

        //关联设置
        jax.setWeapon(light);
        light.setHero(jax);

        //get获取
        System.out.println(jax.getWeapon().getName());
        System.out.println(light.getHero().getName());
    }
}
class Hero{
    private String name ;
    private int age;
    private Weapon weapon;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
class Weapon{
    private String name;
    private int star;
    private Hero hero;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStar() {
        return star;
    }
    public void setStar(int star) {
        this.star = star;
    }
    public Hero getHero() {
        return hero;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
