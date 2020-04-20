package algo;

import java.util.Scanner;

public class exo30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp;
        int length=10;
        int tab[]=new int[length];
        tab[0]=2;
        tab[1]=4;
        tab[2]=6;
        tab[3]=8;
        tab[4]=10;

        System.out.println("Entrez votre nombre :");
        temp=sc.nextInt();


        for(int i=0;i<tab.length;++i){
            if(temp<tab[i]){
                for (int j=tab.length-2;j>=i;--j){
                    tab[j+1]=tab[j];
                }
                tab[i]=temp;
                break;
            }
        }
       for(int t:tab){
           if(t!=0)
                System.out.println(t);
       }

    }
}
