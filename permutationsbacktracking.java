public class permutationsbacktracking{
    public static void permutation(String s,String ans){
        //basecase
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        //recurssion
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //abcde=ab+de=abde
            String ns=s.substring(0,i)+s.substring(i+1,s.length());
            permutation(ns,ans+ch);
        }
    }
    public static void main(String args[]){
        permutation("abc","");
    }
}