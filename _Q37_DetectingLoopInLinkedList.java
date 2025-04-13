

public class _Q37_DetectingLoopInLinkedList {
    public class LinkedList {

        // creating a node
        public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }

        }

        public static Node head;
        public static Node tail;

        // detecting loop in cycle

        public static boolean isCycle() {
            // define slow pointer
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        // REMOVING LOOP/CYCLE IN LINKED LIST
        public static void removeCycle() {
            //detect cycle
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while(fast != null && fast.next !=null){
                slow = slow.next;
                fast = fast.next.next;
                if(fast == slow){
                    cycle = true;
                    break;
                }
            }
            if(cycle == false){
                return;
            }

            //find meeting point
            slow = head;
            Node prev = null;
            while(slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
        }

        public static void main(String[] args) {
            head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = head;
            // 1->2->3->1
            System.out.println(isCycle());
        }
    }
}


