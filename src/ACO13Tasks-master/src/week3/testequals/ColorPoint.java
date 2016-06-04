package week3.testequals;

public class ColorPoint extends Point {
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

     public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorPoint)) return false;
        if (!super.equals(o)) return false;

        ColorPoint cp = (ColorPoint) o;

//        return super.equals(o) && cp.color.equals(color);
        return cp.color.equals(color);
    }
}
