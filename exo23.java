package algo;

public class exo23 {
    public static void main(String[] args) {
        int tab[]=new int[10];
        for(int i=0;i<10;i++){
            tab[i]=(int)Math.pow(2,i+1);
        }
        for(int t:tab){
            System.out.println(t);
        }
    }
}
