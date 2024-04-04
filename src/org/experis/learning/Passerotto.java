package org.experis.learning;

public class Passerotto extends Animale{
    public Passerotto(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("Cip cip!");
    }

    @Override
    public void mangia() {
        System.out.println("sta mangiando un verme.");
    }
}
