public class pairingfriends{
    public static int sol(int n){
        if (n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        //single
        int fnm1=sol(n-1);

        //pair
        int fnm2=(n-1)*sol(n-2);

        //total
        int total= fnm1 + fnm2;

        return total;
    }
    public static void main(String args[]){
        System.out.print(sol(3));
    }
}