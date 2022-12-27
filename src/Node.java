 public class Node<T> {
    T data; // 해당 노드의 데이터
    Node next = null; // 다음 데이터 주소

    Node(T data) {
        this.data = data; //노드 생성자
    }

    void append (T data){
        Node end = new Node(data);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    void delete (T data){
        Node temp = this;
        while (temp.next != null){
            if (temp.next.data == data){
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
    }
    void retrieve() {
        Node n = this;
        while (n.next != null){
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {

    }
}
