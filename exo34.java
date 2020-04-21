package algo;

import java.util.Scanner;

public class exo34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        int tab1[]={9,1,8,7,3,2};
        try {
            System.out.println("Entrez le nombre pour chercher");
            x = sc.nextInt();

            System.out.println(trouve(tab1,tab1.length,x));
        }catch (Exception e){
            System.out.println("ce n'est pas un nombre");
        }
    }
    public static int trouve(int[] tab,int taille,int val){
        int temp=-1;
        for (int i = 0; i < taille; ++i) {
            if (val == tab[i])
                temp = i;


        }
        return temp;
    }
}
