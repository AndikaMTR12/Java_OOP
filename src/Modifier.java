abstract class Main {
    public String fname = "Andika Andi";
    public int umur = 23;

    public abstract void study(); // abstract method
}

class Student extends Main {
    public int graduationYear = 2018;

    public void study() {
        System.out.println("ahahah");
    }
}

class Modifier {
    // final
    final static String nama = "Andika";

    // static
    static void myStatic() {
        System.out.println(nama);
    }

    // public
    public void myPublic() {
        System.out.println(nama);
    }

    public static void main(String[] args) {
        Student stu = new Student();
        Modifier mod = new Modifier();
        System.out.println("Nama : " + stu.fname);
        System.out.println("Umur : " + stu.umur);
        System.out.println("Tahun Masuk : " + stu.graduationYear);
        stu.study(); // memanggil abstract method
        myStatic();
        mod.myPublic();
    }
}