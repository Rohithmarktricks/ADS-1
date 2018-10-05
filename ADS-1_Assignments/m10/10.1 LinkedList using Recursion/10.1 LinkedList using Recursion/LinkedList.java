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
     * @param      head1     The head
     * @param      pos      The position
     * @param      element  The element
     *
     * @return     { Node }
     */
    Node insertHelper(final Node head1, final int pos, final int element) {
        if (pos == 0) {
            return new Node(element, head1);
        }
        head1.next = insertHelper(head1.next, pos - 1, element);
        return head1;
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
    Node reverseHelper(final Node head1) {
        if (head1 == null || head1.next == null) {
            return head1;
        }
        Node nhead1 = reverseHelper(head1.next);
        head1.next.next = head1;
        head1.next = null;
        return nhead1;
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
