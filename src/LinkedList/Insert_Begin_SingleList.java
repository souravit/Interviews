package LinkedList;

public class Insert_Begin_SingleList {
    public static void main(String[] args) {
        Node head = Create_Nodes.createNode();
        insertAtBegin(head,5);
    }

    private static void insertAtBegin(Node head, int i) {
        Node newNode = new Node(i);
        newNode.next = head;
        Travesing.TraversingRec(newNode);

    }
}
