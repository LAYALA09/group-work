package superclass;

import java.util.Objects;

public  class CharacterTwo {
    protected String name;
    protected Integer location;
    protected Integer lifeSpan;
    protected Integer magicEnergy;
    protected String spells;
    protected String typeOfCharacter;

    public CharacterTwo(String name, Integer location, Integer lifeSpan, Integer magicEnergy, String spells, String typeOfCharacter) {
        this.name = name;
        this.location = location;
        this.lifeSpan = lifeSpan;
        this.magicEnergy = magicEnergy;
        this.spells = spells;
        this.typeOfCharacter = typeOfCharacter;
    }

    public CharacterTwo() {
    }
    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getLocation() {
        return location;
    }
    public void setLocation(Integer location) {
        this.location = location;
    }
    public Integer getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(Integer lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
    public Integer getMagicEnergy() {
        return magicEnergy;
    }
    public void setMagicEnergy(Integer magicEnergy) {
        this.magicEnergy = magicEnergy;
    }
    public String getSpells() {
        return spells;
    }

    public void setSpells(String spells) {
        this.spells = spells;
    }

    public String getTypeOfCharacter() {
        return typeOfCharacter;
    }

    public void setTypeOfCharacter(String typeOfCharacter) {
        this.typeOfCharacter = typeOfCharacter;
    }
    //methods
    public boolean isDeadOrAlive(boolean alive) {
        if (lifeSpan <= 0) {
            alive = false;
        } else {
            alive = true;
        }
        return alive;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CharacterTwo that = (CharacterTwo) obj;
        return location == that.location &&
                name.equals(that.name) &&
                lifeSpan.equals(that.lifeSpan) &&
                magicEnergy.equals(that.magicEnergy) &&
                spells.equals(that.spells) &&
                typeOfCharacter.equals(that.typeOfCharacter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, lifeSpan, magicEnergy, spells, typeOfCharacter);
    }

    @Override
    public String toString() {
        return String.format(
                "Character{ Type of Character = %s \n Name= %s \n Life span= %d \n Magic energy= %d \n Spells= %s \n Location= %d \n}",
                typeOfCharacter,
                name,
                location,
                lifeSpan,
                magicEnergy,
                spells);
    }


}

