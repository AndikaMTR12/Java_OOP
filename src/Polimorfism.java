class Animal {
    public void animalSound() {
        System.out.println("Buat suara hewan");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Pig berkata : wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Dog berkata : bow bow");
    }

    static class Tubuh {
        public void tinggi() {
            System.out.println(20);
        }
    }

    class Jenis {
        public void nama() {
            System.out.println("Bulldog");
        }
    }
}

class Polimorfism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Dog myDo = new Dog();
        Dog.Jenis myJenis = myDo.new Jenis();
        Dog.Tubuh myBadan = new Dog.Tubuh();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myBadan.tinggi();
        myJenis.nama();
    }
}
