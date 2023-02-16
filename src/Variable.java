public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Muhammad Arif";

        System.out.println(name);

        int age = 34;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Mamat Suramat";
        System.out.println(name);

        //deklarasi var,kata kunci variabel yang tidak perlu didefinisikan nama tipe datanya
        var firstName = "Muhammad";
        var middleName = "Arif";
        var lastName = "Arif";

        //variabel final(konstan) || variabel yang tidak bisa diubah2 nilainya
        final String namaLengkap = "Muhammad Arif";
        System.out.println(namaLengkap);
    }
}
