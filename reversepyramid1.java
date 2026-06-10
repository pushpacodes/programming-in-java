public class reversepyramid1{
    public static void main(String args[]){
        int n =4;
        for(int i=4;i>0;i--){
            for(int j=0;j<(n-i+1);j++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}