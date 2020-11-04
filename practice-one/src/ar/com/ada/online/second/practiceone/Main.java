package ar.com.ada.online.second.practiceone;

import TipeSpell.Spell;
import superclass.CharacterTwo;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CharacterTwo Player1 = new CharacterTwo();
       Spell Player1S = new Spell();
        System.out.println("The game begins");
        System.out.println("");
        System.out.println("\nTurno del jugador uno: ");
        Player1 = GameActions.startGame();
        Player1S= GameActions.SpellSelection();

        System.out.println(Player1S);


        /*System.out.println("\n Turno del jugador dos: ");
        /*Player2 = GameActions.startGame();*/
        System.out.println(Player1S);
    }
        }















