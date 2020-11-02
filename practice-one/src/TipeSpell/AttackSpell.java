package TipeSpell;

import ar.com.ada.online.second.practiceone.Wizard;
import superclass.CharacterTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class AttackSpell extends Spell {
    private Integer attackLevel;//nivel de ataque
    Spell spell = new Spell();
    Spell spell= new AttackSpell();
    private ArrayList<Spell> spell;
    public AttackSpell(Integer magicEnergySpent, String name, Integer attackLevel, Integer recoveryLevel, Integer attackLevel1) {
        super(magicEnergySpent, name, recoveryLevel);
        this.attackLevel = attackLevel1;
    }



    @Override
    public Integer getAttackLevel() {
        return attackLevel;
    }

    @Override
    public void setAttackLevel(Integer attackLevel) {
        this.attackLevel = attackLevel;
    }


    ///Descripcion de hechizos de ataques
    public  void AttachSpellSelection(Scanner keyboard) {
        int option;
        System.out.println();
        System.out.println("ATTENTION !!!");
        System.out.println();
        System.out.println("You can only choose six spells in total");
        System.out.printf("Attacking Spells: \n ",
                "\t1-BOMBARDA MAXIMA \n attacks: 10, magic energy used: 5 ",
                "\t2-DESMAIUS \n attacks: 15, magic energy used: 10 ",
                "\t3-EXPULSO \n attacks: 20, magic energy used: 15 ",
                "\t4-LEVICORPUS \n attacks: 10, magic energy used: 5 ",
                "\t5-REDUCTO \n attacks: 20, magic energy used: 15 ",
                "\t6-CONFRINGO \n attacks: 15, magic energy used: 10 ",
                "\t7-DEPRIMO \n attacks: 10, magic energy used: 5 ",
                "\t8-GLACIUS \n attacks: 25, magic energy used: 20 ",
                "\t9-INCENDIO \n attacks: 25, magic energy used: 20 ",
                "\t10-AVADA KEDAVRA \n attacks: 100, magic energy used: 90",
                "\t11-CRUCIATUS \n attacks: 80, magic energy used: 70 ",
                "\t12-IMPERIUS \n attacks: 90, magic energy used: 80");
        option = keyboard.nextInt();
        switch (option) {
            case 1:
                spell.setName("BOMBARDA MAXIMA");
                AttackSpell.setAttackLevel(10);
                spell.setMagicEnergySpent(5);
                break;
            case 2:
                AttackSpell.super.setName("DESMAIUS");
                AttackSpell.setAttackLevel(15);
                AttackSpell.super.setMagicEnergySpent(10);
                break;
            case 3:
                AttackSpell.super.setName("EXPULSO");
                AttackSpell.setAttackLevel(20);
                AttackSpell.super.setMagicEnergySpent(15);
                break;
            case 4:
                AttackSpell.super.setName("LEVICORPUS");
                AttackSpell.setAttackLevel(10);
                AttackSpell.super.setMagicEnergySpent(5);
                break;
            case 5:
                AttackSpell.super.setName("REDUCTO");
                AttackSpell.setAttackLevel(20);
                AttackSpell.super.setMagicEnergySpent(15);
                break;
            case 6:
                spell.setName("CONFRINGO");
                spell.setAttackLevel(15);
                spell.setMagicEnergySpent(10);
                break;
            case 7:
                spell.setName("DEPRIMO");
                spell.setAttackLevel(10);
                spell.setMagicEnergySpent(5);
                break;
            case 8:
                spell.setName("GLACIUS");
                spell.setAttackLevel(25);
                spell.setMagicEnergySpent(20);
                break;
            case 9:
                spell.setName("INCENDIO");
                spell.setAttackLevel(25);
                spell.setMagicEnergySpent(20);
                break;
            case 10:
                spell.setName("AVADA KEDAVRA ");
                spell.setAttackLevel(100);
                spell.setMagicEnergySpent(90);
                break;
            case 11:
                spell.setName("CRUCIATUS ");
                AttackSpell.setAttackLevel(80);
                spell.setMagicEnergySpent(70);
                break;
            case 12:
                spell.setName("IMPERIUS");
                AttackSpell.setAttackLevel(90);
                spell.setMagicEnergySpent(80);
                break;
            default:
                System.out.println("Opcion incorrecta.");

        }
    }


    @Override
    public void setMagicEnergySpent(int magicEnergySpent) {
        super.setMagicEnergySpent(magicEnergySpent);
    }
    @Override
    public int getMagicEnergySpent() {
        return super.getMagicEnergySpent();
    }
    public int getDamageMade() {
        return damageMade;
    }
    public void setDamageMade(int damageMade) {
        this.damageMade = damageMade;
    }
}
