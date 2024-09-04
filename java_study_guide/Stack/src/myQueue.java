public class myQueue {


    private int[] values;
    private int length;

    public myQueue() {
        values = new int[5000];
        length = 0;
    }

    public void add(int value){
        values[length]=value;
        length++;
    }

    public int remove(){

        int value = values[0];
        length--;
        for(int i = 0;i < length;i++){
            values[i] = values[i+1];
        }
        
        return value;
    }

    public int peek(){
        return values[0];
    }

    public boolean isEmpty(){
        return length == 0;
    }



    public int length(){
        return length;
    }



}