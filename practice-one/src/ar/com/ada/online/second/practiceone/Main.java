package ar.com.ada.online.second.practiceone;

import spell.Spell;

import java.util.ArrayList;
import java.util.*;




public class Main {

    public static void main(String[] args) {
        Spell.play();


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
                System.out.println("1. Wizard");
                System.out.println("2. Elf");
                System.out.print("Option: ");
                option = keyboard.nextInt();

            } while (option < 1 || option > 2);
            switch (option) {
                case 1:

                    gameWizard();// juega mago
                    WandWizard();
                    break;
                case 2:
                    System.out.println("Enter name:");
                    String name1 = keyboard.next();
                    System.out.println(name1);

                    /*gameElf(); // juega elfo*/
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

        //selecciona ubicacion
        System.out.println("Select a locations:");
        System.out.println("1) A");
        System.out.println("2) B");
        System.out.println("3) C");
        System.out.print("Option: ");
        option = keyboard.nextInt();

    }



    public static void WandWizard() {

        ArrayList<String> nWand = new ArrayList<String>();

        //los valores que me paso Johana
        nWand.add("madera de serpiente= 4");
        nWand.add("nogal negro=5");
        nWand.add("sauce=2");
        nWand.add("sauco=3");
        nWand.add("diamond=4");


        Random random=new Random();
        for (int i = 0; i < nWand.size(); i++) {

        }

        System.out.println("Your wand is the number " + nWand.get(random.nextInt(nWand.size())));
    }
}








