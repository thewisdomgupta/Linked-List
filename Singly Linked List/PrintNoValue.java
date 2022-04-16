public class PrintNoValue {
    public static void main(String [] args){
        Node obj=new Node();
        System.out.println(obj.x);
        System.out.println(obj.next);
    }
}
class Node{
    int x;
    Node next;
}
