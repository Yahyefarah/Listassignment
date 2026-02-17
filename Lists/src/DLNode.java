public class DLNode {

    Song data;
    DLNode next;
    // pointer backwrd
    DLNode prev;

    public DLNode(Song s) {
            data = s;
            next = null;
            prev = null;
        }

}
