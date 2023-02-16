public class SwitchLambda {
    public static void main(String[] args) {

        var nilai = "E";


        switch (nilai) {
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }
    }
}
