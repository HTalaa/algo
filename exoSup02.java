package algo;

import java.util.Scanner;

public class exoSup02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Enterez le nombre :");
        int x=sc.nextInt();
        while (i<x){
            int j=0;
            while (j<=i){
                System.out.print("*");
                ++j;
            }
            System.out.print("\n");
            ++i;
        }

    }
}
