private static void print(Node head) {
    while (head != null) {
        // Print the data in the current node
        System.out.print(head.data + " ");
        // Move to the next node
        head = head.next; // Move to the next node
    }
    System.out.println();
}

// Function to insert a new node with value 'k' at the end of the doubly linked list
private static Node insertAtTail(Node head, int k) {
    // Create a new node with data 'k'
    Node newNode = new Node(k);

    // If the doubly linked list is empty, set 'head' to the new node
    if (head == null) {
        return newNode;
    }

    // Traverse to the end of the doubly linked list
    Node current = head;
    while (current.next != null) {
        current = current.next;
    }

    // Connect the new node to the last node in the list
    current.next = newNode;
    newNode.back = current;

    return head;
    }




public static void main(String[] args) {
    int[] arr = {12, 5, 6, 8, 4};
    // Convert the array to a doubly linked list
    Node head = convertArr2DLL(arr);
    
    // Print the doubly linked list
     System.out.println("Doubly Linked List Initially: ");
    print(head);

    System.out.println("Doubly Linked List After Inserting before the node with value 8:");

    head = insertAtTail(head, 10); // Insert a node with value 10 at the end
    print(head);

}
}