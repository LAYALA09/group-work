package ar.com.ada.online.second.practiceone;

import superclass.CharactTwo;

import java.util.Random;

public class  Wizard extends CharactTwo {
    //falta completar
    private String nWand;


    public Wizard(String name, Integer standardOfLiving, Integer magicalEnergy, String nWand) {
        super(name, standardOfLiving, magicalEnergy);
        this.nWand = nWand;
    }




    public String getnWand() {

        return nWand;
    }


    public void setnWand(String nWand) {
        this.nWand = nWand;
    }

     public void game() {

    }

    @Override
    public String toString() {
        return "Wizard" +
                "nWand='" + nWand + '\'' +
                '}';
    }
}


