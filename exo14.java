package algo;

import java.util.Scanner;

public class exo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockBalles;
        // Entrez le nombre de balles dans le panier  :
        // 2
        System.out.print("Entrez le nombre de balles dans le panier  : ");
        stockBalles=sc.nextInt();

        while (stockBalles>0)
        {
            System.out.println("Etes-vous prêt ? ");
            boolean pret = sc.nextBoolean();
            if(pret )
            {
                System.out.println("Je lance la balle");
                stockBalles--;
            }
            else
            {
                System.out.println("Je ne lance pas la balle ");
            }

        }
        System.out.println("Partie terminée");

    }
}
