package algo;

public class exo04 {
    public static void main(String[] args) {
        int a,b;
        a=5;
        b=7;

        System.out.printf("a= %d b= %d \n",a,b);

        b=a+b;
        a=b-a;
        b=b-a;
        System.out.printf("a= %d b= %d",a,b);
    }
}
