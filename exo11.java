package algo;

import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enterz la note: ");
        float x=Float.parseFloat(sc.next());
        int note=(int)x;
        switch (note){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("I");
                break;
            case 11:
            case 12:
                System.out.println("S");
                break;
            case 13:
            case 14:
            case 15:
                System.out.println("B");
                break;
            case 16:
            case 17:
            case 18:
                System.out.println("TB");
                break;
            case 19:
            case 20:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("PAS Valid");
                break;




        }

    }
}
