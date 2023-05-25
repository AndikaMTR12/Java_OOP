class Attribute {
    int tinggi, beratBadan = 60;
    final int x = 10;

    public static void main(String[] args) {
        Attribute attr = new Attribute();
        Attribute attr2 = new Attribute();
        attr.tinggi = 170;
        attr2.beratBadan = 58; // Menimpah nilai sebelumnya
        // attr.x = 12; // Tidak dapat mengubah isinya
        System.out.println(attr.tinggi);
        System.out.println(attr.beratBadan);
        System.out.println(attr2.beratBadan);
        // System.out.println(attr.x);
    }
}
