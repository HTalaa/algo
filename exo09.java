package algo;

import java.util.Scanner;

public class exo09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int coca=3,eau=0;
        System.out.println("Il  reste  "+coca+" coca et "+eau+" eau dans le distributeur");
        System.out.println("Choisessez une boisson : tapez :\n 1 : coca \n 2 : eau");
        int choix=sc.nextInt();
        switch (choix)
        {
            case 1:

                if(coca==0) {
                    System.out.println("Il n'y a plus de coca");
                    System.out.println("Il ne reste que "+coca+" coca et "+eau+" eau dans le distributeur");
                }
                else
                    System.out.println("voici votre coca");
                break;

            case 2:
                if(eau==0) {
                    System.out.println("Il n'y a plus d'eau");
                    System.out.println("Il ne reste que " + coca + " coca et " + eau + " eau dans le distributeur");
                }
                else
                    System.out.println("voici votre eau");
                break;
        }


    }
}
