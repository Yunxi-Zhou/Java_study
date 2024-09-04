public class Runner {
    public static void main(String[] args) {

        System.out.println("--------------------------------");
        DoubleLinkedList lst3 = new DoubleLinkedList(new DoubleNode(10));
        lst3.appendFront(5);
        lst3.appendFront(7);
        lst3.appendFront(2);
        lst3.appendFront(9);
        lst3.appendFront(4);
        lst3.appendFront(8);
        lst3.print();

        System.out.println("--------------------------------");
        lst3.insertAt(100,2);
        lst3.print();

        System.out.println("--------------------------------");
        try {
            int x;
            x = 1/0;
            System.out.println("successful 1");
            int[] a = {1,2,3};
            a[7] = 7;
            System.out.println("successful 2");

        }
        catch (ArithmeticException e) {
            System.out.println("wrong exception not divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of length");
        }
        


    }
}
