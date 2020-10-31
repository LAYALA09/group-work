package TipeSpell;

import java.util.ArrayList;
import java.util.Scanner;

public class Spell {

    protected int magicEnergySpent;
    protected String name;


    public Spell(int magicEnergySpent,String name) {
        this.name=name;
        this.magicEnergySpent = magicEnergySpent;
    }
    public Spell(String name, int magicEnergySpent) {
        this.name = name;
        this.magicEnergySpent = magicEnergySpent;

    }
    public Spell(int magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }
    public Spell(String name) {
        this.name = name;
    }

    //getter & setter

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




}














