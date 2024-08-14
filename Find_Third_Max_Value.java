class thirdmax{
    public static void find(int []arr){
        int firstmax=0;
        int semax=0;
        int third=0;
    for (int i=0;i<4;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[j]>firstmax){
                firstmax=arr[j];
            }
            if(arr[j]> semax && arr[j] != firstmax){
                semax=arr[j];
            }
            if(arr[j]> third && arr[j] != firstmax && arr[j] != semax){
                third=arr[j];
            }
        }
    }
        System.out.println(third);
    }
}
public class Find_Third_Max_Value {
    public static void main(String []args){

        int arr[]={2,55,4,77,33,22,33,1,5,6,-55};
        thirdmax.find(arr);
    }
}
