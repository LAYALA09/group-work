package TipeSpell;

import ar.com.ada.online.second.practiceone.Wizard;
import superclass.CharacterTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class AttackSpell extends Spell { //revisabado

    private int damageMade;
    // Constructor
    public AttackSpell( String name, int magicEnergySpent, int damageMade) {
        super(name, magicEnergySpent);
        this.damageMade = damageMade;
    }
    //Getter & Setter
    public int getDamageMade() {
        return damageMade;
    }
    public void setDamageMade(int damageMade) {
        this.damageMade = damageMade;
    }
    public String getName() {
        return name;
    }
    public void setName() {
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

    @Override
    public String toString() {

        return "Attack Spell" +
                "\n\t name: " + name +
                "\n\t damage made: " + damageMade +
                "\n\t magic energy spent: " + magicEnergySpent + "\n";
    }
}





