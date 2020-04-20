package algo;

public class exo25 {
    public static void main(String[] args) {
        int tab1[]={5,6,7,8,9};
        int tab2[]=new int[tab1.length];
        int j=0;
        for(int i=tab1.length-1;i>=0;--i){
            tab2[j]=tab1[i];
            ++j;

        }

        for(int t:tab2){
            System.out.println(t);
        }
    }
}
