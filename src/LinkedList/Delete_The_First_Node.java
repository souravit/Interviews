package LinkedList;

public class Delete_The_First_Node {
    public static void main(String[] args) {
        Node head = Create_Nodes.createNode();
        Node newHead = deleteFirstNode(head);
        Travesing.TraversingRec(newHead);

    }

    private static Node deleteFirstNode(Node head) {
        //base
        if(head == null){
            return null;
        }
        //logic
        Node newHead = head.next;
        return newHead;
    }
}
