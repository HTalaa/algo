package algo;

import java.util.Scanner;

public class exoIFSup01 {
    public static void main(String[] args) {
        int h,m;
        Scanner sc=new Scanner(System.in);
        // donner l'heure qu'il sera une minute plus tard
        // --------
        // Entrez l'heure :
        System.out.print("Entrez l'heure : ");
        h=sc.nextInt();
        // 1
        // Entrez les minutes :
        System.out.print("Entrez les minutes : ");
        m=sc.nextInt();
        // 59
        // Dans 1 min, il sera : 2h00
        if(m==60){
            m=0;
            h+=1;
        }
        if(h==24){
            h=0;
        }
        // =================
    }
}
