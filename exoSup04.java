package algo;

import java.util.Scanner;

public class exoSup04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nbRep, nbTiret, nbEtoile,i=0,j=0,k=0;
        String result="";
        System.out.print("Entrez le nombre des reps : ");
        nbRep=sc.nextInt();
        System.out.print("Entrez le nombre des tiret : ");
        nbTiret=sc.nextInt();
        System.out.print("Entrez le nombre des etoiles : ");
        nbEtoile=sc.nextInt();
        while(nbTiret != i){
            result+="-";
            ++i;
        }
        while(nbEtoile != j){
            result+="*";
            ++j;
        }
        String x="";
        while (nbRep !=k){
            x+=result;
            ++k;
        }
        System.out.println("|"+x+"|");

    }
}
