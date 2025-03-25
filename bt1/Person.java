package bt1;

// 1. Tính đóng gói là gì? Tại sao tính đóng gói quan trọng trong lập trình đối tượng?
//Tính đóng gói là một trong bốn nguyên lý cơ bản của lập trình hướng đối tượng (OOP). Đây là cơ chế ẩn giấu thông tin (data hiding), tức là chỉ cho phép truy cập và thay đổi dữ liệu thông qua các phương thức cụ thể được định nghĩa trong lớp, thay vì trực tiếp tương tác với dữ liệu.
//
//Tầm quan trọng:
//
//Giúp bảo vệ dữ liệu tránh bị thay đổi hoặc truy cập trái phép.
//
//Dễ dàng bảo trì và phát triển mã nguồn.
//
//Tăng tính modular (module hóa), vì các thành phần trong chương trình hoạt động độc lập hơn.
//
// 2. Làm thế nào để áp dụng tính đóng gói trong Java?
//Để áp dụng:
//
//Khai báo các thuộc tính của lớp ở mức truy cập private.
//
//Cung cấp các phương thức getter và setter với mức truy cập public để truy xuất hoặc thay đổi giá trị của các thuộc tính.
//
//Getter: Dùng để lấy giá trị của thuộc tính.
//
//Setter: Dùng để thay đổi giá trị của thuộc tính, đồng thời có thể thêm logic kiểm tra giá trị đầu vào trước khi thay đổi.
//
// 3. Ví dụ mã Java minh họa tính đóng gói

public class Person {
    // Thuộc tính được khai báo là private
    private String name;
    private int age;

    // Phương thức getter cho name
    public String getName() {
        return name;
    }

    // Phương thức setter cho name
    public void setName(String name) {
        this.name = name;
    }

    // Phương thức getter cho age
    public int getAge() {
        return age;
    }

    // Phương thức setter cho age
    public void setAge(int age) {
        if (age > 0) { // Kiểm tra giá trị hợp lệ
            this.age = age;
        } else {
            System.out.println("Tuổi không hợp lệ!");
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng Person
        Person person = new Person();

        // Sử dụng setter để đặt giá trị
        person.setName("Thuan");
        person.setAge(25);

        // Sử dụng getter để lấy giá trị
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

//4. Lợi ích của việc sử dụng tính đóng gói
//Bảo vệ dữ liệu: Chỉ các phương thức được chỉ định (getter, setter) mới có quyền truy cập hoặc sửa đổi dữ liệu.
//
//Kiểm soát quyền truy cập: Bạn có thể thêm logic kiểm tra đầu vào hoặc chỉ cho phép dữ liệu được thay đổi nếu thỏa mãn điều kiện nhất định.
//
//Giảm rủi ro lỗi: Giữ cho dữ liệu của lớp luôn ở trạng thái hợp lệ.
//
//Dễ bảo trì và mở rộng mã nguồn: Khi cần thay đổi logic, bạn chỉ cần thay đổi trong lớp đó mà không ảnh hưởng đến các thành phần khác.