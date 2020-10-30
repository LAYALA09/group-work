package spell;

public class Healing extends Spell{
   private int lifeRecovered;
   //Constructor

    public Healing(int lifeRecovered, int magicEnergySpent) {
        super(magicEnergySpent);
        this.lifeRecovered = lifeRecovered;
    }
}
