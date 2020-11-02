package TipeSpell;

import java.util.ArrayList;
import java.util.Scanner;

public class Spell {
    private String name;
   private Integer magicEnergySpent;//energia magica usada


    public Spell(Integer magicEnergySpent,String name,Integer recoveryLevel) {
        this.name=name;
        this.magicEnergySpent = magicEnergySpent;


    }
    /*public Spell(String name, int magicEnergySpent) {
        this.name = name;
        this.magicEnergySpent = magicEnergySpent;

    }
    public Spell(int magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }
    public Spell(String name) {
        this.name = name;
    }*/

    //getter & setter







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






    //metodo para seleccionar los seis hechizos de ataque, sanacion, recuperacion
    public void addSpells(Scanner keyboard) {
        int election;
        int continueMenu;
        do {
            System.out.println("Por favor ingrese una categoria de hechizos: \n");
            System.out.println("\t1)Attack spell\n");
            System.out.println("\t2)Healing spell\n");
            System.out.println("\t3)Recovery spell\n");
            election = keyboard.nextInt();

            switch (election) {
                case 1:
                    new AttackSpell(keyboard);
                    if (spell != null)
                        spell.addAttackSpell();
                    break;

                    break;

                case 2:
                    new HealingSpell(keyboard);
                    break;
                case 3:
                    new RecoverySpell(keyboard);
                    break;
                default:
                    System.out.println("Election incorrect.");
            }
            System.out.println("Desea agregar otro Hechizo?: \n\t1) Yes\n\t2)No");
            continueMenu = keyboard.nextInt();
        }  while (continueMenu == 1);
    }
}














