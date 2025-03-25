package bt8;

class Animals {
    protected String name;
    protected int age;

    // Constructor
    public Animals(String name, int age) {
        if (name.isEmpty() || age < 0) {
            throw new IllegalArgumentException("Thông tin không hợp lệ");
        }
        this.name = name;
        this.age = age;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Tuổi không hợp lệ!");
        }
    }

    // Phương thức hiển thị thông tin động vật
    public String displayInfo() {
        return "Tên: " + name + ", Tuổi: " + age;
    }

    // Phương thức âm thanh động vật
    public String makeSound() {
        return "Some generic sound";
    }
}