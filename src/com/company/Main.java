package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

import static java.lang.Integer.MAX_VALUE;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persoana> persoana = new ArrayList<>();
        persoana.add(new Persoana("Popescu", "Maria", 35));
        persoana.add(new Persoana("Ionescu", "Ioan", 45));
        persoana.add(new Persoana("Georgescu", "Marian", 25));
        persoana.add(new Persoana("Popa", "Ileana", 20));
        persoana.add(new Persoana("Draghici", "Emil", 28));
        prezentareLista(persoana);
        System.out.println("Persoana cea mai tanara din lista este: " + varstaMica(persoana));
    }

    public static void prezentareLista(ArrayList<Persoana> persoana) {
        for (var p : persoana) {
            p.afisare();
        }
    }

    public static int  varstaMica(ArrayList<Persoana> persoana) {
        int a = Integer.MAX_VALUE;
        for (Persoana p : persoana) {
            if (p.getClass() == Persoana.class && a > p.varsta) {

                a = p.varsta;

            }


        }
        return a;
    }
}
