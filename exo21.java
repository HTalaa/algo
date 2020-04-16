package algo;

import java.util.Random;
import java.util.Scanner;

public class exo21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int proposition=0;
        int tent=0;
        // ------- Juste Prix --------
        // Entrez votre proposition :
        // 5
        // C'est plus
        // Entrez votre proposition :
        // 7
        // C'est moins
        // Entrez votre proposition :
        // 6
        // C'est gagné en 3 tentatives
        // ---------------------------

       // System.out.println("Entrez le justePrix :");
        int justePrix = r.nextInt(101);
        System.out.println(justePrix);
        do{
            System.out.println("Entrez le proposition :");
            proposition = Integer.parseInt(sc.nextLine());

            if(justePrix == proposition)
            {
                System.out.println("C'est gagné");
            }
            else
            {
                if (proposition < justePrix)
                {
                    System.out.println("C'est plus");
                }
                else
                {
                    System.out.println("C'est moins");
                }

            }
            ++tent;
        }while(justePrix!=proposition);
        System.out.printf("C'est gagné en %d tentatives",tent);


    }
}
