package algo;

import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enterz la note: ");
        float x=Float.parseFloat(sc.next());
        if ( x>=0 && x <11)
        {
            System.out.println("I");
        }
        else if( x>=11 && x <13){
            System.out.println("S");
        }
        else if( x>=13 && x <16){
            System.out.println("B");
        }
        else if( x>=16 && x <19){
            System.out.println("TB");
        }
        else if( x>=19 && x <=20){
            System.out.println("Excellent");
        }
        else
        {
            System.out.println("PAS Valid");
        }

    }
}
