package algo;

import java.util.Scanner;

public class exo05 {
    public static void main(String[] args) {
        int d,s,m,h,rs;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number of seconds:");
        s=sc.nextInt();
        d=s/86400;
        h=s%86400/3600;
        m=s%3600/60;
        rs=s%60;
        System.out.printf("%d is equivalent to %d days and %d hours and %d minutes and %d sec",s,d,h,m,rs);



    }
}
