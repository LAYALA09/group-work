package TipeSpell;

import ar.com.ada.online.second.practiceone.Wizard;
import superclass.CharacterTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class AttackSpell extends Spell { //revisado

    private int attackLevel;

    public AttackSpell(String name, int magicEnergySpent, int attackLevel) {
        super(name, magicEnergySpent);
        this.attackLevel = attackLevel;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    @Override
    public int getMagicEnergySpent() {
        return super.getMagicEnergySpent();
    }

    @Override
    public void setMagicEnergySpent(int magicEnergySpent) {
        super.setMagicEnergySpent(magicEnergySpent);
    }

    @Override
    public String toString() {
        return "Attack  Spell :" +
                "name='" + name + '\'' +
                "Attack Level:" + attackLevel + '\'' +
                "Magic energy spent:" + magicEnergySpent
                ;
    }
}






