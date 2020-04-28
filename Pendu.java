package algo;

import java.util.Random;
import java.util.Scanner;

public class Pendu {
    public static void main(String[] args) {
        String tabFacile[] = {"chien", "pizza", "porte", "maison"};
        String tabMoyen[] = {"fenetre", "ordinateur", "smartphone", "poubelle"};
        String tabDifficile[] = {"anticonstitutionnellement", "pluridisciplinaire", "socioconstructivisme", "metamorphose"};
        int f=0;
        int m=0;
        int d=0;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        boolean envie = true;
        String mot;
        do {
        char niveau=choix(f,m,d);
        if(niveau=='1') {
            try {
                mot = tabFacile[f];
                int lg_mot = mot.length();
                String affichage = "";
                affichage = Init(mot);
                boolean ok;
                int nbLettreTrouver;
                int nbEssai = 0;
                String lettreDejaSaisie = "";
                affichageJeu(affichage, lettreDejaSaisie, mot);
                String smot = "";

                do {
                    nbLettreTrouver = 0;

                    String lettreTapee;

                    do {
                        System.out.println();
                        System.out.println("Votre Proposition " + (nbEssai + 1) + " : ");
                        Scanner lettre = new Scanner(System.in);
                        lettreTapee = lettre.nextLine();
                    } while (lettreTapee.length() == 0 || estEntier(lettreTapee) || lettreDejaSaisie.contains(lettreTapee));

                    char lettreSeule = lettreTapee.charAt(0);

                    boolean dejaSaisie = false;
                    for (int ctp = 0; ctp < lettreDejaSaisie.length(); ctp++) {
                        char uneLettre = lettreDejaSaisie.charAt(ctp);
                        if (uneLettre == lettreSeule) {

                            dejaSaisie = true;
                        }
                    }
                    //ou dejaSaisie = lettreDejaSaisie.indexOf(lettreSeule) != -1;
                    // System.out.println(smot.contains(String.valueOf(lettreSeule)));
                    if (dejaSaisie) {
                        System.out.println("\u001B[35m Vous l'avez déja proposée  !!\u001B[0m");
                    } else {

                        lettreDejaSaisie += lettreSeule;
                    }

                    ok = false;
                    for (int parcours = 0; parcours <= lg_mot - 1; parcours++) {
                        if (lettreSeule == mot.charAt(parcours)) {
                            ok = true;
                        }


                        char lettreAAfficher = '_';
                        //smot="";
                        for (int ctp = 0; ctp < lettreDejaSaisie.length(); ctp++) {
                            char uneLettre = lettreDejaSaisie.charAt(ctp);
                            if (uneLettre == mot.charAt(parcours)) {
                                lettreAAfficher = uneLettre;

                                nbLettreTrouver++;
                            }


                        }
                        smot += String.valueOf(lettreAAfficher) + " ";
                        //affichageJeu(smot,lettreDejaSaisie,mot);

                        //System.out.print(lettreAAfficher + " ");
                    }
                    affichageJeu(smot, lettreDejaSaisie, mot);
                    smot = "";
                    //System.out.println(smot);


                    System.out.println();
                    if (!ok) {
                        //System.out.println("La lettre n'est pas dans le mot !");
                        //System.out.println(lettreDejaSaisie);

                        nbEssai++;
                    }
                } while (nbLettreTrouver != mot.length() && nbEssai < 10);
                affichageJeu(smot, lettreDejaSaisie, mot);
                if (nbEssai < 10) {
                    System.out.println("*****************************************************************");
                    System.out.println("");
                    System.out.println("\u001B[36m           Gagné  !       \u001B[0m");
                    System.out.println("");
                    System.out.println("*****************************************************************");
                    ++f;
                } else {
                    System.out.println("*****************************************************************");
                    System.out.println("");
                    System.out.println("\u001B[31m C'est perdu ! Le mot était : " + mot + "\u001B[0m");
                    System.out.println("");
                    System.out.println("*****************************************************************");
                }
            }catch (Exception e)
            {
                System.out.println("Vous avez fini ce niveau, il faut choisir un autre niveau");
            }
            }
        else if(niveau=='2')
        {
            try {
                mot = tabMoyen[m];
                int lg_mot = mot.length();
                String affichage = "";
                affichage = Init(mot);
                boolean ok;
                int nbLettreTrouver;
                int nbEssai = 0;
                String lettreDejaSaisie = "";
                affichageJeu(affichage, lettreDejaSaisie, mot);
                String smot = "";

                do {
                    nbLettreTrouver = 0;

                    String lettreTapee;

                    do {
                        System.out.println();
                        System.out.println("Votre Proposition " + (nbEssai + 1) + " : ");
                        Scanner lettre = new Scanner(System.in);
                        lettreTapee = lettre.nextLine();
                    } while (lettreTapee.length() == 0 || estEntier(lettreTapee) || lettreDejaSaisie.contains(lettreTapee));

                    char lettreSeule = lettreTapee.charAt(0);

                    boolean dejaSaisie = false;
                    for (int ctp = 0; ctp < lettreDejaSaisie.length(); ctp++) {
                        char uneLettre = lettreDejaSaisie.charAt(ctp);
                        if (uneLettre == lettreSeule) {

                            dejaSaisie = true;
                        }
                    }
                    //ou dejaSaisie = lettreDejaSaisie.indexOf(lettreSeule) != -1;
                    // System.out.println(smot.contains(String.valueOf(lettreSeule)));
                    if (dejaSaisie) {
                        System.out.println("\u001B[35m Vous l'avez déja proposée  !!\u001B[0m");
                    } else {

                        lettreDejaSaisie += lettreSeule;
                    }

                    ok = false;
                    for (int parcours = 0; parcours <= lg_mot - 1; parcours++) {
                        if (lettreSeule == mot.charAt(parcours)) {
                            ok = true;
                        }


                        char lettreAAfficher = '_';
                        //smot="";
                        for (int ctp = 0; ctp < lettreDejaSaisie.length(); ctp++) {
                            char uneLettre = lettreDejaSaisie.charAt(ctp);
                            if (uneLettre == mot.charAt(parcours)) {
                                lettreAAfficher = uneLettre;

                                nbLettreTrouver++;
                            }


                        }
                        smot += String.valueOf(lettreAAfficher) + " ";
                        //affichageJeu(smot,lettreDejaSaisie,mot);

                        //System.out.print(lettreAAfficher + " ");
                    }
                    affichageJeu(smot, lettreDejaSaisie, mot);
                    smot = "";
                    //System.out.println(smot);


                    System.out.println();
                    if (!ok) {
                        //System.out.println("La lettre n'est pas dans le mot !");
                        //System.out.println(lettreDejaSaisie);

                        nbEssai++;
                    }
                } while (nbLettreTrouver != mot.length() && nbEssai < 10);
                affichageJeu(smot, lettreDejaSaisie, mot);
                if (nbEssai < 10) {
                    System.out.println("*****************************************************************");
                    System.out.println("");
                    System.out.println("\u001B[36m           Gagné  !       \u001B[0m");
                    System.out.println("");
                    System.out.println("*****************************************************************");
                    ++m;
                } else {
                    System.out.println("*****************************************************************");
                    System.out.println("");
                    System.out.println("\u001B[31m C'est perdu ! Le mot était : " + mot + "\u001B[0m");
                    System.out.println("");
                    System.out.println("*****************************************************************");
                }
            }catch (Exception e)
            {
                System.out.println("Vous avez fini ce niveau, il faut choisir un autre niveau");
            }
        }
        else if(niveau=='3')
        {
            try {
                mot = tabDifficile[d];
                int lg_mot = mot.length();
                String affichage = "";
                affichage = Init(mot);
                boolean ok;
                int nbLettreTrouver;
                int nbEssai = 0;
                String lettreDejaSaisie = "";
                affichageJeu(affichage, lettreDejaSaisie, mot);
                String smot = "";

                do {
                    nbLettreTrouver = 0;

                    String lettreTapee;

                    do {
                        System.out.println();
                        System.out.println("Votre Proposition " + (nbEssai + 1) + " : ");
                        Scanner lettre = new Scanner(System.in);
                        lettreTapee = lettre.nextLine();
                    } while (lettreTapee.length() == 0 || estEntier(lettreTapee) || lettreDejaSaisie.contains(lettreTapee));

                    char lettreSeule = lettreTapee.charAt(0);

                    boolean dejaSaisie = false;
                    for (int ctp = 0; ctp < lettreDejaSaisie.length(); ctp++) {
                        char uneLettre = lettreDejaSaisie.charAt(ctp);
                        if (uneLettre == lettreSeule) {

                            dejaSaisie = true;
                        }
                    }
                    //ou dejaSaisie = lettreDejaSaisie.indexOf(lettreSeule) != -1;
                    // System.out.println(smot.contains(String.valueOf(lettreSeule)));
                    if (dejaSaisie) {
                        System.out.println("\u001B[35m Vous l'avez déja proposée  !!\u001B[0m");
                    } else {

                        lettreDejaSaisie += lettreSeule;
                    }

                    ok = false;
                    for (int parcours = 0; parcours <= lg_mot - 1; parcours++) {
                        if (lettreSeule == mot.charAt(parcours)) {
                            ok = true;
                        }


                        char lettreAAfficher = '_';
                        //smot="";
                        for (int ctp = 0; ctp < lettreDejaSaisie.length(); ctp++) {
                            char uneLettre = lettreDejaSaisie.charAt(ctp);
                            if (uneLettre == mot.charAt(parcours)) {
                                lettreAAfficher = uneLettre;

                                nbLettreTrouver++;
                            }


                        }
                        smot += String.valueOf(lettreAAfficher) + " ";
                        //affichageJeu(smot,lettreDejaSaisie,mot);

                        //System.out.print(lettreAAfficher + " ");
                    }
                    affichageJeu(smot, lettreDejaSaisie, mot);
                    smot = "";
                    //System.out.println(smot);


                    System.out.println();
                    if (!ok) {
                        //System.out.println("La lettre n'est pas dans le mot !");
                        //System.out.println(lettreDejaSaisie);

                        nbEssai++;
                    }
                } while (nbLettreTrouver != mot.length() && nbEssai < 10);
                affichageJeu(smot, lettreDejaSaisie, mot);
                if (nbEssai < 10) {
                    System.out.println("*****************************************************************");
                    System.out.println("");
                    System.out.println("\u001B[36m           Gagné  !       \u001B[0m");
                    System.out.println("");
                    System.out.println("*****************************************************************");
                    ++d;
                } else {
                    System.out.println("*****************************************************************");
                    System.out.println("");
                    System.out.println("\u001B[31m C'est perdu ! Le mot était : " + mot + "\u001B[0m");
                    System.out.println("");
                    System.out.println("*****************************************************************");
                }
            }catch (Exception e)
            {
                System.out.println("Vous avez fini ce niveau, il faut choisir un autre niveau");
            }
        }


            // rejouer ?
            envie = rejouer();
        }while(envie);
    }
    public static char choix(int f,int m,int d){
        String f1="oooo";
        String m1="oooo";
        String d1="oooo";
        if(f==1){
            f1="*ooo";
        }
        else if(f==2){
            f1="**oo";
        }
        else if(f==3){
            f1="***o";
        }
        else if(f==4){
            f1="****";
        }
        if(m==1){
            m1="*ooo";
        }
        else if(m==2){
            m1="**oo";
        }
        else if(m==3){
            m1="***o";
        }
        else if(m==4){
            m1="****";
        }

        if(d==1){
            d1="*ooo";
        }
        else if(d==2){
            d1="**oo";
        }
        else if(d==3){
            d1="***o";
        }
        else if(d==4){
            d1="****";
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("|-------------------------------------------------------------------------------------------------------|");
        System.out.println("| Le Pendu :");
        System.out.println("|-------------------------------------------------------------------------------------------------------|");
        System.out.println("  Vous avez réussi 0 niveaux");
        System.out.println("|-------------------------------------------------------------------------------------------------------|");
        System.out.println("Choisissez le niveau :");
        System.out.println("\u001B[36m"+"1 =  niveau facile       : 5 à 6    letres   "+f1+"\u001B[0m");
        System.out.println("\u001B[33m"+"2 =  niveau moyen        : 7 à 10   lettres  "+m1+"\u001B[0m");
        System.out.println("\u001B[31m"+"3 =  niveau difficile    : 12 à 26  lettres  "+d1+"\u001B[0m");

        System.out.println("Quel Niveau ?");
        char choix = sc.nextLine().charAt(0);
        while(choix != '1' && choix != '2' && choix != '3')
        {
            System.out.println("\u001B[35m"+"Niveau inconnu : veuillez saisir 1,2 ou 3"+"\u001B[0m");
            System.out.println("Quel Niveau ?");
            choix = sc.nextLine().charAt(0);
        }
        return choix;
    }

    public static void affichageJeu(String affichage,String lettreDejaSaisie,String mot) {
        //clearConsole();
        String x=clean(lettreDejaSaisie,mot);
        //System.out.println(clean(lettreDejaSaisie,mot));

        char lettrseDejaSaisie[]=new char[10];

        for(int i=0;i<10;++i){
            try {

                lettrseDejaSaisie[i]=x.charAt(i);

            }catch (Exception e2){
                lettrseDejaSaisie[i]=' ';

            }
        }
        String a="|----------------------------------------------------------------------------------------|";
        String b="|                 |   1  |   2  |   3  |   4  |   5  |   6  |   7  |   8  |   9  |   10  |";
        String c="|----------------------------------------------------------------------------------------|";
        String d="| Proposition     |   \u001B[36m"+lettrseDejaSaisie[0]+"\u001B[0m  |   \u001B[36m"+lettrseDejaSaisie[1]+"\u001B[0m  |   \u001B[36m"+lettrseDejaSaisie[2]+"\u001B[0m  |   \u001B[36m"+lettrseDejaSaisie[3]+"\u001B[0m  |   \u001B[33m"+lettrseDejaSaisie[4]+"\u001B[0m  |   \u001B[33m"+lettrseDejaSaisie[5]+" \u001B[0m |   \u001B[33m"+lettrseDejaSaisie[6]+"\u001B[0m  |   \u001B[31m"+lettrseDejaSaisie[7]+" \u001B[0m |   \u001B[31m"+lettrseDejaSaisie[8]+" \u001B[0m |    \u001B[31m"+lettrseDejaSaisie[9]+"\u001B[0m  |";
        String e="|----------------------------------------------------------------------------------------|";
        if(lettrseDejaSaisie[8]!=' ')
        {
            a+="       |-------|";
            b+="       |       o";
            c+="       |      /|\\";
            d+="       |       /";
            e+="       |_________________";
        }else if(lettrseDejaSaisie[7]!=' ')
        {
            a+="       |-------|";
            b+="       |       o";
            c+="       |      /|\\";
            d+="       |";
            e+="       |_________________";
        }

        else if(lettrseDejaSaisie[6]!=' ')
        {
            a+="       |-------|";
            b+="       |       o";
            c+="       |      /|";
            d+="       |";
            e+="       |_________________";
        }
        else if(lettrseDejaSaisie[5]!=' ')
        {
            a+="       |-------|";
            b+="       |       o";
            c+="       |       |";
            d+="       |";
            e+="       |_________________";
        }
        else if(lettrseDejaSaisie[4]!=' ')
        {
            a+="       |-------|";
            b+="       |       o";
            c+="       |";
            d+="       |";
            e+="       |_________________";
        }
        else if(lettrseDejaSaisie[3]!=' ')
        {
            a+="       |-------|";
            b+="       |";
            c+="       |";
            d+="       |";
            e+="       |_________________";
        }
        else if(lettrseDejaSaisie[2]!=' ')
        {
            a+="       |-------";
            b+="       |";
            c+="       |";
            d+="       |";
            e+="       |_________________";
        }
        else if(lettrseDejaSaisie[1]!=' ')
        {
            a+="       |";
            b+="       |";
            c+="       |";
            d+="       |";
            e+="       |_________________";
        }
        else if(lettrseDejaSaisie[0]!=' ')
        {
            e+="       _________________";
        }
        System.out.println("Le mot mestère : "+ affichage);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        //System.out.println("Votre proposition 1 : ");
    }

    public static boolean rejouer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voulez-vous rejouer ? true/false ");
        String chaine = sc.nextLine();
        while (!chaine.equals("true") && !chaine.equals("false"))
        {
            System.out.println("Veuillez saisir true ou false");
            chaine = sc.nextLine();
        }

        return Boolean.parseBoolean(chaine);
    }
    public static String Init(String mot){
        int lg_mot = mot.length();
        // L'opérateur + sert à concaténer des chaînes de caractères.
        String str = "";
        System.out.println("Le mot fait " + lg_mot + " lettres : ");
        for (int tiret = 1; tiret <= lg_mot; tiret++) {
            str+="_ ";
        }
        return str;
    }
    public static String clean(String lettreDejaSaisie,String mot){
        String str="";
        if(lettreDejaSaisie.length()==0){
            return  lettreDejaSaisie;
        }
        else
        {
            for(int i=0;i<lettreDejaSaisie.length();++i){
                try {
                        if(!mot.contains(String.valueOf(lettreDejaSaisie.charAt(i))))
                            str+=lettreDejaSaisie.charAt(i);

                }catch (Exception e2){

                }
            }
        }

        return str;
    }
    public  static void clearConsole()
    {
        try {

            Runtime.getRuntime().exec("cls");


        } catch (Exception e) {}
    }
    public static boolean estEntier (String chaine){
        try{
            Integer.parseInt(chaine);
        } catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }
}
