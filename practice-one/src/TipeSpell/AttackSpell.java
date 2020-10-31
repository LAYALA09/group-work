package TipeSpell;

public class AttackSpell extends Spell {
    private int damageMade;
    public AttackSpell(String name, int magicEnergySpent, int damageMade) {
        super(magicEnergySpent);
        name = name;
        this.damageMade = damageMade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void setMagicEnergySpent(int magicEnergySpent) {
        super.setMagicEnergySpent(magicEnergySpent);
    }
    @Override
    public int getMagicEnergySpent() {
        return super.getMagicEnergySpent();
    }
    public int getDamageMade() {
        return damageMade;
    }
    public void setDamageMade(int damageMade) {
        this.damageMade = damageMade;
    }
}
