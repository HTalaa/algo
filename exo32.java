package algo;

public class exo32 {
    public static void main(String[] args) {
        int tab1[]={9,2,3,6,7,1};
        int tab2[]={5,2,4,6,3,8};
        int tab3[]=new int[12];
        for (int t:tab1){
            insert(tab3,t);
            for (int t1:tab3){
                System.out.print(t1+" | ");

            }
            System.out.println("");
        }

        for (int t:tab2){
            insert(tab3,t);
            for (int t1:tab3){
                System.out.print(t1+" | ");

            }
            System.out.println("");
        }

    }
    public static void insert(int[] tab,int x){
        for(int i=0;i<tab.length;++i){
            if(x<tab[i]){
                for (int j=tab.length-2;j>=i;--j){
                    tab[j+1]=tab[j];
                }
                tab[i]=x;
                break;
            }
            else if(tab[i]==0){
                tab[i]=x;
                break;
            }


        }
    }
}
