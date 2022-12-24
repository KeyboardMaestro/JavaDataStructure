public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        for (int i = head.data+1 ; i < 100; i ++){
            head.append(i);
        }
        head.delete(40);
        head.retrieve();
    }

}
