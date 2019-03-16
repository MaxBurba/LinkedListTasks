public class LinkedList{

    private Node head;

    public static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public void add(Node node){

        if(head == null){
            head = node;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public boolean containsLoop(){ //Method for the first task

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast)
                return true;
        }
        return false;
    }

    public Node findMiddle(){ //Method for the second task. Returns middle element

        if(head == null || head.next == null || head.next.next == null) throw new
                IllegalArgumentException("Size must be at least 3");

        Node slow = head;
        Node fast = head;

        while(fast != null){
            fast = fast.next;

            if(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    public void setToStart(Node node){ //Also method for the second task. Sets desired node to the beginning.

        if(head == null || head.next == null || head.next.next == null){
            return;
        }

        Node temp = head;

        while(temp.next != node){
            temp = temp.next;
        }
        temp.next = node.next; //Node before former mid element points to node past former mid element now

        temp = head;
        head = node;
        node.next = temp; //The former mod element is a head after all
    }

    public void outputList() {

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}