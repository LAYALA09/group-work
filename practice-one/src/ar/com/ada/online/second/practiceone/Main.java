package ar.com.ada.online.second.practiceone;

import superclass.CharacterTwo;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //Creacion de obj para guardar info de los jugadores
        CharacterTwo player1;
        CharacterTwo player2;
        //Guardamos las selecciones del jugador 1 y mostramos
        System.out.println("Player 1, you choose:");
        player1 = SelectionAction.selectionPart();
        System.out.println("Player 1 information: \n" + player1);

        //Guardamos las selecciones del jugador 2 y mostramos
        System.out.println("Player 2, you choose:");
        player2 = SelectionAction.selectionPart();
        System.out.println("Player 2 information: \n" + player2);

        //Empieza la partida
        System.out.println("The game begins");
        System.out.println("");
        //Partida jugador 1
        player1.isDeadOrAlive();
        //Partida jugador 2
        player2.isDeadOrAlive();
        do {
            System.out.println("\n \nPlayer 1, is your turn.");
            GameAction.castSpell(player1, player2);
            System.out.println("\n \nPlayer 2, is your turn.");
            GameAction.castSpell(player2, player1);
        } while (player1.isDeadOrAlive() || player2.isDeadOrAlive());
      //usamos do while para indicar hasta cuando iterar, el indicador isDeadOrAlive()
    }
}

















