package bt5;

class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Bán kính không hợp lệ!");
        }
    }

    // Phương thức tính diện tích hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
