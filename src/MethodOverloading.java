public class MethodOverloading {
    public static void main(String[] args) {

        surprise();
        surprise("Mamat");
        surprise("Mamat","Suramat");
    }

    //contoh penerapan method overloading
    //nama method boleh sama, akan tetapi parameter wajib berbeda jumlah dan tipenya
    static void surprise(){
        System.out.println("Surprise ");
    }

    static void surprise(String namaLengkap){
        System.out.println("Surprise " +namaLengkap);
    }

    static void surprise(String namaAwal, String namaAkhir){
        System.out.println("Surprise "+namaAwal+ " " +namaAkhir);
    }
}
