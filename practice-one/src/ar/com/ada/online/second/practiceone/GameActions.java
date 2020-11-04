package ar.com.ada.online.second.practiceone;

import TipeSpell.AttackSpell;
import TipeSpell.HealingSpell;
import TipeSpell.Spell;
import TipeSpell.Wand;
import superclass.CharacterTwo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameActions {


    CharacterTwo elf = new Elf();

    public static CharacterTwo startGame() {
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


                gameWizard();// metodo de mago y las elecciones para el juego
                SpellSelection();

            case 2:

                Elf Player1Elf = new Elf();
                gameElf(); //metodo de elfo y las elecciones para el juego
                SpellSelection();//metodo para elegir hechizos

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
        Player1Wizard.setLocation(keyboard.nextInt());
        System.out.println("");
        Player1Wizard.setLifeSpan(100);
        Player1Wizard.setMagicEnergy(100);
        Player1Wizard.setTypeOfCharacter("wizard");
        Player1Wizard.setWand(WandWizard());
        Player1Wizard.getSpells();///mi duda no se como instanciar los hechizos del jugador 1

//        SpellSelection();
        return Player1Wizard;
    }

    //metodo varitas random
    public static Wand WandWizard() {
        int option;
        List<Wand> nWand = new ArrayList<>();
        nWand.add(new Wand(4, "Madera de serpiente: +4 attacking points"));
        nWand.add(new Wand(5, "Nogal negro: +5 attacking points"));
        nWand.add(new Wand(2, "Sauce: +2 attacking points"));
        nWand.add(new Wand(3, "Sauco: +3 attacking points"));
        nWand.add(new Wand(4, "Diamond: +4 attacking points"));
        nWand.add(new Wand(5, "Alamo temblon: +5 attacking points"));
        System.out.println("Magic wands:\n" + nWand + "\n");
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
    public static Spell SpellSelection() {


        Spell add = new Spell();


        Scanner keyboard = new Scanner(System.in);
        int option;
        System.out.println();
        System.out.println("ATTENTION !!!");
        System.out.println();
        System.out.println("You can only choose six spells in total");

        for (int i = 0; i < 6; i++) {

            System.out.println("Attacking Spells: \n ");
            System.out.println("\t1-BOMBARDA MAXIMA - attacks: 10, magic energy used: 5 ");
            System.out.println("\t2-DESMAIUS - attacks: 15, magic energy used: 10 ");
            System.out.println("\t3-EXPULSO - attacks: 20, magic energy used: 15 ");
            System.out.println("\t4-LEVICORPUS - attacks: 10, magic energy used: 5 ");
            System.out.println("\t5-REDUCTO - attacks: 20, magic energy used: 15 ");
            System.out.println("\t6-CONFRINGO - attacks: 15, magic energy used: 10 ");
            System.out.println("\t7-DEPRIMO - attacks: 10, magic energy used: 5  ");
            System.out.println("\t8-GLACIUS - attacks: 25, magic energy used: 20  ");
            System.out.println("\t9-INCENDIO - attacks: 25, magic energy used: 20 ");
            System.out.println("\t10-AVADA KEDAVRA - attacks: 100, magic energy used: 90");
            System.out.println("\t11-CRUCIATUS - attacks: 80, magic energy used: 70 ");
            System.out.println("\t12-IMPERIUS - attacks: 90, magic energy used: 80");
            option = keyboard.nextInt();
         // cargue solo estos 12 a modo de prueba.
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

        System.out.println("You already chose the 6 spells");
        /// selecciona los 6....me falta mostrar lo que es de jugador 1

        return add;
    }



}







      //falta cargar estos si funciona



       /* System.out.printf("Healing Spells: \n { \n",
                "13. ANAPNEO { recovered life points: 20, magic energy used: 20 } \n",
                "14. BRAQUIAM EMENDO { recovered life points: 15, magic energy used: 20 }\n",
                "15. EPISKEY { recovered life points: 10, magic energy used: 15 }\n",
                "16. OSSIO DISPERSIMUS { recovered life points: 20, magic energy used: 20 }\n",
                "17. REPARIFORS { recovered life points: 10, magic energy used: 10 }\n",
                "18. FÉRULA { recovered life points: 15, magic energy used: 15 }\n",
                "19. VULNERA SANENTUR { recovered life points: 15, magic energy used: 15\n } \n"
        );
        System.out.printf("Recovery Spells: \n { \n",
                "20. RECUPERA { magic energy recovered: 15, magic energy used 3} \n } \n"
        );
        System.out.print("Option: ");
        option = keyboard.nextInt();

    }*/





