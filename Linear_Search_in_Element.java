class LinearSearch{
    public static int find(int a[],int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int find(String str,char target){
        String cha="";
        int flag=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                cha +=i;
                flag++;
            }
        }
        if(flag==0){
            return -1;
        }
         int j=Integer.parseInt(cha);
         return j;
    }

}
public class Linear_Search_in_Element {
    public static void main(String []args){
        int []arr={1,2,3,4,6};
        System.out.println(LinearSearch.find(arr, 3));
        System.out.println(LinearSearch.find(arr, 0));
        System.out.println(LinearSearch.find(arr,6));

        String name="JAVA";
        System.out.println("Character Search");
        System.out.println(LinearSearch.find(name, 'A'));
    }
}
