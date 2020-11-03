package TipeSpell;

import java.util.ArrayList;
import java.util.Scanner;

public class Spell {
    private String name;
   private Integer magicEnergySpent;//energia magica usada
    private Integer attackLevel;

    public Spell(String name, Integer attackLevel, Integer magicEnergySpent) {
        this.name = name;

        this.attackLevel = attackLevel;
        this.magicEnergySpent = magicEnergySpent;
    }


    public Spell(String name, Integer magicEnergySpent) {
        this.name = name;
        this.magicEnergySpent = magicEnergySpent;

    }
    public Spell(Integer magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }
    public Spell(String name) {
        this.name = name;
    }

    //getter & setter


    public Integer getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(Integer attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getMagicEnergySpent() {
        return magicEnergySpent;
    }

    public void setMagicEnergySpent(Integer magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }







}














