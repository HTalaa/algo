package algo;

import java.util.Scanner;

public class exo29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tab[]={"O"," _"," _"," _ "," _ "," _ "," _ "," _ "," _ "," _ "};
        int act=0;
        char x;
        do{
            for(String t:tab)
                System.out.print(t);
            System.out.println("\nd pour a droite \n g pour a gouche \n q pour stop \n votre choix:\n");
            x=sc.next().charAt(0);
            switch (x){
                case 'd':
                    if(act <9){
                        tab[act]=" _ ";
                        tab[act+1]="O";
                        act+=1;
                    }else {
                        System.out.println("vous etes a la fin");
                    }

                    break;
                case 'g':
                    if(act>0){
                        tab[act]=" _ ";
                        tab[act-1]="O";
                        act-=1;
                    }
                    else{
                        System.out.println("vous etes au debut");
                    }

                    break;
                case 'q':
                    break;
                    default:
                        System.out.println("essayez un autre choix");
                        break;
            }
        }while(x !='q');
    }
}
