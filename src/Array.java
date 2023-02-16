public class Array {
    public static void main(String[] args) {
        //Cara Panjang:
        //Buat array dengan tipe data string
        String[] stringArray;

        //Inisialiasi Data dan Panjang Array
        stringArray = new String[3];

        stringArray[0] = "Muhammad";
        stringArray[1] = "Arif";
        stringArray[2] = "Arif";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);


        //Cara Singkat:
        String[] namaNama = {"Muhammad", "Arif", "Arif"};
        namaNama[1] = null;

        int[] arrayInt = new int[]{
                100,90,80,67,29
        };

        long[] arrayLong = {
                10L,20L,30L,40
        };

        //Menghapus Data Array = mengubah data ke index menjadi 0
        arrayLong[1] = 0;

        System.out.println(arrayLong.length);


        //Array dalam array
        String[][] members = {
                {"Muhammad", "Arif"},
                {"Budi", "Rahardjo"},
                {"Jokowi"}
        };

        //Cara Mengakses Array Dalam Array
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);


    }
}
