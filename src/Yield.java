public class Yield {
    public static void main(String[] args) {
        var nilai = "B";
        String ucapan = switch (nilai) {
            case "A":
                yield "Wow Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan);
    }
}
