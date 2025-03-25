package bt4;

class TestBook {
    public static void main(String[] args) {
        // Tạo đối tượng Book
        Book myBook = new Book("Lập trình Java", "Nguyễn Văn A", 150000);

        // Hiển thị thông tin ban đầu
        System.out.println("Tên sách: " + myBook.getTitle());
        System.out.println("Tác giả: " + myBook.getAuthor());
        System.out.println("Giá: " + myBook.getPrice());

        // Thử thay đổi giá hợp lệ
        myBook.setPrice(200000);
        System.out.println("Giá mới: " + myBook.getPrice());

        // Thử thay đổi giá không hợp lệ
        myBook.setPrice(-50000); // Không hợp lệ
    }
}