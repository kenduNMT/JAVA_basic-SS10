package bt8;

class Cat extends Animals {
    private String furColor;

    // Constructor
    public Cat(String name, int age, String furColor) {
        super(name, age);
        if (furColor.isEmpty()) {
            throw new IllegalArgumentException("Màu lông không hợp lệ");
        }
        this.furColor = furColor;
    }

    // Ghi đè phương thức displayInfo
    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Màu lông: " + furColor;
    }

    // Ghi đè phương thức makeSound
    @Override
    public String makeSound() {
        return "Meow Meow";
    }
}