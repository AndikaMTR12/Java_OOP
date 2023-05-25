enum Level {
    LOW,
    MEDIUM,
    HIGH
}

class Enums {

    enum hakAkses {
        ADMIN,
        USER
    }

    public static void main(String[] args) {

        hakAkses myVar = hakAkses.ADMIN;
        Level myVar1 = Level.LOW;
        System.out.println(myVar);

        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2);
        }
        switch (myVar1) {
            case LOW:
                System.out.println("Level Low");
                break;
            case MEDIUM:
                System.out.println("Level Medium");
                break;
            case HIGH:
                System.out.println("Level High");
                break;

            default:
                break;
        }
    }
}
