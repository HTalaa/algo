package algo;

public class exo33 {
    public static void main(String[] args) {
        System.out.println(carre(5));

        int y=carre(6);
        System.out.println(y);

        carre(7);
        int z=carre(2)*2;
        int f=5;
        System.out.println(carre(f));
    }
    public static int carre(int x){
        return x*x;
    }
}
