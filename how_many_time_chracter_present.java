class charecter{
    public static int charepresent(String str,char c){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                ++count;
            }
        }
        return count;
    }

}
public class how_many_time_chracter_present {
    public static void main(String args[]){
        String str1="Java Developer";
        System.out.println(charecter.charepresent(str1, 'e'));
    }
}
