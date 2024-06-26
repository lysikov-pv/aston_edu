package lesson_7;

public class Dog extends Animal {
    final static int NAX_RUN_DISTANCE = 500;
    final static int NAX_SWIM_DISTANCE = 10;
    public static int dogQty;

    public Dog(String name) {
        super(name);
        dogQty += 1;
    }
    public static void printQuantity() {
        System.out.println("Собак: " + dogQty);
    }
    public void run(int distance) {
        System.out.println(name + " пробежал " + (distance > NAX_RUN_DISTANCE ? NAX_RUN_DISTANCE : distance) + "м");
    }
    public void swim(int distance) {
        System.out.println(name + " проплыл " + (distance > NAX_SWIM_DISTANCE ? NAX_SWIM_DISTANCE : distance) + "м");
    }
}
