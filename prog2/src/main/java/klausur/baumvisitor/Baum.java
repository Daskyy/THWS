package klausur.baumvisitor;

public class Baum<E extends Comparable<E>> {

    Knoten<E> root;

    public void einfuegen(E content) {}

    protected void traversiere(Visitor<E> visitor) {
        if (root == null) return;
        else traversiere(root, visitor);
    }

    protected void traversiere(Knoten<E> current, Visitor<E> visitor) {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }

    public int size() {
        VisitorSize<E> visitor = new VisitorSize<>();
        traversiere(visitor);
        return visitor.count;
    }
}