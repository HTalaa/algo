package algo;

import java.util.Scanner;

public class exo08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Are you ready?:");
        boolean ready=sc.nextBoolean();
        if(ready){
            System.out.print("is tha cart empty?:");
            boolean empty=sc.nextBoolean();
            if(!empty){
                System.out.println("yes you can now");
            }
            else{
                System.out.println("sorry its empty");
            }
        }
        else
        {
            System.out.println("sorry i am not ready");
        }


    }
}
