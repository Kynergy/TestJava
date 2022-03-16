package com.company;

public class Persoana {
    String nume;
    String prenume;
    int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public void afisare() {
        System.out.println("Buna! Eu sunt " + prenume + " si am " + varsta + " ani!");
    }
}
