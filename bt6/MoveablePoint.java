package bt6;

class MoveablePoint extends Point {
    private double xSpeed;
    private double ySpeed;

    // Constructor
    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter và Setter cho xSpeed
    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter và Setter cho ySpeed
    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Phương thức di chuyển
    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ") with speed (" + xSpeed + ", " + ySpeed + ")";
    }
}