package bt2;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Dog
        Dog dog = new Dog();
        dog.setName("Buddy");

        // Gọi phương thức từ lớp cha
        dog.eat();

        // Gọi phương thức từ lớp con
        dog.bark();
    }
}