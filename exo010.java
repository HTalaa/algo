package algo;

import java.util.Scanner;

public class exo010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id;
        float no1,no2;
        System.out.println("Calculatrice: MENU\n");
        System.out.println("1.Addition.");
        System.out.println("2.Soustraction.");
        System.out.println("3.Division.");
        System.out.println("4.Multiplication.");
        System.out.println("5.Puissance.");
        System.out.print("Quel calcul veux-tu effectuer?  ");
        id=sc.nextInt();
       switch (id)
       {
           case 1:
               System.out.print("Rentres le Premier nombre :");
               no1=Float.parseFloat(sc.next());
               System.out.print("Rentres le deuxiem nombre :");
               no2=Float.parseFloat(sc.next());
               System.out.println(no1+" + "+no2+" = "+(no1+no2));
               break;
           case 2:
               System.out.print("Rentres le Premier nombre :");
               no1=Float.parseFloat(sc.next());
               System.out.print("Rentres le deuxiem nombre :");
               no2=Float.parseFloat(sc.next());
               System.out.println(no1+" - "+no2+" = "+(no1-no2));
               break;
           case 3:
               System.out.print("Rentres le Premier nombre :");
               no1=Float.parseFloat(sc.next());
               System.out.print("Rentres le deuxiem nombre :");
               no2=Float.parseFloat(sc.next());
               if(no2 !=0)
                    System.out.println(no1+" / "+no2+" = "+(no1/no2));
               else
                   System.out.println("division par 0");
               break;
           case 4:
               System.out.print("Rentres le Premier nombre :");
               no1=Float.parseFloat(sc.next());
               System.out.print("Rentres le deuxiem nombre :");
               no2=Float.parseFloat(sc.next());
               System.out.println(no1+" * "+no2+" = "+(no1*no2));
               break;
           case 5:
               System.out.print("Rentres le Premier nombre :");
               no1=Float.parseFloat(sc.next());
               System.out.print("Rentres le deuxiem nombre :");
               no2=Float.parseFloat(sc.next());
               System.out.println(no1+" ^ "+no2+" = "+(Math.pow(no1,no2)));
               break;
           default:
               System.out.println("Votre choix n'exist pas");

               break;
       }
    }
}
