import java.util.*;
class Linearsearch2darr{
    public static int [] find(int arr[][],int val){
        int ar[]=new int[2];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==val){
                    ar[0]=i;
                    ar[1]=j;
                    return new int[] {i,j};
                }
            }

        }
        ar[0]=-1;
        return ar;
    }

}
public class Linear_Search_in_2D_Array {
    public static void main(String args[]){
        int[][] arr={{1,2,3,7},{4,5,6},{0,8,9}};
        int ar2[]=Linearsearch2darr.find(arr, 7);
        System.out.println(Arrays.toString(ar2));
    }    
}
