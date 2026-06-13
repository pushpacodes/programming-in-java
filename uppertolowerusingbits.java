public class uppertolowerusingbits{
    public static void main(String args[]){
        String a="PUSHPALATHA";
        for(int i=0;i<a.length();i++){
            char ch =a.charAt(i);
            System.out.print((char)(ch | ' '));
        }
    }
}