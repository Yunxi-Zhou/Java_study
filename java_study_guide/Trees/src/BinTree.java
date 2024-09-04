import java.lang.Math;

public class BinTree<T> {
    public T value;
    public BinTree<T> left;
    public BinTree<T> right;

    public BinTree(T value) {
        this.value = value;
    }

    public int length() {
        if (left == null && right == null) {
            return 1;
        }
        if (left == null) {
            return 1 + right.length();
        }
        if(right == null) {
            return 1 + left.length();
        }
        return 1 + Math.max(left.length() , right.length());

    }

    public int Element() {
        if (left == null && right == null) {
            return 1;
        }
        if (left == null) {
            return 1 + right.Element();
        }
        if(right == null) {
            return 1 + left.Element();
        }
        return 1 + left.Element() + right.Element();

    }

    public String toString() {

        if (left == null && right == null) {
            return value.toString();
        }
        if (left == null) {
            return value.toString() + " -> { " + right.toString() + " }";

        }
        if (right == null) {
            return "{ " + left.toString() + " } <- " + value.toString();
        }
        return "{ " + left.toString() + " } <- " + value.toString() + " -> { " + right.toString() + " }";
    }

}
