package org.experis.learning;

public class Cane extends Animale implements Nuotante{
    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("Bau!");
    }

    @Override
    public void mangia() {
        System.out.println("sta mangiando le crocchette.");
    }

    @Override
    public void nuota() {
        System.out.println("Bau! Sto nuotando!");
    }
}
