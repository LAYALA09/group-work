package TipeSpell;

import ar.com.ada.online.second.practiceone.GameActions;

import java.util.ArrayList;
import java.util.Scanner;

public class Spell { ///tambien falta determinar condicion de de attack >3
    private String name;
   private Integer magicEnergySpent;//energia magica usada//attack
    private Integer lifeRecovered;
    private Integer attackLevel;//nivel de ataque//attack
    private Integer recoveryLevel;

    public Spell(String name) {
        this.name = name;
    }

    public Spell(Integer magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }


    public Spell(String name, Integer magicEnergySpent, Integer lifeRecovered, Integer attackLevel, Integer recoveryLevel) {
        this.name = name;
        this.magicEnergySpent = magicEnergySpent;
        this.lifeRecovered = lifeRecovered;
        this.attackLevel = attackLevel;
        this.recoveryLevel = recoveryLevel;
    }
    public Spell(){
        this.name = name;
        this.attackLevel = attackLevel;
        this.magicEnergySpent = magicEnergySpent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(Integer attackLevel) {
        this.attackLevel = attackLevel;
    }

    public Integer getMagicEnergySpent() {
        return magicEnergySpent;
    }

    public void setMagicEnergySpent(Integer magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }

    @Override
    public String toString() {
        return String.format("Spell:" +
                "name='" + name + '\'' +
                ", attackLevel=" + attackLevel +
                ", magicEnergySpent=" + magicEnergySpent +

                '}');
    }
}
















