package bt7;

class Student {
    private String name;
    private String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        if (name.isEmpty() || id.isEmpty() || gpa < 0 || gpa > 4.0) {
            throw new IllegalArgumentException("Thông tin không hợp lệ");
        }
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA không hợp lệ!");
        }
    }

    // Phương thức hiển thị thông tin sinh viên
    public String getDetails() {
        return "Tên: " + name + ", ID: " + id + ", GPA: " + gpa;
    }
}
