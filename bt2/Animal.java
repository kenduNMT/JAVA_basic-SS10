package bt2;

//1. Kế thừa là gì? Nó giúp ích gì trong lập trình hướng đối tượng?
//Kế thừa là một cơ chế trong lập trình hướng đối tượng cho phép lớp con (subclass) tái sử dụng lại các thuộc tính và phương thức từ lớp cha (superclass). Từ khóa extends được sử dụng để thiết lập mối quan hệ kế thừa giữa các lớp.
//
//Lợi ích:
//
//Tăng khả năng tái sử dụng mã nguồn: Lớp con kế thừa những đặc điểm chung từ lớp cha.
//
//Dễ dàng mở rộng và bảo trì: Khi cần thay đổi logic, bạn có thể sửa trực tiếp trong lớp cha và tự động áp dụng thay đổi vào lớp con.
//
//Tạo cấu trúc logic rõ ràng hơn trong chương trình.
//
//        2. Sự khác biệt giữa kế thừa và bao đóng (encapsulation)
//Kế thừa (Inheritance):
//
//Tập trung vào tái sử dụng mã nguồn bằng cách cho phép lớp con kế thừa lớp cha.
//
//Liên quan đến việc mở rộng cấu trúc chương trình (mối quan hệ cha - con).
//
//Sử dụng từ khóa extends.
//
//Bao đóng (Encapsulation):
//
//Tập trung vào bảo vệ dữ liệu và kiểm soát truy cập thông qua việc sử dụng các thuộc tính private và phương thức getter/setter.
//
//Liên quan đến việc ẩn chi tiết triển khai bên trong lớp, chỉ cung cấp các phương thức truy xuất.
//
//3. Ví dụ sử dụng từ khóa extends
//Dưới đây là ví dụ minh họa cách tạo một lớp con kế thừa các thuộc tính và phương thức từ lớp cha:


// Lớp cha
public class Animal {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

//Lớp Dog kế thừa thuộc tính name và phương thức eat() từ lớp Animal, đồng thời thêm phương thức riêng bark().
// 4. Lợi ích và hạn chế của kế thừa
//Lợi ích:
//
//Tái sử dụng mã nguồn: Giảm thiểu việc viết lại mã giống nhau.
//
//Tăng tính modular: Dễ dàng mở rộng các lớp hiện có bằng cách tạo lớp con.
//
//Giảm phức tạp: Tăng tính rõ ràng trong việc phân loại các thành phần trong chương trình.
//
//Hạn chế:
//
//Khó bảo trì khi có nhiều cấp độ kế thừa: Sự thay đổi trong lớp cha có thể ảnh hưởng đến tất cả các lớp con, dẫn đến khó kiểm soát.
//
//Giảm tính độc lập: Lớp con phụ thuộc vào lớp cha, có thể làm phức tạp logic chương trình.
//
//Không phù hợp cho mọi trường hợp: Khi không có mối quan hệ "is-a" tự nhiên giữa các lớp, việc sử dụng kế thừa có thể gây lúng túng.