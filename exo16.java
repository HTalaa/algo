package algo;

import java.util.Scanner;

public class exo16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int justePrix,proposition;
        System.out.print("Enterez le prix :");
        justePrix=sc.nextInt();
        System.out.print("Enterez le proposition :");
        proposition=sc.nextInt();
        if(proposition < justePrix){
            System.out.println("C’est plus");
        }
        else if (proposition > justePrix){
            System.out.println("C’est moins");
        }
        else{
            System.out.println("C’est gagné");
        }
    }
}
