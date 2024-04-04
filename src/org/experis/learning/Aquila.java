package org.experis.learning;

public class Aquila extends Animale{
    public Aquila(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("Screeeech!");
    }

    @Override
    public void mangia() {
        System.out.println("sta mangiando un topolino.");
    }
}
