public class SLlist {

     SLNode head;  // start of list

    // Constructor creates empty list
    public SLlist() {
        head = null;
    }

    // Add song to end
    public void addy(Song s) {

        SLNode newNode = new SLNode(s);

        // If list empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise move to end
        SLNode current = head;

        while (current.next != null) {
            current = current.next;
        }
         //here i connect last node
        current.next = newNode;
    }

    // Remove at position
    public void removy(int pos) {

        if (head == null) {

            System.out.println(" cannot remove cs the list is empty");
            return;
        }

        // Remove first element
        if (pos == 0) {
            head = head.next;
            return;
        }

        SLNode current = head;

        // Move to node BEFORE position
        for (int i = 0; i < pos - 1 && current.next != null; i++) {
            current = current.next;
        }

        // Skip the node
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public String toString() {

        if (head == null) return "Empty List";

        String songlist = "";
        SLNode current = head;

        while (current != null) {
            songlist += current.data.toString() + "\n";
            current = current.next;
        }

        return songlist;
    }

    public static void main(String[] args) {

        // Create a new singly linked list
        SLlist myList = new SLlist();

        // Add some songs to the list
        myList.addy(new Song("Song A", "Artist 01", 2.5));
        myList.addy(new Song("Song B", "Artist 002", 3.0));
        myList.addy(new Song("Song C", "Artist 03", 4.0));
        myList.addy(new Song("Song y", "Artist 40", 3.5));
        myList.addy(new Song("Song x", "Artist 50", 2.8));

        System.out.println("Before any deletion:");
        System.out.println(myList);

        // Remove song at the head (position 0)
        System.out.println("Removing node at position 0:");
        myList.removy(0);
        System.out.println(myList);

        // Remove song in the middle (position 1)
        System.out.println("Removing node at position 1:");
        myList.removy(1);
        System.out.println(myList);

        // Try an invalid position (out of bounds)
      //  System.out.println("Removing node at position 10:");
       // myList.removy(10);
      // System.out.println(myList);
    }

}
