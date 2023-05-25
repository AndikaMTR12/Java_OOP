class Inputs {
    static java.util.Scanner obj = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukan Nama : ");
        String nama = obj.nextLine();
        System.out.print("Masukan Umur : ");
        int umur = obj.nextInt();

        System.out.println("Nama Kamu : " + nama);
        System.out.println("Nama Umur : " + umur);
    }

}
