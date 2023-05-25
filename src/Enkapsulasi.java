class Enkapsulasi {
    public static void main(String[] args) {
        Person obj = new Person();
        // obj.nama = "andika"; // error enkapsulasi private
        // System.out.println(obj.nama); // error enkapsulasi private
        obj.setNama("andika"); // setter
        System.out.println(obj.getNama()); // getter
    }
}

class Person {
    private String nama;

    // getter
    public String getNama() {
        return nama;
    }

    // setter
    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }
}
