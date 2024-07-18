package klausur.baumvisitor;

public interface Visitor<T> {
    public void visit(Knoten<T> current);
}
