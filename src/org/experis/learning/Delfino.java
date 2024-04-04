package org.experis.learning;

public class Delfino extends Animale implements Nuotante{
    public Delfino(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("Eee click eee-eee click-click!");
    }

    @Override
    public void mangia() {
        System.out.println("sta mangiando uno sgombro.");
    }

    @Override
    public void nuota() {
        System.out.println("Eee click - sto nuotando!");
    }
}
