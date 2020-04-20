package algo;

import java.util.Scanner;

public class exo24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double tab[];
        try {
            System.out.println("Entrez le nombre de joueurs entre 1 et 10");
            int no=sc.nextInt();
            if(no <=0 && no >10){
                System.out.println("le nombre n'est pas entre 1 et 10");
            }
            else{
                tab=new double[no];
                for(int i=0;i<no;++i){
                    System.out.println("Entrez le score de joueur "+(i+1)+" :");
                    tab[i]=Double.parseDouble(sc.next());
                }

                double sum=0;
                for(double d:tab){
                    sum+=d;
                }
                System.out.println("le moyen est :"+(sum/no));
            }
        }catch (Exception e){
            System.out.println("ce n'est pas un nombre");
        }





    }
}
