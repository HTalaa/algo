package algo;

import java.util.Scanner;

public class exo08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Etes-vous pret?:");
        boolean ready=sc.nextBoolean();
        System.out.print("Le panier est-il vide?:");
        boolean empty=sc.nextBoolean();
        if(ready && !empty){
                System.out.println("Je lence la balle ");
        }
        else if(!ready)
        {
            System.out.println("je ne lance pas la balle car vous n'etes pas pret");
        }
        else{
            System.out.println("je ne lance pas la balle car le panier est vide ");
        }


    }
}
