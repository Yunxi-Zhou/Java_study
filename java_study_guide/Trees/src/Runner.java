

public class Runner {
    public static void main(String[] args) {
        BinTree<Integer> L = new BinTree<Integer>(5);
        L.left = new BinTree<Integer>(4);
        L.right = new BinTree<Integer>(1);
        L.left.left = new BinTree<Integer>(3);
        L.right.left = new BinTree<Integer>(3);
        L.right.right = new BinTree<Integer>(1);
        L.left.left.left = new BinTree<Integer>(4);
        L.left.left.left.left = new BinTree<Integer>(7);
        L.left.left.left.right = new BinTree<Integer>(8);


        System.out.println(L);
        System.out.println(L.length());
        System.out.println(L.Element());



    }
}
