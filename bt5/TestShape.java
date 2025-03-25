package bt5;

class TestShape {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle myCircle = new Circle(5);
        System.out.println("Diện tích hình tròn: " + myCircle.getArea());

        // Tạo đối tượng Cylinder
        Cylinder myCylinder = new Cylinder(5, 10);
        System.out.println("Thể tích hình trụ: " + myCylinder.getVolume());

        // Thử thay đổi giá trị và kiểm tra kết quả
        myCircle.setRadius(7);
        System.out.println("Diện tích hình tròn mới: " + myCircle.getArea());

        myCylinder.setHeight(12);
        System.out.println("Thể tích hình trụ mới: " + myCylinder.getVolume());
    }
}

