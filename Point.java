public class Point {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distance() {
        double d = Math.sqrt ((x * x) + (y * y));
        return d;
    }

    public double distance(int x2, int y2){
        double d = Math.sqrt ((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
        return d;
    }

    public double distance(Point another){
        //double d = Math.sqrt();
        double d = 5.0;
        return  d;
    }
}
