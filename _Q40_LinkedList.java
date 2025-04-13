public class _Q40_LinkedList
{
    public static class Node {

        // initializing the head and tail , we can put it as private or not also

        private Node head;
        private Node tail;

        // take size as well
        private int size;
        // we can create constructor also
        public Node(){
            this.size = 0;
        }

        // Insert the element in first
        public void insertFirst(int val){
            Node node = new Node (val);
            node.next = head;
            head = node;

            if(tail == null){
                tail = head;
            }

            size += 1;
        }

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
            this.next = next;
        }
    }


    public static void main(String[] args) {

    }
}
