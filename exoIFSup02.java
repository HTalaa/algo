package algo;

import java.util.Scanner;

public class exoIFSup02 {
    public static void main(String[] args) {
        int h,m,s;
        Scanner sc=new Scanner(System.in);



        // ===============
        // EXO 2
        // donner l'heure qu'il sera une seconde plus tard
        // --------
        // Entrez l'heure :
        // 1
        System.out.print("Entrez l'heure : ");
        h=sc.nextInt();
        // Entrez les minutes :
        // 59
        System.out.print("Entrez les minutes : ");
        m=sc.nextInt();
        // Entrez les secondes:
        // 59
        System.out.print("Entrez les minutes : ");
        s=sc.nextInt();
        // Dans 1 sec, il sera : 2:00:00
        if(h >=0 && h<24 && m>=0 && m<=60){
            s+=1;
            if(s==60){

            }
            if(m==60){
                m=0;
                h+=1;
            }
            if(h==24){
                h=0;
            }
            System.out.printf("Dans 1 min, il sera : %dh%02d",h,m);
        }
        else{
            System.out.println("le temps n'est pas valid");
        }
        // =================
    }
}
