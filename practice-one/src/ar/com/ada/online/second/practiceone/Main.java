package ar.com.ada.online.second.practiceone;

import superclass.CharacterTwo;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CharacterTwo Player1 = new CharacterTwo();
        CharacterTwo Player2 = new CharacterTwo();
        System.out.println("The game begins");
        System.out.println("");
        Player1 = GameActions.startGame();
        Player2 = GameActions.startGame();
        System.out.println(Player1);
        System.out.println(Player2);
    }
        }















