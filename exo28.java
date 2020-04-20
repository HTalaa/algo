package algo;

import java.util.Scanner;

public class exo28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int temp=-1;
        int x;
        int tab1[]={9,1,8,7,3,2};
        try {
            System.out.println("Entrez le nombre pour chercher");
            x = sc.nextInt();

            for (int i = 0; i < tab1.length; ++i) {
                if (x == tab1[i])
                    temp = i;


            }
            System.out.println(temp);
        }catch (Exception e){
            System.out.println("ce n'est pas un nombre");
        }





    }
}
