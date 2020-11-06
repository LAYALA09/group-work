package ar.com.ada.online.second.practiceone;

import TipeSpell.*;
import superclass.CharacterTwo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameActions {


    public static CharacterTwo selectionPart() {
        CharacterTwo star = new CharacterTwo();
        Scanner keyboard = new Scanner(System.in);
        int option;
        System.out.println("Player one");
        System.out.println("Digitize what character you want");
        System.out.println("1- Wizard");
        System.out.println("2- Elf");
        System.out.print("Option: ");
        option = keyboard.nextInt();

        switch (option) {
            case 1:
                //mago


               return gameWizard();// metodo de mago y las elecciones para el juego



            case 2:

                Elf Player1Elf = new Elf();
                gameElf(); //metodo de elfo y las elecciones para el juego
                //metodo para elegir hechizos

                break;

            default:
                break;

        }
        System.out.print("\nPlayer 2, you choose: ");

        System.out.println("");


        return star;
    }

    ///metodo mago
    public static Wizard gameWizard() {
        int option;
        Wizard Player1Wizard = new Wizard();
        Scanner keyboard = new Scanner(System.in);
        //ingresa
        System.out.print("Choose and type your name: ");
        Player1Wizard.setName(keyboard.next());
        System.out.println("");
        //selecciona ubicacion
        System.out.println("Select a location:");
        System.out.println("1) Hogwarts");
        System.out.println("2) Diagon Alley");
        System.out.println("3) Hogsmeade");
        System.out.print("Option: ");
        option = keyboard.nextInt();
        switch (option) {
            case 1:
                Player1Wizard.setLocation("1) Hogwarts");
                break;
            case 2:
                Player1Wizard.setLocation("2) Diagon Alley");
                break;
            case 3:
                Player1Wizard.setLocation("3) Hogsmeade");
                break;
            default:
                System.out.println("You must choose a valid option");
                Player1Wizard.setLocation((String) null);
                break;
        }
        System.out.println("");
        Player1Wizard.setLifeSpan(100);
        Player1Wizard.setMagicEnergy(100);
        Player1Wizard.setTypeOfCharacter("wizard");
        Player1Wizard.setWand(WandWizard());
        Player1Wizard.setSpells(SpellSelection());



        return Player1Wizard;
    }

    //metodo varitas random
    public static Wand WandWizard() {
        int option;
        List<Wand> nWand = new ArrayList<>();
        nWand.add(new Wand(4, "Madera de serpiente"));
        nWand.add(new Wand(5, "Nogal negro"));
        nWand.add(new Wand(2, "Sauce"));
        nWand.add(new Wand(3, "Sauco"));
        nWand.add(new Wand(4, "Diamond"));
        nWand.add(new Wand(5, "Alamo temblon"));
       System.out.printf("Magic wands:\n" +
                "Madera de serpiente: +4 attacking points \n" +
                "Nogal negro: +5 attacking points\n" +
                "Sauce: +2 attacking points \n" +
                "Sauco: +3 attacking points\n " +
                "Diamond: +4 attacking points\n" +
                "Alamo temblon: +5 attacking points\n"
        );

        System.out.println();

        Random random = new Random();
        for (int i = 0; i < nWand.size(); i++) {

        }
        Wand PlayerWand = new Wand();
        PlayerWand = nWand.get(random.nextInt(nWand.size()));

        System.out.println("The wand " + PlayerWand + " has selected you.");


        return PlayerWand;

    }

    ///metodo de elfos
    public static void gameElf() {
        CharacterTwo elf = new Elf();
        String name;
        int option;
        Scanner keyboard = new Scanner(System.in);
        //selecciona Elf
        System.out.println("Choose and type your name: ");
        System.out.print("Option: ");
        option = keyboard.nextInt();
        System.out.print(" ");
        //selecciona ubicacion
        System.out.println("Select a locations:");
        System.out.println("1) Hogwarts");
        System.out.println("2) Diagon Alley");
        System.out.println("3) Hogsmeade");
        System.out.print("Option: ");
        option = keyboard.nextInt();
        System.out.print("");
    }


    //Descripcion de hechizos de ataques
    public static List<Spell> SpellSelection() {

        Scanner keyboard = new Scanner(System.in);
        int option;

        System.out.println();
        System.out.println("ATTENTION !!!");
        System.out.println();

        System.out.println("You can only choose six spells in total");


        System.out.println("ATTACKING SPELLS: \n " +

                "\t1-BOMBARDA MAXIMA - attacks: 10, magic energy used: 5 " +
                "\t2-DESMAIUS - attacks: 15, magic energy used: 10 " +
                "\t3-EXPULSO - attacks: 20, magic energy used: 15 " +
                "\t4-LEVICORPUS - attacks: 10, magic energy used: 5 " +
                "\t5-REDUCTO - attacks: 20, magic energy used: 15 " +
                "\t6-CONFRINGO - attacks: 15, magic energy used: 10 " +
                "\t7-DEPRIMO - attacks: 10, magic energy used: 5  " +
                "\t8-GLACIUS - attacks: 25, magic energy used: 20  " +
                "\t9-INCENDIO - attacks: 25, magic energy used: 20 " +
                "\t10-AVADA KEDAVRA - attacks: 100, magic energy used: 90" +
                "\t11-CRUCIATUS - attacks: 80, magic energy used: 70 " +
                "\t12-IMPERIUS - attacks: 90, magic energy used: 80"

        );
        System.out.printf("HEALING: \n " +

                "\t13- ANAPNEO - recovered life points: 20, magic energy used: 20 " +
                "\t14- BRAQUIAM EMENDO - recovered life points: 15, magic energy used: 20" +
                "\t15- EPISKEY - recovered life points: 10, magic energy used: 15 " +
                "\t16- OSSIO DISPERSIMUS - recovered life points: 20, magic energy used: 20 " +
                "\t17- REPARIFORS - recovered life points: 10, magic energy used: 10 " +
                "\t18- FÉRULA - recovered life points: 15, magic energy used: 15 " +
                "\t19- VULNERA SANENTUR - recovered life points: 15, magic energy used: 15"
        );
        System.out.printf("RECOVERY SPELLS: \n " +

                "\t20- RECUPERA - recovered life points: 20, magic energy used: 3 "
        );

        List<Spell> PlayerChosenSpells = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Choose your spell number " + (i + 1));
            System.out.print("Option: ");
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    PlayerChosenSpells.add(new AttackSpell("BOMBARDA MAXIMA", 5, 10));
                    break;
                case 2:
                    PlayerChosenSpells.add(new AttackSpell("DESMAIUS", 10, 15));
                    break;
                case 3:
                    PlayerChosenSpells.add(new AttackSpell("EXPULSO", 15, 20));
                    break;
                case 4:
                    PlayerChosenSpells.add(new AttackSpell("LEVICORPUS", 6, 12));
                    break;
                case 5:
                    PlayerChosenSpells.add(new AttackSpell("REDUCTO", 12, 20));
                    break;
                case 6:
                    PlayerChosenSpells.add(new AttackSpell("DEPRIMO", 5, 10));
                    break;
                case 7:
                    PlayerChosenSpells.add(new AttackSpell("GLACIUS", 20, 25));
                    break;
                case 8:
                    PlayerChosenSpells.add(new AttackSpell("INCENDIO", 20, 25));
                    break;
                case 9:
                    PlayerChosenSpells.add(new AttackSpell("AVADA KEDAVRA", 90, 100));
                    break;
                case 10:
                    PlayerChosenSpells.add(new AttackSpell("CRUCIATUS", 70, 80));
                    break;
                case 11:
                    PlayerChosenSpells.add(new AttackSpell("IMPERIUS", 80, 90));
                    break;
                case 12:
                    PlayerChosenSpells.add(new HealingSpell("ANAPNEO", 20, 20));
                    break;
                case 13:
                    PlayerChosenSpells.add(new HealingSpell("BRAQUIAM EMENDO", 18, 15));
                    break;
                case 14:
                    PlayerChosenSpells.add(new HealingSpell("EPISKEY", 15, 10));
                    break;
                case 15:
                    PlayerChosenSpells.add(new HealingSpell("OSSIO DISPERSIMUS", 18, 20));
                    break;
                case 16:
                    PlayerChosenSpells.add(new HealingSpell("REPARIFORS", 10, 10));
                    break;
                case 17:
                    PlayerChosenSpells.add(new HealingSpell("FERULA", 15, 15));
                    break;
                case 18:
                    PlayerChosenSpells.add(new HealingSpell("VULNERA SANENTUR", 16, 20));
                    break;
                case 19:
                    PlayerChosenSpells.add(new RecoverySpell("RECUPERA", 3, 15));
                    break;
            }

            System.out.println("You can choose " + (6 - (i + 1)) + " more spells.");
        }
        return PlayerChosenSpells;



    }

}








