package TipeSpell;

import java.util.Scanner;

public class HealingSpell extends Spell{
   private int lifeRecovered;
   //Constructor


        public HealingSpell(int magicEnergySpent, int lifeRecovered) {
            super(magicEnergySpent);
            this.lifeRecovered = lifeRecovered;
        }



    // Getters & Setters
        public int getLifeRecovered() {
            return lifeRecovered;
        }
        public void setLifeRecovered(int lifeRecovered) {
            this.lifeRecovered = lifeRecovered;
        }

    }

