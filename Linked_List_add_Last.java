class Linked_List{
    class node{
        String data;
        Node.next;

        Node(String data)
        {
        this.data=data;
        this.next=null;
        }
        public void main addLast(String data){
            Node newNode = new Node(data);
            if( head==null)
            {
              head=newNode;
            }
            return;
            Node currNode = head;
            while(currNode.next !=null){
                currNode=currNode.next;

            }
        }

         public voide main (String args[]){
        l1=new Linked_List();
        list.addFirst("a");
        list.addFirst("is");

        
 }   }   }