class Mahasiswa {
    protected String nama = "Andika";

    public void nim() {
        System.out.println("Nim : F1G118011");
    }
}

class Pewarisan extends Mahasiswa {
    private int umur = 23;

    public static void main(String[] args) {
        Pewarisan myPewaris = new Pewarisan();
        System.out.println("Nama : " + myPewaris.nama);
        myPewaris.nim();
        System.out.println("Umur : " + myPewaris.umur);
    }
}
