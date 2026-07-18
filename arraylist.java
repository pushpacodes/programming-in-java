import java.util.ArrayList;
public class arraylist{
    public static void swap(ArrayList<Integer> list,int id1,int id2){
        int temp=list.get(id1);
        list.set(id1,list.get(id2));
        list.set(id2,temp);
        System.out.println(list);
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        swap(list,2,3);
    }
}