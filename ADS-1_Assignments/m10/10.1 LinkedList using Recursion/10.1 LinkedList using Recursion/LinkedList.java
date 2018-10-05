/**
 * List of linkeds.
 */
public class LinkedList {
    /**
     * Constructs the object.
     */
    LinkedList() {
        //unused Constructor.
    }
    /**
     * Class for node.
     */
    private class Node {
        private int data;
        private Node next;
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node head;
    /**
     * Insert the value at a position.
     *
     * @param      position  The position
     * @param      data      The data
     *
     * @return     { boolean }
     */
    public boolean insertAt(int position, int data) {
        boolean flag = false;
        try {
            head = insertHelper(head, position , data);
        } catch (Exception e) {
            System.out.println("Can't insert at this position.");
            flag = true;
        }
        return flag;
    }
    /**
     * Insert helper function.
     *
     * @param      head     The head
     * @param      pos      The position
     * @param      element  The element
     *
     * @return     { Node }
     */
    Node insertHelper(Node head, int pos, int element) {
        if (pos == 0) return new Node(element, head);
        head.next = insertHelper(head.next, pos - 1, element);
        return head;
    }

    /**
     * Reverse of a LinkedList.
     */
    public void reverse() {
        head = reverseHelper(head);
    }
    /**
     * Reverse LinkedList Helper.
     *
     * @param      head  The head
     *
     * @return     { Node. }
     */
    Node reverseHelper(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node nhead = reverseHelper(head.next);
        head.next.next = head;
        head.next = null;
        return nhead;
    }
    /**
     * Prints the final LinkedList elements.
     *
     * @return     { String }
     */
    public String print() {
        Node thead = head;
        String s  = "";
        while (thead != null) {
            s += thead.data + ", ";
            thead = thead.next;
        }

        return s.substring(0 , s.length() - 2);
    }
}
