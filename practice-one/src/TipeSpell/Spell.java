package TipeSpell;

public class Spell { ///revisado
    protected int magicEnergySpent;
    protected String name;
    // Constructor
    public Spell( String name, int magicEnergySpent) {
        this.name = name;
        this.magicEnergySpent = magicEnergySpent;
    }
    //Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMagicEnergySpent() {
        return magicEnergySpent;
    }
    public void setMagicEnergySpent(int magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }

    @Override
    public String toString() {

        return "\t name: " + name +
                "\n\t Magic energy spent: " + magicEnergySpent + "\n"
                ;
    }
}

















