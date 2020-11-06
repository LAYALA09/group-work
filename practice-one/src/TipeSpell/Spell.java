package TipeSpell;

import ar.com.ada.online.second.practiceone.GameActions;

import java.util.ArrayList;
import java.util.Scanner;

public class Spell { ///revisado
    protected String name;
    protected int magicEnergySpent;//energia magica usada//attack

    // Constructor
    public Spell(String name,int magicEnergySpent) {
        this.name = name;
        this.magicEnergySpent = magicEnergySpent;

    }

    public Spell(int magicEnergySpent) {
        this.name = name;
        this.magicEnergySpent = this.magicEnergySpent;


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
        return "name: " + name +
                "\nMagic energy spent: " + magicEnergySpent + "\n"
                ;
    }
}

















