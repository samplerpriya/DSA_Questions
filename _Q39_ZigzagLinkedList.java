//public class _Q39_ZigzagLinkedList
//{
//    public static class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//
//
//    public void zigzag() {
//        // find mid
//        Node slow = head;
//        Node fast = head.next;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        Node mid = slow;
//        mid.next = null;
//        Node prev = null;
//        Node next;
//
//        while (curr != null) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        Node left = head;
//        Node right = prev;
//        Node nextL, nextR;
//
//
//        // reverse 2nd half
//
//        // alt merge - zig zag merge
//        while (left != null && right != null) {
//            nextL = left.next;
//            left.next = right;
//            nextR = right.next;
//            right.next = null;
//
//            left = nextL;
//            right = nextR;
//        }
//    }
//    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.addLast(5);
//
//        ll.print();
//        ll.zigzag();
//        ll.print();
//    }
//}
