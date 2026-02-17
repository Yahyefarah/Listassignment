public class TestLists {


    public static void main(String[] args) {

        // here are my choice songs
        Song s1 = new Song("God's Plan", "Drake", 3.18);
        Song s2 = new Song("Freestyle", "Lil Baby", 2.42);
        Song s3 = new Song("One Dance", "Drake", 2.54);


       // Test AList with  three songs
        System.out.println("Testing My AList:");
        AList aList = new AList();
    // added the songs to the list using  addy method
        aList.addy(s1);
        aList.addy(s2);
        aList.addy(s3);

        System.out.println(aList);

        aList.removy(1);
        System.out.println("After i removed position 1:");
        System.out.println(aList);

        // testing the DLList
        System.out.println("\nTesting DLList:");
        DLList dList = new DLList();

        dList.addy(s1);
        dList.addy(s2);
        dList.addy(s3);

        System.out.println(dList);

        dList.removy(0);
        System.out.println("After i removed position 0:");
        System.out.println(dList);


        System.out.println("\nTesting SLList:");
        SLlist sl = new SLlist();

        sl.addy(s1);
        sl.addy(s2);
        sl.addy(s3);

        System.out.println(sl);

        sl.removy(2);
        System.out.println("After i removed position 2:");
        System.out.println(sl);


    }


    }
