public class Animal {
    String color;
    String name;


    public void printSound() {
    }
    public void printHabitat() {
    }
    public static void testAnimal(Animal animal) {
        System.out.println("Name: " + animal.name);
        System.out.println("Color: " + animal.color);
        animal.printHabitat();
        animal.printSound();
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        testAnimal(new Dog());
        testAnimal(new Cow());
        testAnimal(new Wolf());
    }
}
