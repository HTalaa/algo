package algo;

import java.util.Scanner;

public class exo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encore=false;
//        exo18 À l’aide d’une boucle Faire … TantQue , améliorez l’algorithme de la
//        calculatrice afin qu’elle demande à l’utilisateur s’il veut faire un autre calcul (tant qu’il
//        le désire).

        // Entrez le nombre 1 :
        // 2
        // Entrez l'opérateur :
        // +
        // Entrez le nombre 2 :
        // 2
        // 2 + 2 = 4
        // Désirez-vous faire un autre calcul ?
        // true
        // Entrez le nombre 1 :
        // 3
        // Entrez l'opérateur :
        // -
        // Entrez le nombre 2 :
        // 2
        // 3 - 2 = 1
        // Désirez-vous faire un autre calcul ?
        // false
        // Au revoir
        do{
            // Entrez le nombre 1 :
            System.out.println("Entrez le nombre 1 :");
            // 4
            String temp = sc.next();
            temp = temp.replace(",", ".");
            double nb1 = Double.parseDouble(temp);
            // Entrez l'opérateur (+, -, *, /) :
            System.out.println("Entrez l'opérateur (+, -, *, /) :");
            // +
            char op = sc.next().charAt(0);
            // Entrez le nombre 2 :
            System.out.println("Entrez le nombre 2 :");
            // 3
            temp = sc.next();
            temp = temp.replace(",", ".");
            double nb2 = Double.parseDouble(temp);
            // 4 + 3 = 7

            switch(op)
            {
                case '+':
                    System.out.println(nb1 + " " + op + " " +nb2 + "=" + (nb1+nb2));
                    break;
                case '-':
                    System.out.println(nb1 + " " + op + " " +nb2 + "=" + (nb1-nb2));
                    break;
                case '*':
                    System.out.println(nb1 + " " + op + " " +nb2 + "=" + (nb1*nb2));
                    break;
                case '/':
                    if(nb2 != 0)
                        System.out.println(nb1 + " " + op + " " +nb2 + "=" + (nb1/nb2));
                    else
                        System.out.println("Division par 0");
                    break;
                default:
                    System.out.println("Erreur : opérateur inconnu");
            }
            System.out.println("Désirez-vous faire un autre calcul ? ");
            encore=sc.nextBoolean();
        }while (encore);
        System.out.println(" Au revoir");

    }
}
