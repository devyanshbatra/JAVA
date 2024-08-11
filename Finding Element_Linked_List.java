class Node {
    int data;
    Node next;
    
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
   
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class Linked_List{
    public static int checkifPresent(Node head, int desiredElement){
        Node temp=head;
        while (temp != null) {
          
            if (temp.data == desiredElement)
                return 1;  

            
            temp = temp.next;
        }

        return 0;  
    }

  
    public static void main(String[] args) {
      
        int[] arr = {1, 2, 3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int val = 3;  
        System.out.print(checkifPresent(head, val));
    }
}
    
