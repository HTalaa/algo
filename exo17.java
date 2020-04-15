package algo;

import java.util.Scanner;

public class exo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        exo17 À l’aide d’une boucle Faire … TantQue , améliorez l’algorithme du distributeur
//        de boissons pour qu’il demande au client s’il désire une autre boisson (Tant qu’il en a
//                envie).
//
        // Choisissez votre boisson : 1 pour coca, 2 pour eau
        // 1
        // Voici votre coca
        // Désirez-vous une autre boisson ?
        // true
        // Choisissez votre boisson : 1 pour coca, 2 pour eau
        // 1
        // Voici votre coca
        // Désirez-vous une autre boisson ?
        // false
        // Merci et au revoir
        int stockCoca = 2, stockEau = 0;
        boolean encore=false;
        do{

            System.out.println("Choisissez une boisson, tapez :\n" +
                    "        1 : coca\n" +
                    "        2 : eau\n Mon choix :");

            String choix = sc.next();

            switch (choix)
            {
                case "1": // coca
                    if(stockCoca > 0)
                    {
                        System.out.println("Voici votre coca");
                        stockCoca = stockCoca - 1;
                        // stockCoca--;
                        // stockCoca -= 1;
                    }
                    else
                    {
                        System.out.println("Il n'y a plus de coca");
                    }
                    break;
                case "2": // eau
                    if(stockEau > 0)
                    {
                        System.out.println("Voici votre eau");
                        stockEau = stockEau - 1;
                        // stockCoca--;
                        // stockCoca -= 1;
                    }
                    else
                    {
                        System.out.println("Il n'y a plus de eau");
                    }
                    break;
                default:
                    System.out.println("Le choix n'est pas valide");

            }
            System.out.println("Il reste "+stockCoca+" coca et "+stockEau+" eau dans le distributeur");


            if(stockCoca>0 || stockEau>0){
                System.out.println("Désirez-vous une autre boisson ? ");
                encore=sc.nextBoolean();
            }
            else{
                encore=false;
                System.out.println("le distributeur est vide");
            }

        }while(encore);
        System.out.println(" Merci et au revoir");
    }
}
