package lesson_7;

public class Cat extends Animal {

    final static int NAX_RUN_DISTANCE = 200;
    final static int DEFAULT_PORTION_SIZE = 20;
    public int portionSize;
    public static int catQty;
    public boolean isWellfed;

    public Cat(String name) {
        this(name, DEFAULT_PORTION_SIZE);
    }

    public Cat(String name, int portionSize) {
        super(name);
        this.portionSize = portionSize;
        isWellfed = false;
        catQty += 1;
    }

    public static void printQuantity() {
        System.out.println("Котов: " + catQty);
    }
    public void run(int distance) {
        System.out.println(name + " пробежал " + (distance > NAX_RUN_DISTANCE ? NAX_RUN_DISTANCE : distance) + "м");
    }
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }
    public void eat(Bowl bowl) {
        if (!isWellfed && bowl.foodAmount>portionSize) {
            isWellfed = true;
            System.out.println(name + " съел " + portionSize);
            bowl.decFood(portionSize);
        } else {
            System.out.println(name + " не поел. Ему нужно " + portionSize + " а в миске " + bowl.foodAmount);
        }

    }

    public void printWellfed() {
        System.out.println(name + (isWellfed ? " сыт" : " голоден"));;
    }
}
