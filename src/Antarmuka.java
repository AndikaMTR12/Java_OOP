interface Hewan {
    public void animalSound();
}

interface FirstInterface {
    public void firstMethod();
}

interface SecondInterface {
    public void secondMethod();
}

class Kuda implements Hewan, FirstInterface, SecondInterface {

    @Override
    public void animalSound() {
        // TODO Auto-generated method stub
        System.out.println("1");
    }

    @Override
    public void firstMethod() {
        // TODO Auto-generated method stub

        System.out.println("2");
    }

    @Override
    public void secondMethod() {
        // TODO Auto-generated method stub
        System.out.println("3");

    }
    // public void animalSound() {
    // System.out.println("Pig berkata : wee wee");
    // }

    // public void firstMethod() {
    // System.out.println("Method 1 kakakakakakaaka");
    // }

    // public void secondMethod() {
    // System.out.println("Method 2 aeaeaeaeaeaeae");
    // }

}

class Antarmuka {
    public static void main(String[] args) {
        Kuda obj = new Kuda();
        obj.animalSound();
        obj.firstMethod();
        obj.secondMethod();
    }
}
