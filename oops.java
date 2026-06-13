public class oops{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("red");
        System.out.print(p1.color);
    }
}

class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}