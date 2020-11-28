package ar.com.ada.online.second.practiceone;

import TipeSpell.*;
import superclass.CharacterTwo;


import java.util.Scanner;

public class GameAction {


    public static void castSpell(CharacterTwo userPlaying, CharacterTwo otherPlayer) {

        Scanner keyboard = new Scanner(System.in);
        int locationOpponentInt;
        String locationOpponent;
        int spellSelected;
        //si esta vivo
        if (userPlaying.isDeadOrAlive()) {
            System.out.println("This is your status now:");
            System.out.println(userPlaying);
            System.out.println(otherPlayer.getName()+" choose the spell  want to do:");
            //selecciona hechizo
            spellSelected = keyboard.nextInt();
            if (userPlaying.spells.get(spellSelected - 1) instanceof AttackSpell) {
                AttackSpell attackSpell = (AttackSpell) userPlaying.spells.get(spellSelected - 1);
                if (userPlaying.getMagicEnergy() < attackSpell.getMagicEnergySpent()) {
                    System.out.println(" your magic energy is not enough for this spell. You loose your turn and gain +10 magic energy points.");
                    //si no tiene energias suficiente se adiciona 10 para la siguiente ronda
                    userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() + 10);
                } else {
                    userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() - attackSpell.getMagicEnergySpent());
                    boolean aux = true;
                    do {
                        aux = true;
                        //elige ubicacion
                        System.out.println("Choose the location you want to throw it to: ");
                        System.out.println("1) Hogwarts");
                        System.out.println("2) Diagon Alley");
                        System.out.println("3) Hogsmeade");
                        System.out.print("Option: ");
                        locationOpponentInt = keyboard.nextInt();
                        switch (locationOpponentInt) {
                            //ubicacion del oponente con booleano hacemos hasta que sea TRUE la variable aux
                            case 1:
                                aux = false;
                                locationOpponent = "1) Hogwarts";
                                break;
                            case 2:
                                aux = false;

                                locationOpponent = "2) Diagon Alley";
                                break;
                            case 3:
                                aux = false;
                                locationOpponent = "3) Hogsmeade";
                                break;
                            default:
                                System.out.println("You must choose a valid option.");
                                locationOpponent = (String) null;
                                break;
                        }
                    } while (aux);
                    //Si son iguales el personaje dio con el oponente
                    if (locationOpponent == otherPlayer.getLocation()) {
                        otherPlayer.setLifeSpan(otherPlayer.getLifeSpan() - attackSpell.getDamageMade());
                        System.out.println(otherPlayer.getName()+" Great! You hit your target.");
                    } else {
                        System.out.println("Sorry, you did not hit your target.");
                    }
                }
            }
            //si elije hechizo de sanacion
            if (userPlaying.spells.get(spellSelected - 1) instanceof HealingSpell) {
                HealingSpell healingSpell = (HealingSpell) userPlaying.spells.get(spellSelected - 1);
                if (userPlaying.getMagicEnergy() < healingSpell.getMagicEnergySpent()) {
                    // para determinar la energia si cumple con lo solicitado
                    System.out.println("Your magic energy is not enough for this spell. You loose your turn and gain +10 magic energy points.");
                   //informamos y sumamos 10
                    userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() + 10);
                } else {
                    userPlaying.setLifeSpan(userPlaying.getLifeSpan() + healingSpell.getLifeRecovered());
                    userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() - healingSpell.getMagicEnergySpent());
                    if (userPlaying.getLifeSpan() > 100)
                        userPlaying.setLifeSpan(100);
                }
            }
            //si elije hechizo de sanacion
            if (userPlaying.spells.get(spellSelected - 1) instanceof RecoverySpell) {
                RecoverySpell recoverySpell = (RecoverySpell) userPlaying.spells.get(spellSelected - 1);
                if (userPlaying.getMagicEnergy() < recoverySpell.getMagicEnergySpent()) {
                    System.out.println("Your magic energy is not enough for this spell. You loose your turn and gain +10 magic energy points.");
                    userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() + 10);
                } else {
                    userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() + recoverySpell.getEnergyRecovered() - recoverySpell.getMagicEnergySpent());
                    if (userPlaying.getMagicEnergy() > 100)
                        userPlaying.setMagicEnergy(100);
                }
            }
        } else {
            //muere y se informa
            System.out.println(otherPlayer.getName()+ ".Sorry, you are dead. \n You lost! \n The game ends.");
            System.exit(0);
        }
        if (otherPlayer.getLifeSpan() <= 0) {
            //muere el oponente e informamos
            System.out.println(" Your opponent is dead. \n You win! \n The game ends.");
            System.exit(0);
        }
        //el jugador puede cambiar de ubicacion en cada partida
        System.out.println("Now you can change your location if you want.");
        boolean auxiliar = true;
        do {
            System.out.println("1) Hogwarts");
            System.out.println("2) Diagon Alley");
            System.out.println("3) Hogsmeade");
            System.out.print("Option: ");
            int locationPlayer = keyboard.nextInt();
            switch (locationPlayer) {
                case 1:
                    auxiliar = false;
                    userPlaying.setLocation("1) Hogwarts");
                    break;
                case 2:
                    auxiliar = false;
                    userPlaying.setLocation("2) Diagon Alley");
                    break;
                case 3:
                    auxiliar = false;
                    userPlaying.setLocation("3) Hogsmeade");
                    break;
                default:
                    System.out.println("\n You must choose a valid option.");
                    userPlaying.setLocation((String) null);
                    break;
            }
        } while (auxiliar);

        //despues de cada partida informamos el estado del personaje
        System.out.printf("Here's your status: \n Name: %s \n Location: %s \n Life span: %d \n Magic energy: %d \n",
                userPlaying.getName(),
                userPlaying.getLocation(),
                userPlaying.getLifeSpan(),
                userPlaying.getMagicEnergy()
        );
    }
}








