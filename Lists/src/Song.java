public class Song {

    String title = "";
    String artist  = "";
    double length = 0.0;

    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }
    public String toString() {
        return "( songName: " + title + ", artist: " + artist + ", length: " + length + " )";
    }

   // main method for testing
    public static void main(String[] args) {

        // Create song objects
        Song s1 = new Song(" How ", " Lil Baby", 3.02);

        Song s2 = new Song(" Race My Mind", " Drake", 4.30);

        System.out.println(s1);

        System.out.println(s2);


    }
}
