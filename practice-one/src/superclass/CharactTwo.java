package superclass;

public abstract class CharactTwo {
    protected String name;

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
