public class LinkedList {
    
    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList(){

    }


    public Boolean isEmpty(){
        return head == null;
    }

    public void appendFront(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;


    }

    public void appendBack(int value){

        Node node = new Node(value);
        if(isEmpty()){
            head = node;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }

    }

    public void removeFirstOccurrence(int value){
        if(isEmpty()){
            return;
        }
        if(head.value == value){
            head = head.next;
        }
        else{
            Node current = head;
            while(current.next != null){
                if(current.next.value == value){
                    // 1 2 3  -> value = 3  -> not empty -> head = 1 != 3
                    //-> current = head = 1 -> current.next = 2 != 3 ->  current = current.next = 2
                    //-> current = 2 -> current.next = 3 == value -> current.next = empty -> break;
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
        }
    }

    public void removeAll(int value){}

    public void contains(int value){}

    public int getLength(){ 
        return 1;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("[]");
        }
        else{
            String s ="[";
            Node current = head;
            while(current.next != null){
                s += current.value + "->";
                current = current.next;
            }
            s += current.value + "]";
            System.out.println(s);
        }
    }



}
