public class SLNode {

    // This stores the Song object
    Song data;
    // This points to the next node in the list
    SLNode next;

    // Constructor to create a node, and  give it a Song
    public SLNode(Song s) {

        // Store the song inside this node
        data = s;
        // At first, it does not point to anything
        next = null;
    }
}
