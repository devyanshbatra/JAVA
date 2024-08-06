class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class LinkedList{
    
    private static int lengthofaLL(Node head){
        int cnt=0;
        Node temp=head;
         while(temp!=null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[]arr={2,5,8,7};
        Node head = new Node(arr[0]);
        head.next= new Node(arr[1]);
        head.next.next= new Node(arr[2]);
        head.next.next.next= new Node(arr[3]);
        
        System.out.println(lengthofaLL(head));
    }
}