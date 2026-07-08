public class gridways{
    public static int totalways(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){//target
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        int fx=totalways(i+1,j,n,m)+totalways(i,j+1,n,m);
        return fx;
    }
    public static void main(String args[]){
        int n=3;
        int m=3;
        System.out.print(totalways(0,0,3,3));
    }
}