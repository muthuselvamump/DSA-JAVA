import java.util.Arrays;
public class arrays_demo {
    public static void main(String []args){
        String []colours=new String[5];
        colours[0]="blue";
        colours[1]="white";
        colours[2]="yellow";
        System.out.println(colours);//its show us memory reference

        System.out.println(Arrays.toString(colours));
        System.out.println(colours[3]);//its show us particular index element

        int [] nums=new int[2];
        nums[0]=150;
        nums[1]=300;
        int [] nums1={150,300};//just another method to intializing arrays

        //arrays iteration methods

        for(int i=0;i<5;i++){
            System.out.println(colours[i]);
        }

        System.out.println("IN REVERSE ORDER");
        
        for(int i=colours.length-1;i>=0;i--){
            System.out.println(colours[i]);

        }
        System.out.println("FOR EACH LOOP ITERATION");

        for(String str:colours){
            System.out.println(str);
        }
        
        System.out.println("STREAM METHOD");
        Arrays.stream(colours).forEach(System.out::println);

        System.out.println("ARRYAS SORT METHOD");
        int nums2[]={8,5,4,9,77,1,58,7,2,2};
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));
    
    }
    
}
