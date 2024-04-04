package org.experis.learning;

public abstract class Animale {
    // Attributi
    private String nome;

    // Costruttori

    public Animale(String nome) {
        this.nome = nome;
    }

    // Metodi

        // Getter e Setter

    public String getNome() {
        return nome;
    }

    public void dormi(){
        System.out.println("Zzz");
    }

    public abstract void verso();

    public abstract void mangia();
}
