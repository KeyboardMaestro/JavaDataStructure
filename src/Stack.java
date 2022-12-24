import java.util.EmptyStackException;
public class Stack<T> {
    class Node<T> {
        private T data;
        private Node<T> next;
        public Node(T data){
            this.data = data;
        } // Constructor of a Node
    }
    private Node<T> top;
    public T pop(){
        if (top == null){
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }
}
class Test {
    public static void main(String[] args) {

    }
}