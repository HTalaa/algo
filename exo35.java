package algo;

import java.util.Arrays;

public class exo35 {
    public static void main(String[] args) {
        int tab1[]={9,2,3,6,7,1};
        int tab2[]={5,2,4,6,3,8};
        merge(tab1,tab2);


    }
    public static void merge(int[] tab1,int[] tab2){
            int aLen=tab1.length;
            int bLen=tab2.length;
            int result[]=new int[aLen+bLen];
            System.arraycopy(tab1,0,result,0,aLen);
            System.arraycopy(tab2,0,result,aLen,bLen);
        System.out.println(Arrays.toString(result));

    }
}
