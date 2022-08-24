public class Dog extends DomesticAnimal {

    public Dog() {
        color = "black";
        name = "Dog";
    }

    public void printHabitat() {
        super.printHabitat();
        System.out.println("I live on the couch");
    }

    public void printSound() {
        System.out.println("Woof! Woof!");
    }
}
