package ar.com.ada.online.second.practiceone;

import superclass.CharacterTwo;

import java.util.Objects;

public class  Wizard extends CharacterTwo {

    private String magicWand;


    public Wizard(String name, Integer location, Integer lifeSpan, Integer magicEnergy, String spells, String typeOfCharacter) {
        super();
        this.magicWand = magicWand;
    }


    public String getMagicWand() {
        return magicWand;
    }

    public void setMagicWand(String magicWand) {
        this.magicWand = magicWand;
    }

    public void game() {

    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Wizard that = (Wizard) obj;
        return location == that.location &&
                name.equals(that.name) &&
                lifeSpan.equals(that.lifeSpan) &&
                magicEnergy.equals(that.magicEnergy) &&
                spells.equals(that.spells) &&
                typeOfCharacter.equals(that.typeOfCharacter) &&
                magicWand.equals(that.magicWand);
    }
    public void isDarkOrNot(boolean darkWizard) {///metodo booleano para saber si es oscuro o no

    }
    public int hashCode() {

        return Objects.hash(name, location, lifeSpan, magicEnergy, spells, typeOfCharacter, magicWand);
    }
    @Override
    public String toString() {
        return String.format(
        "Character{ Type of Character = %s \n Name= %s \n Location= %d \n Life span= %d \n Magic energy= %d \n Spells= %s \n Magic Wand = %s \n}",
                typeOfCharacter,
                name,
                location,
                lifeSpan,
                magicEnergy,
                spells,
                magicWand);
    }
    }




