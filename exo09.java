package algo;

import java.util.Scanner;

public class exo09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int coca=3,eau=0;
        System.out.println("Choisessez une boisson : tapez :\n 1 : coca \n 2 : eau");
        int choix=sc.nextInt();
        switch (choix)
        {
            case 1:

                if(coca==0)
                    System.out.println("Il n'y a plus de coca");
                else
                    System.out.println("voici votre coca");
                break;

            case 2:
                if(eau==0)
                    System.out.println("Il n'y a plus d'eau");
                else
                    System.out.println("voici votre eau");
                break;
        }


    }
}