package ar.com.ada.online.second.practiceone;

import TipeSpell.AttackSpell;
import TipeSpell.Spell;
import TipeSpell.Wand;
import superclass.CharacterTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameActions {

    private ArrayList<Spell> spell;
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
                return gameWizard();// metodo de mago y las elecciones para el juego
            TipeSpell.Spell.AttackSpell.addSpell();
            case 2:

                Elf Player1Elf = new Elf();
                gameElf(); //metodo de elfo y las elecciones para el juego
                TipeSpell.AttackSpell.AttackSpellSelection();//metodo para elegir hechizos
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

    //metodo para seleccionar los seis hechizos de ataque, sanacion, recuperacion

    public static AttackSpell addSpell() {
        Spell star = new AttackSpell();
        Scanner keyboard = new Scanner(System.in);
        int continueMenu;


        do {

            System.out.println("Please enter a category of spells: \n");
            System.out.println("\t1)Attack Spell\n");
            System.out.println("\t2)Healing Spell\n");
            System.out.println("\t3)Recovery Spell\n");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:

                    TipeSpell.AttackSpell.AttackSpellSelection();

                    break;
                case 2:
                    /*TipeSpell.HealingSpell.HealingSpellSelection();
                    break;
                case 3:
                    TipeSpell.RecoverySpell.RecoverySpellSelection( );
                    break;*/
                default:
                    System.out.println("Opcion incorrecta.");
            }
            System.out.println("Desea agregar otro Hechizo?: \n\t1) Si\n\t2)No");
            continueMenu = keyboard.nextInt();
        } while (continueMenu == 1);
    }

}
