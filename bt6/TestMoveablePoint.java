package bt6;

class TestMoveablePoint {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        System.out.println("Điểm ban đầu: " + p1);

        MoveablePoint mp1 = new MoveablePoint(2, 3, 1, 1);
        System.out.println("Điểm có thể di chuyển: " + mp1);

        // Thực hiện di chuyển
        mp1.move();
        System.out.println("Sau khi di chuyển: " + mp1);

        // Thay đổi tốc độ và di chuyển tiếp
        mp1.setXSpeed(2);
        mp1.setYSpeed(3);
        mp1.move();
        System.out.println("Sau khi thay đổi tốc độ và di chuyển: " + mp1);
    }
}
