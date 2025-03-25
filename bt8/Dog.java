package bt8;

class Dog extends Animals {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        if (breed.isEmpty()) {
            throw new IllegalArgumentException("Giống chó không hợp lệ");
        }
        this.breed = breed;
    }

    // Ghi đè phương thức displayInfo
    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Giống: " + breed;
    }

    // Ghi đè phương thức makeSound
    @Override
    public String makeSound() {
        return "Woof Woof";
    }
}