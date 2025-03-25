package bt3;

class TestCar {
    public static void main(String[] args) {
        // Tạo đối tượng Car
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Hiển thị thông tin ban đầu
        System.out.println("Thương hiệu: " + myCar.getMake());
        System.out.println("Mẫu xe: " + myCar.getModel());
        System.out.println("Năm sản xuất: " + myCar.getYear());

        // Thử thay đổi năm sản xuất hợp lệ
        myCar.setYear(2023);
        System.out.println("Năm sản xuất mới: " + myCar.getYear());

        // Thử thay đổi năm sản xuất không hợp lệ
        myCar.setYear(2030); // Hiện tại không hợp lệ
    }
}