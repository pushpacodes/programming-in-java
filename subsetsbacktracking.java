public class subsetsbacktracking{
    public static void findingsubsets(String s,String ans,int i){
        //base case
        if(i==s.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        //recurssion case
        //yes
        findingsubsets(s,ans+s.charAt(i),i+1);
        //no
        findingsubsets(s,ans,i+1);
    }
    public static void main(String args[]){
        String s="abc";
        findingsubsets(s,"",0);
    }
}