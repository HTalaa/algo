package algo;

import java.util.Scanner;

public class exo24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double tab[];

        System.out.println("Entrez le nombre de joueurs entre 1 et 10");
        int no=sc.nextInt();

        if(no <0 && no >10){
            System.out.println("le nombre n'est pas entre 1 et 10");
        }
        else{
            tab=new double[no];
        }

    }
}
