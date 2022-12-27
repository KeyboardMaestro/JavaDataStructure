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

    private void push(T item){
        Node<T> t = new Node<T>(item);
        t.next = top;
        top = t;
    }
}
class Test {
    public static void main(String[] args) {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        firstNode.next = secondNode;
        System.out.println(firstNode.next.data); // 실행값 : 2
    }
}