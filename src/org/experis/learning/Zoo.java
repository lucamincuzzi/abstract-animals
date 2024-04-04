package org.experis.learning;

public class Zoo {
    public static void main(String[] args) {
        Animale[] animali = generaAnimali();

        osservaZoo(animali);
    }

    // Metodi
    private static Animale[] generaAnimali() {
        return new Animale[]{new Cane("Jay"), new Passerotto("Dorothy"), new Aquila("Hawks"), new Delfino("Palafin")};
    }

    private static void osservaZoo(Animale[] animali) {
        for(Animale a : animali){
            System.out.println("Nome: " + a.getNome());
            System.out.println("Tipo animale: " + a.getClass().getSimpleName().toLowerCase());
            a.verso();
            System.out.print(a.getNome() + " ");
            a.mangia();
            a.dormi();

            // Faccio volare o nuotare l'animale a seconda dell'interfaccia che implementa
            volaONuota(a);

            // Separatore visivo
            System.out.println("---------------------------");
        }
    }

    private static void volaONuota(Animale a){
        if(a instanceof Volante){
            faiVolare((Volante) a);
        } else if (a instanceof Nuotante){
            faiNuotare((Nuotante) a);
        }
    }

    private static void faiVolare(Volante a){
        a.vola();
    }

    private static void faiNuotare(Nuotante a){
        a.nuota();
    }
}
