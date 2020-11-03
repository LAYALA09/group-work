package TipeSpell;

import ar.com.ada.online.second.practiceone.Wizard;
import superclass.CharacterTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class AttackSpell extends Spell {


    public AttackSpell(String name, Integer magicEnergySpent, Integer attackLevel) {
        super(name, magicEnergySpent, attackLevel);
    }


    ///Descripcion de hechizos de ataques
    public static AttackSpell AttackSpellSelection() {

        Spell add=new AttackSpell();
        Scanner keyboard = new Scanner(System.in);
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
                add.setName("BOMBARDA MAXIMA");
                add.setAttackLevel(10);
                add.setMagicEnergySpent(5);
                break;
            case 2:
                add.setName("DESMAIUS");
                add.setAttackLevel(15);
                add.setMagicEnergySpent(10);
                break;
            case 3:
                add.setName("EXPULSO");
                add.setAttackLevel(20);
                add.setMagicEnergySpent(15);
                break;
            case 4:
                add.setName("LEVICORPUS");
                add.setAttackLevel(10);
                add.setMagicEnergySpent(5);
                break;
            case 5:
                add.setName("REDUCTO");
                add.setAttackLevel(20);
                add.setMagicEnergySpent(15);
                break;
            case 6:
                add.setName("CONFRINGO");
                add.setAttackLevel(15);
                add.setMagicEnergySpent(10);
                break;
            case 7:
                add.setName("DEPRIMO");
                add.setAttackLevel(10);
                add.setMagicEnergySpent(5);
                break;
            case 8:
                add.setName("GLACIUS");
                add.setAttackLevel(25);
                add.setMagicEnergySpent(20);
                break;
            case 9:
                add.setName("INCENDIO");
                add.setAttackLevel(25);
                add.setMagicEnergySpent(20);
                break;
            case 10:
                add.setName("AVADA KEDAVRA ");
                add.setAttackLevel(100);
                add.setMagicEnergySpent(90);
                break;
            case 11:
                add.setName("CRUCIATUS ");
                add.setAttackLevel(80);
                add.setMagicEnergySpent(70);
                break;
            case 12:
                add.setName("IMPERIUS");
                add.setAttackLevel(90);
                add.setMagicEnergySpent(80);
                break;
            default:
                System.out.println("Opcion incorrecta.");

        }
    }
}






