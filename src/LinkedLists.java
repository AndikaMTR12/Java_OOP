import java.util.LinkedList;

class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.addFirst("Lamborgini");
        cars.add("Ford");
        cars.add("Mazda");
        cars.addLast("Porches");
        cars.removeLast();

        System.out.println(cars);
        System.out.println(cars.getFirst());
    }
}
