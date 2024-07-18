package klausur.baumvisitor;

public class VisitorSize<T> implements Visitor<T>{
    int count = 0;
    @Override
    public void visit(Knoten current) {
        count++;
    }
}
