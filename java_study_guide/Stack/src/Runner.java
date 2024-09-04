public class Runner {
    public static void main(String[] args) {
        
/*
        myStack<String> s1 = new myStack<String>();
        myStack<Integer> s2 = new myStack<Integer>();
        s1.push("A");
        s1.push("CD");
        s1.push("EF");
        s2.push(1);
        s2.push(33);
        s2.push(100);

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());

 */
        myQueue q = new myQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());



    }
}
