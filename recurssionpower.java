public class recurssionpower{
    public static int pow(int x,int n){
        if(n==1){
            return x;
        }
        return x*pow(x,n-1);
    }
    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.print(pow(x,n));
    }
}