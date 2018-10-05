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
        /**
         * data.
         */
        private int data;
        /**
         * Node next.
         */
        private Node next;
        /**
         * Constructs the object.
         *
         * @param      data1  The data
         * @param      next1  The next
         */
        Node(final int data1, final Node next1) {
            this.data = data1;
            this.next = next1;
        }
    }
    /**
     * Node head.
     */
    private Node head;
    /**
     * Insert the value at a position.
     *
     * @param      position  The position
     * @param      data      The data
     *
     * @return     { boolean }
     */
    public boolean insertAt(final int position, final int data) {
        boolean flag = false;
        try {
            head = insertHelper(head, position, data);
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
    Node insertHelper(final Node head, final int pos, final int element) {
        if (pos == 0) {
            return new Node(element, head);
        }
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
    Node reverseHelper(final Node head) {
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

        return s.substring(0, s.length() - 2);
    }
}
