public class TypeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte;
        iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        //konversi tipe data primitif ke bukan primitif
        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        Integer iniObject = 100;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

    }
}
