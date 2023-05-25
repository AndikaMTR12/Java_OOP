class Method {
    static void hello() {
        System.out.println("Hello World");
    }

    public void myPublic() {
        System.out.println("Public");
    }

    public void myRead(String reads) {
        System.out.println("Text : " + reads);
    }

    public static void main(String[] args) {
        hello();
        Method myPublic = new Method(); // membuat object method
        myPublic.myPublic(); // memanggil method myPublic dalam sebuah object
        myPublic.myRead("Saya adalah Andika");
    }
}
