public class DLList {

     DLNode head;
    int size;

    // Constructor
    public DLList() {
        head = null;
        size = 0;
    }

    // Add song to end
    public void addy(Song s) {

        DLNode newNode = new DLNode(s);

        // If empty list
        if (head == null) {
            head = newNode;
        } else {

            DLNode current = head;

            // Move to last node
            while (current.next != null) {
                current = current.next;
            }

            // Link last node to new node
            current.next = newNode;
            newNode.prev = current;
        }

        size++;
    }

    // Remove at position
    public void removy(int pos) {

        if (pos < 0 || pos >= size || head == null) {
            System.out.println("Invalid position cs list is empty");
            return;
        }

        // Remove head
        if (pos == 0) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            size--;
            return;
        }

        DLNode current = head;

        // Move to position
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }

        // Remove middle or last
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }

        size--;
    }

    public String toString() {

        if (size == 0) {
            return "Empty List";
        }
        String mySongList = "";
        DLNode current = head;

        while (current != null) {
            mySongList +=  current.data.toString() + "\n";
            current = current.next;
        }

        return mySongList;
    }



    public static void main(String[] args) {

        DLList list = new DLList();

        list.addy(new Song("God's Plan", "Drake", 3.18));
        list.addy(new Song("Freestyle", "Lil Baby", 2.42));
        //Song s3 = new Song("One Dance", "Drake", 2.54);
        //Song s4 = new Song("Woah", "Lil Baby", 3.03);

        System.out.println("After adding songs ");
        System.out.println(list);

        // Remove first song
        list.removy(0);
       // list.removy(1);

        System.out.println("After removing position 0");
        System.out.println(list);
    }

}

