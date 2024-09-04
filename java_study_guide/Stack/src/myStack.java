public class myStack<T> {

    //<T> : means you can use any type of stack such as int, double,String etc. 

    //LIFO
    private T[] values;
    private int height;

    public myStack() {
        this.values = (T[])new Object[10];
        this.height = 0;

    }

    public myStack(int maxHeight) {
        this.values = (T[])new Object[maxHeight];
        this.height = 0;

    }

    public void push(T t){

        values[height] = t;
        height++;




    }

    public T pop(){

        //int top = values[height-1];
        //values[height-1] = 0;
        height--;


        return values[height];

        
    }

    public boolean isEmpty(){

        return height == 0;
    }

    public int getHeight(){
        
        return height;

    }

    public T peek(){
        return values[height-1];
    }
    



}
