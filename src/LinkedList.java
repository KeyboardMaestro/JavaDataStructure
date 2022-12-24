public class LinkedList {
    Node header;
    static class Node {
        int data;
        Node next = null;
    }
    LinkedList() {
        header = new Node();
    }
    void append (int data){
        Node end = new Node();
        end.data = data;
        Node n = header;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
    void delete (int data){
        Node temp = header;
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
        Node n = header.next;
        while (n.next != null){
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.println(n.data);
    }
    void removeDups() {
        Node n = header;
        while (n != null && n.next != null){
            Node r = n;
            while (r.next != null){
                if (n.data == r.next.data){
                    r.next = r.next.next;
                }else
                    r = r.next;
            }
            n = n.next;
        }
    }
    private static Node KthToLast(Node n, int k, Reference r){
        if (n == null){
            return null;
        }
        Node found = KthToLast(n.next, k,r);
        r.count ++;
        if (r.count == k){
            return n;
        }
        return found;
    }
}
class Reference {
    public int count = 0;
}
class LinkedListNode {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(1);
        ll.append(2);
        ll.append(4);
        ll.append(5);
        ll.removeDups();
        ll.retrieve();
    }
}