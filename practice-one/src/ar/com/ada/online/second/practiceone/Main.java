package ar.com.ada.online.second.practiceone;

import java.util.ArrayList;
import java.util.*;




public class Main {

    public static void main(String[] args) {

        ArrayList<String> nWand = new ArrayList<String>();
        nWand.add("madera de serpiente= 4");
        nWand.add("nogal negro=5");
        nWand.add("sauce=2");
        nWand.add("sauco=3");
        nWand.add("tamarack=1");
        nWand.add("vid=3");

        System.out.println("\n" + nWand);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("");
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
                System.out.println("Digitize what character you want");
                System.out.println("1. Wizard");
                System.out.println("2. Elf");
                System.out.print("Option: ");
                option = keyboard.nextInt();

            } while (option < 1 || option > 2);
            switch (option) {
                case 1:
                    System.out.println("Enter name:");
                    String name = keyboard.next();

                    gameWizard();// juega mago
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
        Scanner keyboard = new Scanner(System.in);
        int ubication, i = 0;;
        System.out.println("Choose location # " + (i + 1) + " : (1 - u1; 2 - u2; 3 - u3): ");
        ubication = keyboard.nextInt();

        HashMap<Integer, String> nWand = new HashMap<Integer, String>();
        nWand.put(1,"madera de serpiente= 4");
        nWand.put(2,"nogal negro=5");
        nWand.put(3,"sauce=2");
        nWand.put(4,"sauco=3");
        nWand.put(5,"tamarack=1");
        nWand.put(6,"vid=3");

        Random nwand=new Random();
        int a=nwand.nextInt(6);
        System.out.println("Your wand is the number " + a);



    }

}






