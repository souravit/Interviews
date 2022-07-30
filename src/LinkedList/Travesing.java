package LinkedList;

public class Travesing {
    public static void main(String[] args) {

        Node head = Create_Nodes.createNode();
     //   System.out.println("\n"+head.data);
       // Travering(head);
        TraversingRec(head);
        TravesingLastNode(head);
    }

    private static Node TravesingLastNode(Node head) {


        return head;
    }

    public static void TraversingRec(Node head) {
        //base
        if(head == null){
            return;
        }
        //logic
        Node curr = head;
        System.out.println(curr.data);
        Travering(curr.next);
    }

    public static void Travering(Node head) {
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
