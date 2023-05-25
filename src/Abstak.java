abstract class Makhluk {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Kadal extends Makhluk {
    public void animalSound() {
        System.out.println("Pig berkata : wee wee");
    }
}

class Abstak {
    public static void main(String[] args) {
        Kadal myPig = new Kadal();

        myPig.animalSound();
        myPig.sleep();
    }
}
