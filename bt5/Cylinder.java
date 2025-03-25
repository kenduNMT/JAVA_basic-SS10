package bt5;

class Cylinder extends Circle {
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    // Getter và Setter cho height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Chiều cao không hợp lệ!");
        }
    }

    // Phương thức tính thể tích hình trụ
    public double getVolume() {
        return getArea() * height;
    }
}