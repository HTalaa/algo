package algo;

import java.util.Scanner;

public class exoSup03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int min=0;


        do{
            System.out.printf("Entrez le nombre %d :",i+1);
            int x=sc.nextInt();
            if(i==0){
                min=x;
            }
            if(x<min){
                min=x;
            }
            ++i;
        }while (i<10);
        System.out.printf("le minimum est %d",min);
    }
}
