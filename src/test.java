import java.util.LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val= val;
    }
}
public class test {
    public static Node removeElements(Node head, int val) {
        if(head == null) return null;

        while (head != null && head.val == val){
            head = head.next;
        }
        Node temp = head;

//         while(temp != null){

//         }
        return head;
    }

    public static Node create(){
        Node n1 = new Node(7);
        Node n2 = new Node(7);
        Node n3 = new Node(7);
        Node n4 = new Node(7);
        Node n5 = new Node(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Node head = n1;
        return head;
    }
    public static void main(String[] args) {
        Node head = create();
        removeElements(head,7);

    }
}
