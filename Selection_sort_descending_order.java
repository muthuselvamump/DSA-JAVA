import java.util.*;
class selectionsort{
    public static void descending(int []ar){
        int max=ar[0];
        int inde=0;
        for (int i=0;i<ar.length;i++){
            max=ar[i];
            for(int j=i;j<ar.length;j++){
                if(max<ar[j]){
                    max=ar[j];
                    inde=j;
                }
            }
            ar[inde]=ar[i];
            ar[i]=max;
        }
    }
}
public class Selection_sort_descending_order{
    public static void main(String []args){
        int []arr={3,1,45,3,6,77,15,1,2};
        selectionsort.descending(arr);
        System.out.println(Arrays.toString(arr));
    }
}