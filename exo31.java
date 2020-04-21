package algo;

import java.util.Scanner;

public class exo31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int temp=-1;
        int x;
        int tab1[]={9,1,8,7,3,2};
        try {
            for(int t:tab1){

                System.out.print(t+" | ");
            }
            System.out.println("\nEntrez le nombre pour chercher");
            x = sc.nextInt();

            for (int i = 0; i < tab1.length; ++i) {
                if (x == tab1[i]){
                    for (int j=i;j<tab1.length-1;++j){
                        tab1[j]=tab1[j+1];
                    }
                    tab1[tab1.length-1]=0;
                   // temp = i;

                }



            }
            for(int t:tab1){

                System.out.print(t+" | ");
            }
           // System.out.println(temp);
        }catch (Exception e){
            System.out.println("ce n'est pas un nombre");
        }

    }
}
