package spell;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Spell {
    int restMagicEnergy;

    //metodo lista de hechizos ataques
    public static void attackingSpellsList() {
        Scanner keyboard = new Scanner(System.in);
        char response;
        int option;
        do {
            int amountspell = 0;
            ArrayList<String> attackingSpells = new ArrayList<String>();

            attackingSpells.add("1-LEVICORPUS {Attacks: 10, Magic Energy: 5}");
            attackingSpells.add("2-REDUCTO {Attacks: 20, Magic Energy: 15}");
            attackingSpells.add("3-CONFRINGO {Attacks: 15, Magic Energy: 10}");
            attackingSpells.add("4-DEPRIMO {Attacks: 10, Magic Energy: 5}");
            attackingSpells.add("5-GLACIUS {Attacks: 25, Magic Energy: 20}");
            attackingSpells.add("6-INCENDIO {Attacks: 25, Magic Energy: 20}");
            //Significa “torturar”
            attackingSpells.add("7-CRUCIATUS {Attacks: 80, Magic Energy: 70}");
            attackingSpells.add("8-IMPERIUS {Attacks: 90, Magic Energy: 80}");
            //Es una maldición asesina
            attackingSpells.add("9-AVADA KEDAVRA:{Attacks: 100, Magic Energy: 90}");
            System.out.println("");

            Spell spell = new Spell();
            for (String cadena : attackingSpells) {
                System.out.println(cadena);
            }
            System.out.println("select your spell:");
            System.out.print("Option: ");
            option = keyboard.nextInt();
            System.out.print(" ");




            System.out.print("do you want select another of attach?");
            response = keyboard.next().charAt(0);///guarda solo un caracter, y declarmos la variable tipo char
            amountspell = amountspell + 1;
            System.out.println("");

        } while (response == 's' || response == 'S');

    }


    //metodo lista de hechizos SANACION//defensa
    public static void healingSpellsList() {

        ArrayList<String> healingSpells = new ArrayList<String>();

        healingSpells.add("ANAPNEO {Healing: 10, Magic Energy: 10}");
        healingSpells.add("TERGEO {Healing: 20, Magic Energy: 15}");
        healingSpells.add("SANENTUR {Healing: 15, Magic Energy: 10}");
        healingSpells.add("REPARISFOR {Healing: 10, Magic Energy: 5}");
        healingSpells.add("OSSIO DISPERSIMUS {Healing: 10, Magic Energy: 20}");
        healingSpells.add("SNAPE {Healing: 20, Magic Energy: 15}");
    }

    //metodo lista de hechizos RECUPERACION
    public static void recoverySpellsList() {

        ArrayList<String> recoverySpells = new ArrayList<String>();

        recoverySpells.add("LUMOS {Recovery: 10, Magic Energy: 5}");
        recoverySpells.add("PORTUS {Recovery: 15, Magic Energy: 8}");
        recoverySpells.add("ORBIS{Recovery: 15, Magic Energy: 6}");
        recoverySpells.add("FINITE {Recovery: 10, Magic Energy: 4}");
        recoverySpells.add("ARESTO MOMENTUM {Recovery: 05, Magic Energy: 5}");
        recoverySpells.add("ANAPNEO {Recovery: 10, Magic Energy: 8  }");
    }



    public static void TypeOfSpell() {
        List<Spell> lista=new ArrayList<>();
        lista.add(new Spell("LEVICORPUS", 10, 5));

    }
}














