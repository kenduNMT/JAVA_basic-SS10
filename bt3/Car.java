package bt3;

public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        setYear(year); // Sử dụng setter để kiểm tra tính hợp lệ
    }

    // Getter và Setter cho make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter và Setter cho model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter và Setter cho year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        if (year > 1885 && year <= currentYear) { // 1886 là năm ô tô đầu tiên được phát minh
            this.year = year;
        } else {
            System.out.println("Năm sản xuất không hợp lệ!");
        }
    }
}