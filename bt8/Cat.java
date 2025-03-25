package bt8;

class Cat extends Animals {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        if (furColor.isEmpty()) {
            throw new IllegalArgumentException("Màu lông không hợp lệ");
        }
        this.furColor = furColor;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Màu lông: " + furColor;
    }

    @Override
    public String makeSound() {
        return "Meow Meow";
    }
}
