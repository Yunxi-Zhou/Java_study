public class DoubleLinkedList {
    
    private DoubleNode head;
    
    public DoubleLinkedList(DoubleNode head){
        this.head = head;
    }

    public DoubleLinkedList(){}

    public boolean isEmpty(){
        return head == null;
    }

    public void appendFront(int value) {

        DoubleNode node = new DoubleNode(value);
        node.next = head;
        head.prev = node;
        head = node;
    }


    public void insertAt(int value, int index){

        if(index==0){
            
            appendFront(value);

        }

        DoubleNode leftNode;
        DoubleNode rightNode = head;
        DoubleNode node = new DoubleNode(value);

        for (int i = 0; i < index; i++){
            rightNode= rightNode.next;
        }
        
        leftNode = rightNode.prev;
        leftNode.next = node;
        rightNode.prev = node;
        node.next = rightNode;
        node.prev = leftNode;

    }

    public void print(){
        if(isEmpty()){
            System.out.println("[]");
        }
        else{
            String s = "[";
            DoubleNode current = head;
            while(current.next != null){
                s += current.value + " <--> ";
                current = current.next;
            }
            s += current.value + "]";
            System.out.println(s);
        }
        
    }
}
