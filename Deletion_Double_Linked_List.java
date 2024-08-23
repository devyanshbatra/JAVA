public class DLinkedList {
    public static class Node {
        public int data;    
        public Node next;     
        public Node back;    

       
        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }

        
        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }
    }

    
    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]); 
        Node prev = head; 

        for (int i = 1; i < arr.length; i++) {
           
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp; 
            prev = temp; 
        }
        return head; 
    }

   
    private static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null; 
        }
        
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        
        Node newtail = tail.back;
        
        newtail.next = null;
        tail.back = null;
        
        return head;
    }

   
    private static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null; 
        }
        
        Node prev = head;
        head = head.next;
        
        head.back = null;
        prev.next = null;
        
        return head;
    }

  
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " "); 
            head = head.next; 
        }
        System.out.println();
    }

     public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2DLL(arr); 
        print(head); 
        
        System.out.println("Doubly Linked List after deleting tail node: ");
        head = deleteTail(head);
        print(head);
    }