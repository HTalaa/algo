package algo;

public class exo15 {
    public static void main(String[] args) {
        int i=1;
        while (i<10)
        {
            System.out.printf("  La table par %d :\n",i);
            int j=1;
            while (j<11){
                System.out.printf("%d * %d = %d\n",j,i,i*j);
                j++;
            }
            i++;

        }
    }
}
