public class tiling{
    public static int tile(int n){ //2xn floor size
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //working
        //vertical choice
        int verticaltiles=tile(n-1);

        //horizontal choice
        int horizontaltiles=tile(n-2);

        //total ways
        int totalways= verticaltiles + horizontaltiles;
        return totalways;
    }
    public static void main(String args[]){
        System.out.print(tile(3));
    }
}