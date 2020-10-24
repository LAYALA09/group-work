package spell;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Spell {

     //metodo lista de hechizos ataques
    public static void attackingSpellsList() {
        int amountspell=0;
        ArrayList<String> attackingSpells = new ArrayList<String>();

        attackingSpells.add("LEVICORPUS {Attacks: 10, Magic Energy: 5}");
        attackingSpells.add("REDUCTO {Attacks: 20, Magic Energy: 15}");
        attackingSpells.add("CONFRINGO {Attacks: 15, Magic Energy: 10}");
        attackingSpells.add("DEPRIMO {Attacks: 10, Magic Energy: 5}");
        attackingSpells.add("GLACIUS {Attacks: 25, Magic Energy: 20}");
        attackingSpells.add("INCENDIO {Attacks: 25, Magic Energy: 20}");
        //Significa “torturar”
        attackingSpells.add("CRUCIATUS {Attacks: 80, Magic Energy: 70}");
        attackingSpells.add("IMPERIUS {Attacks: 90, Magic Energy: 80}");
        //Es una maldición asesina
        attackingSpells.add("AVADA KEDAVRA:{Attacks: 100, Magic Energy: 90}");
        System.out.println("Attacking Spells:\n" + attackingSpells);
        System.out.println("select your spell:");
        Spell spell = new Spell();
        for (int i = 0; i < attackingSpells.size(); i++) {
            //cuento cuantos hechizos va a elegir
            amountspell=amountspell+1;

        }

        //seleccionar hechizo
        // desea seleccionar otro de ataque?
        //contar hechizos seleccionados
        //if dano<25 puede continuar
    }

    //metodo lista de hechizos SANACION
    public static void healingSpellsList() {

        ArrayList<String> healingSpells = new ArrayList<String>();

        healingSpells.add("ANAPNEO {Healing: 10, Magic Energy: 5}");
        healingSpells.add("TERGEO {Healing: 20, Magic Energy: 15}");
        healingSpells.add("SANENTUR {Healing: 15, Magic Energy: 10}");
        healingSpells.add("REPARISFOR {Healing: 10, Magic Energy: 5}");
        healingSpells.add("OSSIO DISPERSIMUS {Healing: 25, Magic Energy: 20}");
        healingSpells.add("SNAPE {Healing: 25, Magic Energy: 20}");
    }

    //metodo lista de hechizos RECUPERACION
    public static void recoverySpellsList() {

        ArrayList<String> recoverySpells = new ArrayList<String>();

        recoverySpells.add("LUMOS {Recovery: 10, Magic Energy: 5}");
        recoverySpells.add("PORTUS {Recovery: 20, Magic Energy: 15}");
        recoverySpells.add("ORBIS{Recovery: 15, Magic Energy: 10}");
        recoverySpells.add("FINITE {Recovery: 10, Magic Energy: 5}");
        recoverySpells.add("ARESTO MOMENTUM {Recovery: 25, Magic Energy: 20}");
        recoverySpells.add("ANAPNEO {Recovery: 25, Magic Energy: 20}");
    }

        public static void TypeOfSpell(){
            int amountspell=0;
            Scanner keyboard = new Scanner(System.in);
            int option;
            char response;
            do {
                do {
                    System.out.println("");
                    System.out.println("ATTENTION !!!");
                    System.out.println("");
                    System.out.println("You can only choose six spells in total");
                    System.out.println("Select tipe of spell:");
                    System.out.println("1. Attack");
                    System.out.println("2. Recovery");
                    System.out.println("3. Healing");
                    System.out.print("Option: ");
                    option = keyboard.nextInt();

                } while (option < 1 || option > 3);
                switch (option) {
                    case 1:
                        //lista hechizos de ataque

                        attackingSpellsList();


                        System.out.println("do you want select another of attach?");
                     //falta hacer bifurcacion
                        break;

                    case 2:
                        System.out.println("select your spell:");
                        recoverySpellsList();
                        System.out.println("do you want select another of healing?");
                        //falta hacer bifurcacion
                    case 3:
                        System.out.println("select your spell:");
                        healingSpellsList();
                        System.out.println("do you want select another of healing?");
                        break;
                }
                System.out.print("\nYou want to introduce another spell(s/n: ");
                response = keyboard.next().charAt(0);///guarda solo un caracter, y declarmos la variable tipo char

                System.out.println("");

            } while (response == 's' || response == 'S');

        }
    }













