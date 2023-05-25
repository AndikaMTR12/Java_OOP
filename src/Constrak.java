class Constrak {
    String nama;
    String desk;
    int umur;

    public Constrak(String text, int nilai) {
        nama = "Andika";
        desk = text;
        umur = nilai;
    }

    public static void main(String[] args) {
        Constrak constrak = new Constrak("Lakik", 23);
        System.out.println(constrak.nama);
        System.out.println(constrak.desk);
        System.out.println(constrak.umur);
    }
}
