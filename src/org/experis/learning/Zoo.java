package org.experis.learning;

public class Zoo {
    public static void main(String[] args) {
        Animale[] animali = generaAnimali();

        osservaZoo(animali);
    }

    private static void osservaZoo(Animale[] animali) {
        for(Animale a : animali){
            System.out.println("Nome: " + a.getNome());
            System.out.println("Tipo animale: " + a.getClass().getSimpleName().toLowerCase());
            a.verso();
            System.out.print(a.getNome() + " ");
            a.mangia();
            a.dormi();
            System.out.println("---------------------------");
        }
    }

    private static Animale[] generaAnimali() {
        return new Animale[]{new Cane("Jay"), new Passerotto("Dorothy"), new Aquila("Hawks"), new Delfino("Palafin")};
    }
}
