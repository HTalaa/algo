package algo;

import java.util.Random;
import java.util.Scanner;

public class justePrixAvecSP {
    public static boolean estEntier (String chaine){
        try{
            Integer.parseInt(chaine);
        } catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();




        boolean envie = true;
        do {
            // choisir le niveau

            char choix =choisirNiveau();


            // AFFICHER LE TITRE
            String ligne = "------------------------------";
            //String titre = "Le juste prix :";

            int max=max(choix);


            // GENERE LE JUSTE PRIX

            int justePrix = rd.nextInt(max)+1;

            // AFFICHER le juste prix
            System.out.println("Le juste prix : "+ justePrix);
            System.out.println(ligne);

            int nbTentatives = 0, proposition;
            jeu(nbTentatives,max,justePrix);
            // JEU


            // rejouer ?


            envie = rejouer();
        }while(envie);
    }
    public static char choisirNiveau()
    {
        Scanner sc = new Scanner(System.in);
        // choisir le niveau
        System.out.println("Choisissez le niveau :");
        System.out.println("1 : facile entre 1 et 10");
        System.out.println("2 : moyen entre 1 et 100");
        System.out.println("3 : difficile entre 1 et 1000");

        System.out.println("Niveau : ");
        char choix = sc.nextLine().charAt(0);
        while(choix != '1' && choix != '2' && choix != '3')
        {
            System.out.println("Niveau inconnu : veuillez entrer un nombre entre 1 et 3");
            System.out.println("Niveau : ");
            choix = sc.nextLine().charAt(0);
        }
        return choix;
    }
    public static int max(char choix)
    {
        // AFFICHER LE TITRE
        String ligne = "------------------------------";
        String titre = "Le juste prix :";

        if(choix == '1')
        {
            System.out.println(titre + "Facile entre 1 et 10");
            return  10;
        }
        else if(choix == '2')
        {
            System.out.println(titre + "Moyen entre 1 et 100");
            return  100;
        }
        else{
            System.out.println(titre + "Difficile entre 1 et 1000");
            return  1000;
        }

    }

    public static void jeu(int nbTentatives,int max,int justePrix){
        // JEU
        Scanner sc = new Scanner(System.in);
        int proposition;
        do {
            // Afficher le nb essai restant
            System.out.println("Il vous reste "+(10-nbTentatives)+" essais");

            // Demander d'entrer une proposition
            System.out.println("Vous pensez à : ");
            String chaineProp = sc.nextLine();

            // vérifier que le nombre est un entier et le nombre se trouve entre 0 et max
            while(!estEntier(chaineProp) || (Integer.parseInt(chaineProp) < 1 || (Integer.parseInt(chaineProp) >= max)))
            {
                System.out.println("Veuillez entrer un nombre entre 1 et "+max);
                System.out.println("Vous pensez à : ");
                chaineProp = sc.nextLine();
            }


            proposition = Integer.parseInt(chaineProp);
            nbTentatives++;

            if(proposition > justePrix)
            {
                System.out.println("************\nC'est moins\n**********");
            }
            else if(proposition < justePrix)
            {
                System.out.println("************\nC'est plus\n**********");
            }
        }while(proposition != justePrix && nbTentatives < 10);

        // Afficher gagné / perdu
        if(proposition == justePrix)
        {
            System.out.println("************\nC'est gagné\n**********");
        }
        else
        {
            System.out.println("************\nC'est perdu : le juste prix était : "+justePrix+"\n**********");
        }
    }

    public static boolean rejouer()
    {
        Scanner sc=new Scanner(System.in);

        // rejouer ?

        System.out.println("Voulez-vous rejouer ? true/false ");
        String chaine = sc.nextLine();
        while (!chaine.equals("true") && !chaine.equals("false"))
        {
            System.out.println("Veuillez saisir true ou false");
            chaine = sc.nextLine();
        }

        return Boolean.parseBoolean(chaine);
    }
}
