package algo;

import java.util.Scanner;

public class exo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockBalles=3;



        //boolean panierVide = Boolean.parseBoolean(sc.nextLine());
        while (stockBalles!=0)
        {
            System.out.println("Etes-vous prêt ? ");
            boolean pret = Boolean.parseBoolean(sc.nextLine());
            if(pret )
            {
                System.out.println("Je lance la balle");
                stockBalles--;
            }
            else
            {
                System.out.println("Je ne lance pas la balle car vous n'êtes pas prêt");
            }

        }
        System.out.println("Je ne lance pas la balle car le panier est vide");

    }
}
