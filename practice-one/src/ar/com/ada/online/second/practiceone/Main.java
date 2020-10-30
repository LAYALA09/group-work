package ar.com.ada.online.second.practiceone;

import spell.Spell;

import java.util.ArrayList;
import java.util.*;


public class Main {

    public static void main(String[] args) {


        System.out.println("The game begins");
        System.out.println("");
        startGame();

    }

    public static void startGame() {
        Scanner keyboard = new Scanner(System.in);
        int option;
        char response;
        do {
            do {
                System.out.println("Select player one:");
                System.out.println("Digitize what character you want");
                System.out.println("1- Wizard");
                System.out.println("2- Elf");
                System.out.print("Option: ");
                option = keyboard.nextInt();

            } while (option < 1 || option > 2);
            switch (option) {
                case 1:
                     //mago
                    gameWizard();// metodo de mago y las elecciones para el juego
                    System.out.println();
                    WandWizard();//metodo de las varitas
                    Spell.TypeOfSpell();//metodo para elegir hechizos

                    break;
                case 2:

                    gameElf(); //metodo de elfo y las elecciones para el juego
                    Spell.TypeOfSpell();//metodo para elegir hechizos
                    break;
            }
            System.out.print("\nYou want to introduce another participant(s/n: ");
            response = keyboard.next().charAt(0);///guarda solo un caracter, y declarmos la variable tipo char

            System.out.println("");

        } while (response == 's' || response == 'S');

    }


    public static void gameWizard() {
        int option;
        Scanner keyboard = new Scanner(System.in);
        //selecciona mago
        System.out.println("Select a wizard:");
        System.out.println("1) Gryffindors");
        System.out.println("2) Ravenclaws");
        System.out.println("3) Slytherins");
        System.out.println("4) Hufflepuffs");
        System.out.print("Option: ");
        option = keyboard.nextInt();
        System.out.print(" ");

        //selecciona ubicacion
        System.out.println("Select a locations:");
        System.out.println("1) A");
        System.out.println("2) B");
        System.out.println("3) C");
        System.out.print("Option: ");
        option = keyboard.nextInt();
        System.out.print("");

    }

   //metodo de varitas
    public static void WandWizard() {

        ArrayList<String> nWand = new ArrayList<String>();

        //los valores que me paso Johana
        nWand.add("madera de serpiente= 4");
        nWand.add("nogal negro=5");
        nWand.add("sauce=2");
        nWand.add("sauco=3");
        nWand.add("diamond=4");
        nWand.add("alamo temblon=5");
        System.out.println("Magic wands:\n" + nWand);
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < nWand.size(); i++) {

        }

        System.out.println("Your wand is the number " + nWand.get(random.nextInt(nWand.size())));
    }
    public static void gameElf() {
        int option;
        Scanner keyboard = new Scanner(System.in);
        //selecciona Elf
        System.out.println("Select a Elf:");
        System.out.println("1) Dobby");
        System.out.println("2) Ravenclaws");
        System.out.println("3) Celeborn");
        System.out.println("4) Caranthir");
        System.out.print("Option: ");
        option = keyboard.nextInt();
        System.out.print(" ");

        //selecciona ubicacion
        System.out.println("Select a locations:");
        System.out.println("1) A");
        System.out.println("2) B");
        System.out.println("3) C");
        System.out.print("Option: ");
        option = keyboard.nextInt();
        System.out.print("");

    }
    public static void TypeOfSpell() {

        Scanner keyboard = new Scanner(System.in);
        int option;
        char response;

                System.out.println("");
                System.out.println("ATTENTION !!!");
                System.out.println("");
                System.out.println("You can only choose six spells in total");
                System.out.println("Select tipe of spell:");
                System.out.println("1. Attack:" \n get.Attack);/// y esto tb pero no logre asociar/
                System.out.println("2. Recovery"get.RecoverySpells);
                System.out.println("3. Healing"get.HealingSpells);
                System.out.print("Option: ");
                option = keyboard.nextInt();
            }
        }















