import java.util.Arrays;

public class $2d_Arrays_demo {
    public static void main(String []args){
         char[][] c=new char[3][3];
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]='-';
            }
         }
         System.out.println(Arrays.toString(c));//its two dimension array so we use deep to string othervise its return reference
         System.out.println(Arrays.deepToString(c));
         char[][] c1=new char[3][3];
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==2 & j==2){
                    c1[i][j]='2';
                }
                else{
                    if(i==0 && j==1 || i==1 && j==1 || i==1 && j==2){
                        c1[i][j]='1';
                    }
                    else
                    {
                        c1[i][j]='0';
                    }
                }
            }
         }
         System.out.println("tic tac toe");
         System.out.println(Arrays.deepToString(c1));

         System.out.println("without loops");

         char [][]c2={{'0','1','0'},{'0','1','1'},{'0','0','2'}};
         System.out.println(Arrays.deepToString(c2));

         System.out.println("Another Method to intializing 2d arrays");

         char [][]c3=new char[][]{
            new char[]{'0','1','0'},
            new char[]{'0','1','1'},
            new char[]{'0','0','2'}
         };
         System.out.println(Arrays.deepToString(c3));

    }
}
