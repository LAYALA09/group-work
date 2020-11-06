package ar.com.ada.online.second.practiceone;

import superclass.CharacterTwo;

import java.util.Objects;

public class Elf extends CharacterTwo {  //revisado



    //methods

    public boolean isFreeOrNot(boolean freeElf, int counterAttackSpells) {
        for (int i = 0; i < 6; i++) {
            switch (spells.getClass().getSimpleName()) {
                case "Attack":
                    counterAttackSpells++;
                default:
                    counterAttackSpells = counterAttackSpells;
            }
        }
        if (counterAttackSpells > 3) {
            freeElf = true;
        } else {
            freeElf = false;
        }
        return freeElf;
    }
    // Overrides
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
        return String.format(
                "Character{ Type of Character = %s \n Name= %s \n Life span= %d \n Magic energy= %d \n Spells= %s \n Location= %d \n}",
                "Character{ \n Type of Character: %s \n Name: %s \n Location: %s \n Life span: %d \n Magic energy: %d \n Spells: %s \n}",
                typeOfCharacter,
                name,
                location,
                lifeSpan,
                magicEnergy,
                spells);
    }

}
