package algo;

import java.util.Scanner;

public class exo22 {
    public static void main(String[] args) {
        // ---------------------
        // Entrez l'element 1 :
        // 1
        // Entrez l'element 2 :
        // 2
        // Entrez l'element 3 :
        // 3
        // Entrez l'element 4 :
        // 4
        // Entrez l'element 5 :
        // 5
        // Entrez l'element 6 :
        // 6
        // Le tableau contient :
        // 1 | 2 | 3 | 4 | 5 | 6 |
        // --------------------
        Scanner sc = new Scanner(System.in);

        // déclarer le tableau pour accueillir 6 entiers
        int tab[]=new int[6];
        // boucle pour saisir les 6 entiers
        for(int i=0;i<6;++i){
            System.out.println("Entrez l'element "+(i+1) +" :");
            tab[i]=sc.nextInt();
        }
        // Afficher le message : Le tableau contient :
        System.out.println("Le tableau contient :");
        // boucle pour afficher le contenu du tableau
        for (int t:tab){
            System.out.print(t+" | ");
        }
    }

}
