public class Iterate_Digit_in_int {
    public static void main (String args[]){
        int num=1234567;

        String str=Integer.toString(num);
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        int num2=Integer.parseInt(str);
        System.out.println(num2+1);
    }
    
}
