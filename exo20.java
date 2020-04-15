package algo;

import java.util.Scanner;

public class exo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=1;

//        exo20 Reprenez l’exercice précédent et modifiez le pour que l’utilisateur entre
//        également l’exposant qu’il désire calculer.

        // Entrez le nombre à exposer :
        // 2
        // Entrez l'exposant :
        // 10
        // 2 exposant 10 = 1024

        // ======== TESTS =========
        // 2 exposant 0 = 1
        // 2 exposant 1 = 2
        // 2 exposant 10 = 1024
        System.out.println("Entrez le nombre à exposer :");
        int x=sc.nextInt();
        System.out.println("Entrez l'exposant :");
        int n=sc.nextInt();
        int i=n;
        // 2
        // 2 exposant 10 = 1024
        while (n>0){
            r*=x;
            n--;
        }
        System.out.printf("%d exposant %d = %d",x,i,r);
    }
}
