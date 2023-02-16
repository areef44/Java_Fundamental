public class MethodParameter {
    public static void main(String[] args) {
        //karena method dibawah ada 2 parameter,wajib memanggil 2 parameter juga yaitu Hallo dan Alkademi
        hallo("Hallo", "Alkademi");
        hallo("Muhammad", "Arif");
        hallo("John","Doe");
    }

    static void hallo(String namaAwal, String namaAkhir){
        System.out.println(namaAwal+ " " +namaAkhir);
    }
}
