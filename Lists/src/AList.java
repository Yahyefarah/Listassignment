public class AList {

    Song[] songs;
        int size;
        int maxSize = 5;

        //an empty constructor it Should create an empty AList.
        //initial maxSize and setting size to 0
    public AList(){
            songs = new Song[maxSize];
            size = 0;
        }

    public void addy(Song s) {

        // If array is full, we resize it
        if (size == maxSize) {

            maxSize = maxSize * 2;  // double capacity
            Song[] newList = new Song[maxSize];

            // so i have to copy old songs into new bigger array
            for (int i = 0; i < size; i++) {
                newList[i] = songs[i];
            }

            songs = newList;  // replace old array
        }

        // Add new song at the end
        songs[size] = s;

        size++;  // increase number of elements


    }

    // Removes song at position pos
    public void removy(int pos) {

        // Check if position is valid
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
            return;
        }

        // Shift elements left to fill gap
        for (int i = pos; i < size - 1; i++) {
            songs[i] = songs[i + 1];
        }

        size--;  // reduce size
    }

    // This method returns all songs in the list as one String
    public String toString() {

        // If there are no songs stored i return message immediately
        if (size == 0) {
            return "Empty List";
        }

        //  i Created an empty String to build our output
        String mySongs = "";

        // then Loop only through the actually stored songs not all memory spaces
        for (int i = 0; i < size; i++) {

            mySongs += songs[i].toString() + "\n";
        }
        return mySongs;
    }



    public static void main(String[] args) {

        AList list = new AList();

        // songs
        Song s1 = new Song("God's Plan", "Drake", 3.18);
        Song s2 = new Song("One Dance", "Drake", 2.54);
        Song s3 = new Song("The Bigger Picture", "Lil Baby", 4.12);
        Song s4 = new Song("Freestyle", "Lil Baby", 2.42);
        Song s5 = new Song("woah", "Lil Baby", 3.03);

        list.addy(s1);
        list.addy(s2);
        list.addy(s3);

        System.out.println("Before song is remove:");
        System.out.println(list);

        list.removy(1);

        System.out.println("After removal:");
        System.out.println(list);
    }

}
