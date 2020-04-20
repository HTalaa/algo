package algo;

import java.util.Scanner;

public class exo27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // déclarer le tableau pour accueillir 6 entiers
        int tab[]=new int[10];
        // boucle pour saisir les 6 entiers
        try {
            for (int i = 0; i < tab.length; ++i) {
                System.out.println("Entrez l'element " + (i + 1) + " :");
                tab[i] = sc.nextInt();
            }
            int min = tab[0];
            for (int i = 1; i < tab.length; ++i) {
                if (min > tab[i]) {
                    min = tab[i];
                }
            }

            System.out.println("le minimum est " + min);
        }catch(Exception e){
            System.out.println("ce n'est pas un nombre");
        }

    }
}
