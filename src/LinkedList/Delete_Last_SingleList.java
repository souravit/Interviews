package LinkedList;

public class Delete_Last_SingleList {
    public static void main(String[] args) {
        Node head = Create_Nodes.createNode();
      //  Node newHead = deleteLast(head);
        //Travesing.TraversingRec(newHead);
      Node newHe=  deleteLastRec(head);
      Travesing.TraversingRec(newHe);
    }

    private static Node deleteLastRec(Node head) {
        if(head.next.next ==null){
            head.next = null;
            return head;
        }
        deleteLastRec(head.next);

        return head;
    }

    private static Node deleteLast(Node head) {
        if(head == null) return null;
        if(head.next == null) return null;
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;

    }
}
