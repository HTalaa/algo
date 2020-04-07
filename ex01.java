package algo;

import java.util.Arrays;

public class ex01 {
    public static void main(String[] args) {
        int a,b;
        a=5;
        b=7;

        System.out.printf("a= %d b= %d \n",a,b);
        int c=a;
        a=b;
        b=c;
        System.out.printf("a= %d b= %d",a,b);
    }
}
