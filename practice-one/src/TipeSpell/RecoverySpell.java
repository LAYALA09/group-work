package TipeSpell;

public class RecoverySpell extends Spell {

    int energyRecovered;
    public RecoverySpell(int magicEnergySpent, int energyRecovered) {
        super(magicEnergySpent);
        this.energyRecovered = energyRecovered;
    }
    //Getter & Setter
    public int getEnergyRecovered() {
        return energyRecovered;
    }
    public void setEnergyRecovered(int energyRecovered) {
        this.energyRecovered = energyRecovered;
    }
}
