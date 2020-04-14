package algo;

import java.util.Scanner;

public class exo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Etes-vous prêt ? ");
        boolean pret = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Le panier est-il vide ?");
        boolean panierVide = Boolean.parseBoolean(sc.nextLine());

        if(pret && !panierVide)
        {
            System.out.println("Je lance la balle");
        }
        else
        {
            System.out.println("Je ne lance pas la balle car");
            if(panierVide)
            {
                System.out.println("le panier est vide");
            }
            if(!pret)
            {
                System.out.println("vous n'êtes pas prêt");
            }
        }

    }
}
