package superclass;

public abstract class CharactTwo {
    protected String name;
    protected static String u1="A";
    protected static String u2="B";
    protected static String u3="C";
    protected Integer standardOfLiving;
    protected Integer magicalEnergy;

    public CharactTwo(String name, Integer standardOfLiving, Integer magicalEnergy) {
        this.name = name;
        this.standardOfLiving = standardOfLiving;
        this.magicalEnergy = magicalEnergy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getU1() {
        return u1;
    }

    public static void setU1(String u1) {
        CharactTwo.u1 = u1;
    }

    public static String getU2() {
        return u2;
    }

    public static void setU2(String u2) {
        CharactTwo.u2 = u2;
    }

    public static String getU3() {
        return u3;
    }

    public static void setU3(String u3) {
        CharactTwo.u3 = u3;
    }

    public Integer getStandardOfLiving() {
        return standardOfLiving;
    }

    public void setStandardOfLiving(Integer standardOfLiving) {
        this.standardOfLiving = standardOfLiving;
    }

    public Integer getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(Integer magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }
    public abstract void game();//metodo abstracto

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", standardOfLiving=" + standardOfLiving +
                ", magicalEnergy=" + magicalEnergy +
                '}';
    }
}
