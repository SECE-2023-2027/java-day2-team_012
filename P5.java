class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class RemoveNthNode {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int n = 2;

        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy, slow = dummy;

        for (int i = 0; i <= n; i++)
            fast = fast.next;

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        Node temp = dummy.next;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
