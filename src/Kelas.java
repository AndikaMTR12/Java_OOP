class Kelas {
    String name = "Andika";

    public static void main(String[] args) {
        Kelas kelas = new Kelas();
        Second second = new Second();
        System.out.println(kelas.name);
        System.out.println(second.umur);
    }
}

class Second {
    int umur = 23;
}