package algo;

import java.util.Scanner;

public class exoSup01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pass="1234567a";
        int x=3;
        do{
            System.out.println("Enteres votre mot de pass");
            String mot=sc.next();
            if(pass.equals(mot)){
                System.out.println("Bienvenu votre mot de pass est juste");
                x=0;
            }
            else {
                System.out.println("erreur mot de pass ");
                x--;
                if(x==0){
                    System.out.println(" votre  compte est bloqué et vous ne pourriez pas réessayer une quatrième fois ");
                }
            }
        }while (x>0);

    }
}
