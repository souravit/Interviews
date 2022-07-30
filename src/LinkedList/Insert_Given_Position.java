package LinkedList;

public class Insert_Given_Position {
    public static void main(String[] args) {
        Node head = Create_Nodes.createNode();
       Node newhead = insertPosition(head,0,45 );
       Travesing.TraversingRec(newhead);
    }

    private static Node insertPosition(Node head, int index, int val) {
    Node temp = new Node(val);
    if(index == 1){
        temp.next = head;
        return temp;
    }
    Node curr = head;
    for(int i = 1; i < index - 2 && curr != null ; i++) {
        curr = curr.next;
        if (curr == null) {
            return head;
        }
    }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
