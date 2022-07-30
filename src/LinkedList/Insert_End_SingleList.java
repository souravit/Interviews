package LinkedList;

public class Insert_End_SingleList {
    public static void main(String[] args) {
        Node head = Create_Nodes.createNode();
        Node val = InsertEnd(head,40);
        Travesing.TraversingRec(head);
    }

    private static Node InsertEnd(Node head, int i) {
        //base
        if(head == null){
            return new Node(i);
        }
        else{
            head.next= InsertEnd(head.next,i);
        }
        //logic

       return head;
    }
}
