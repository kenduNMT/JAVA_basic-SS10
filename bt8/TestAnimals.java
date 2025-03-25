package bt8;

class TestAnimals {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3];
        animals[0] = new Dog("Buddy", 3, "Golden Retriever");
        animals[1] = new Cat("Kitty", 2, "White");
        animals[2] = new Dog("Max", 5, "Bulldog");

        for (Animals animal : animals) {
            System.out.println(animal.displayInfo());
            System.out.println("Âm thanh: " + animal.makeSound());
        }
    }
}
