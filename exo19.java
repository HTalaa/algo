package algo;

import java.util.Scanner;

public class exo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10,r=1;

//        exo19 À l’aide de la boucle TantQue … Faire, réalisez un algorithme calculant le
//        résultat de N 10 . N étant un nombre saisi par l'utilisateur

        // Entrez le nombre à exposer :
        System.out.println("Entrez le nombre à exposer :");
        int x=sc.nextInt();
        // 2
        // 2 exposant 10 = 1024
        do{
            r*=x;
            n--;
        }while (n>0);
        System.out.printf("%d exposant 10 = %d",x,r);
    }
}
