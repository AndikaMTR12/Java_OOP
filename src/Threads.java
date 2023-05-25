class Threads implements Runnable { // Bisa menggunakan extends ke Thread
    public void run() {
        amout++;
        System.out.println("World");
    }

    public static int amout = 0;

    public static void main(String[] args) {
        Threads obj = new Threads();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("Hello");
        // amout++;
        System.out.println(amout);
    }
}
