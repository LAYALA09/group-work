package ar.com.ada.online.second.practiceone;

import superclass.CharactTwo;

public class  Wizard extends CharactTwo {
    //falta completar
    private String nWand;
    protected static String u1="A";
    protected static String u2="B";
    protected static String u3="C";


    public Wizard(String name, Integer standardOfLiving, Integer magicalEnergy, String nWand) {
        super(name, standardOfLiving, magicalEnergy);
        this.nWand = nWand;
    }

    public static String getU1() {
        return u1;
    }

    public static String getU2() {
        return u2;
    }

    public static String getU3() {
        return u3;
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
        return "Wizard{" +
                "nWand='" + nWand + '\'' +
                '}';
    }
}


