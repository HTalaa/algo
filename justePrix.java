package algo;

import java.util.Random;
import java.util.Scanner;

public class justePrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean ret=false;
        String choix="";
        do {
            System.out.println("|-------le juste prix---------|\n" +
                    "choisissez le niveau de votre choix\n " +
                    "       1 : Facile entre 1 et 10\n" +
                    "        2 : Moyen entre 1 et 100\n" +
                    "        3 : Difficile entre 1 et 1000\n Niveau :");
            label:
            do {


                choix = sc.next();

                switch (choix) {
                    case "1": //
                        System.out.println("--------------------------------------");
                        System.out.println("le juste prix: Facile entre 1 et 10");

                        ret = prix(11);
                        break label;
                    case "2":
                        ret = prix(101);
                        break label;
                    case "3":
                        ret = prix(1001);
                        break label;
                    default:
                        System.out.println("niveu inconnu, veuillez saisir un nombre entre 1 et 3");
                        break;
                }
            } while (!ret );

        }while (ret);
        System.out.println("------------------------------------\n Au revoir");
    }
    public static boolean prix(int lim){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int proposition=0;
        int tent=0,tent1=10;

        int justePrix = r.nextInt(lim-2)+1;
        System.out.println("Le juste prix est : "+justePrix);
        System.out.println("--------------------------------------");

        do{
            System.out.printf("  Il vous reste %d essais\n",tent1);
            System.out.println("Vous pensez à  :");
            try {
                proposition = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.printf("veuillez saisir un nombre entre 1 et %d :",lim-1);
                proposition = Integer.parseInt(sc.nextLine());
            }

            if(proposition>=1 && proposition<lim) {

                if (proposition < justePrix) {
                    System.out.println("***********\nC'est plus\n*************");
                } else if(proposition > justePrix) {
                    System.out.println("***********\nC'est moins\n**************");
                }

                --tent1;
                //++tent;
            }
            else{
                System.out.printf("veuillez saisir un nombre entre 1 et %d",lim-1);
            }
        }while(justePrix!=proposition && tent1>0);
        if(tent1==0){
            System.out.println("C'est perdue >> la reponse etait "+justePrix+" :-)\n voulez-vous rejouer? true /false");
        }
        else{
            System.out.println("C'est gagné :-)\n voulez-vous rejouer? true /false");
        }

        return sc.nextBoolean();
    }
}
