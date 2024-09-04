public class RecLLUtil {
    public static void append(RecLL L, int value) {
        // Base case
        if(L.isEmpty()) {
            L.setValue(value);

        }
        else if(L.next == null){

            L.next = new RecLL(value);


        }
        else {
            append(L.next, value);
        }
    }

    public static void removeAll(RecLL L, int value) {
        if(L.isEmpty() || L.next == null) {
            return ;
        }
        if (L.next.value == value) {
            // delate
            L.next = L.next.next;
            removeAll(L, value);
        }else{
            removeAll(L.next, value);
        }
    }

    public static void print(RecLL L) {
        if (L.isEmpty()) {
            System.out.println("[]");
        }
        else {
            String s = "[";
            while(L.next != null) {
                s += L.value + " -> ";
                
                L = L.next;
            }
            s += L.value + "]";
            System.out.println(s);
        }
    }
}
