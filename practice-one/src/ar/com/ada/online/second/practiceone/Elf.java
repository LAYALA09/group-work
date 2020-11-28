package ar.com.ada.online.second.practiceone;

import TipeSpell.AttackSpell;
import TipeSpell.HealingSpell;
import TipeSpell.RecoverySpell;
import superclass.CharacterTwo;

import java.util.Objects;

public class Elf extends CharacterTwo {

    protected boolean freeElf;

    public boolean isfreeElf() {
        return freeElf;
    }



    public void setFreeElf(boolean freeElf) {
        this.freeElf = freeElf;
    }



    public void isFreeOrNot() {
        int counterAttackSpells = 0;
        //contador para determinar si elige mas de 3 hechizos de ataque
        //size devuelve el nro de elemento de esta lista
        for (int i = 0; i < this.spells.size(); i++) {
            if (this.spells.get(i) instanceof AttackSpell)
                counterAttackSpells++;
        }
        //en caso de ser >3 asignamos a la variable freeElf como Elfo libre
        freeElf = (counterAttackSpells > 3);
    }

    @Override
    public void configSpells() {
        if (freeElf) {
            for (int i = 0; i < this.spells.size(); i++) {
                if (this.spells.get(i) instanceof AttackSpell) {
                    AttackSpell attackSpell = (AttackSpell) this.spells.get(i);
                    //incrementamos en 5 para los elfos libres
                    attackSpell.setDamageMade(attackSpell.getDamageMade() + 5);
                }
                if (this.spells.get(i) instanceof HealingSpell) {
                    HealingSpell healingSpell = (HealingSpell) this.spells.get(i);
                    //incrementamos en 5 para los elfos libres
                    healingSpell.setLifeRecovered(healingSpell.getLifeRecovered() + 5);
                }
                if (this.spells.get(i) instanceof RecoverySpell) {
                    RecoverySpell recoverySpell = (RecoverySpell) this.spells.get(i);
                    //incrementamos en 5 para los elfos libres
                    recoverySpell.setEnergyRecovered(recoverySpell.getEnergyRecovered() + 5);
                }
            }
        } else {
            for (int i = 0; i < this.spells.size(); i++) {
                if (this.spells.get(i) instanceof HealingSpell) {
                    HealingSpell healingSpell = (HealingSpell) this.spells.get(i);
                    // elfos en cautiverio se incrementa en 10
                    healingSpell.setLifeRecovered(healingSpell.getLifeRecovered() + 10);

                }
            }
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Elf that = (Elf) obj;
        return location == that.location &&
                name.equals(that.name) &&
                lifeSpan.equals(that.lifeSpan) &&
                magicEnergy.equals(that.magicEnergy) &&
                typeOfCharacter.equals(that.typeOfCharacter) &&
                spells.equals(that.spells);
    }
    @Override

    public int hashCode() {
        return Objects.hash(name, location, lifeSpan, magicEnergy, typeOfCharacter, spells);
    }

    @Override
    public String toString() {
        String output = String.format(
                " Type of Character: %s \n Name: %s \n Location: %s \n Life span: %d \n Magic energy: %d \n Are you a free elf? %s \n Spells:",
                typeOfCharacter,
                name,
                location,
                lifeSpan,
                magicEnergy,
                magicEnergy,
                freeElf);
        String spellsTxt = "\n\t";

        for (int i = 0; i < spells.size(); i++) {
          //sumamos para informar cuantos hechizos tiene elegidos
            spellsTxt = "\t" + spellsTxt + (i+1) +") " +spells.get(i).toString() + "\n";
        }
        output = output + spellsTxt;
        return output;
    }
}