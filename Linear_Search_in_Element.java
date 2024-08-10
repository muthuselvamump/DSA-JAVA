class LinearSearch{
    public static int find(int a[],int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static String find(String str,char target){
        String cha="";
        int flag=0;
        String pp=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                cha +=i+pp;
                flag++;
            }
        }
        if(flag==0){
            return "-1";
        }
         return cha;
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
