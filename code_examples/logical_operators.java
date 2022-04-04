public class Point {

    private int x;
    private int y;
    public void setX(int newX) { this.x = newX; }
    public int getX() { return x; }
    public void setY(int newY) { this.y = newY; }
    public int getY() { return y; }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public static void main(String[] args) {

        Point point = new Point();
        point.setX(7);
        point.setY(2);

        point.translate(11, 6);
        System.out.println("New coordinates is (" + point.getX() + ", " + point.getY() + ")");

    }
}