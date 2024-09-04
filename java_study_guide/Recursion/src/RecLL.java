public class RecLL {
    public RecLL next;

    public int value;
    private boolean empty = true;

    public RecLL(int value) {
        this.value = value;
        this.empty = false;
    }

    public RecLL() {}

    public void setValue(int value) {
        this.value=value;
        empty = false;
    }
    
    public boolean isEmpty() {
        return empty;
    }
}
