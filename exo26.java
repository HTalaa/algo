package algo;

public class exo26 {
    public static void main(String[] args) {
        int temp=0;
        int tab1[]={9,1,8,7,3,2};
        for(int i=0;i<tab1.length;++i){
            for (int j=i+1;j<tab1.length;++j){
                if(tab1[i]>tab1[j]){
                    temp=tab1[j];
                    tab1[j]=tab1[i];
                    tab1[i]=temp;
                }
            }


        }

        for(int t:tab1){
            System.out.println(t);
        }

    }
}
