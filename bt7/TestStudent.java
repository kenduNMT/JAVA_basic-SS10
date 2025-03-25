package bt7;

class TestStudent {
    public static void main(String[] args) {
        // Tạo danh sách sinh viên
        Student[] students = new Student[3];
        students[0] = new Student("Nguyen Van A", "SV001", 3.5);
        students[1] = new GraduateStudent("Le Thi B", "SV002", 3.8, "AI Research", "Dr. Tran Van C");
        students[2] = new Student("Pham Van C", "SV003", 2.9);

        // Hiển thị thông tin của từng sinh viên
        for (Student student : students) {
            System.out.println(student.getDetails());
        }
    }
}