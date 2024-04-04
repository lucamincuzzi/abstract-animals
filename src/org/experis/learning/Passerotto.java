package org.experis.learning;

public class Passerotto extends Animale implements Volante{
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

    @Override
    public void vola() {
        System.out.println("Cip cip, volo!");
    }
}
