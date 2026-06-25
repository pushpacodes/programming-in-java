public class optimizedpower{
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpow = pow(x,n/2) ;
        int halfpowsq=halfpow*2;
        if(n%2!=0){
            halfpowsq=x*halfpowsq;
        }
        return halfpowsq;
    }
    public static void main(String args[]){
        int x =2;
        int n=10;
        System.out.print(pow(x,n));
    }
}