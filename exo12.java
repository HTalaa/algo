package algo;

import java.util.Scanner;

public class exo12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j1,j2,j3,h1,h2,h3,m1,m2,m3,s1,s2,s3,sTotal1=0,sTotal2=0,sDiff;
        // ====== DEBUT =====================
        // Pour la durée 1 :
        System.out.println("Pour la durée 1");
        // Entrez le nombre de jours : 5
        System.out.print("Entrez le nombre de jours : ");
        j1=sc.nextInt();
        sTotal1 += j1*86400;
        // Entrez le nombre de heures : 5
        System.out.print("Entrez le nombre de heures : ");
        h1=sc.nextInt();
        sTotal1 += h1*3600;
        // Entrez le nombre de minutes : 5
        System.out.print("Entrez le nombre de minutes : ");
        m1=sc.nextInt();
        sTotal1+=m1*60;
        // Entrez le nombre de secondes : 5
        System.out.print("Entrez le nombre de secondes : ");
        s1=sc.nextInt();
        sTotal1+=s1;
        // ----------------------------------
        // Pour la durée 2 :
        System.out.println("Pour la durée 2");
        // Entrez le nombre de jours : 4
        System.out.print("Entrez le nombre de jours : ");
        j2=sc.nextInt();
        sTotal2 += j2*86400;
        // Entrez le nombre de heures : 4
        System.out.print("Entrez le nombre de heures : ");
        h2=sc.nextInt();
        sTotal2 += h2*3600;
        // Entrez le nombre de minutes : 4
        System.out.print("Entrez le nombre de minutes : ");
        m2=sc.nextInt();
        sTotal2+=m2*60;
        // Entrez le nombre de secondes : 4
        System.out.print("Entrez le nombre de secondes : ");
        s2=sc.nextInt();
        sTotal2+=s2;
        // ---------------------------------
        // La différence entre ces 2 durées est de :
        sDiff=sTotal1-sTotal2;

        j3=sDiff/86400;
        h3=sDiff%86400/3600;
        m3=sDiff%3600/60;
        s3=sDiff%60;
        System.out.printf(" La différence entre ces 2 durées est de :\n %dj, %dh, %dm, %ds",j3,h3,m3,s3);
        // 1j, 1h, 1m, 1s
        // ===========FIN==============

        // ==== TESTS ? =========
        //
    }

}
