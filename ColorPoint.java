import java.awt.Color;

/**
 * An extension of the Point class that adds a color field and related
 * functionality, demonstrating inheritance.
 *
 * @author Jim Teresco
 * Siena College, Computer Science 225, Spring 2017
 * @version Spring 2020
 *
 */

// Note the extends keyword to indicate inheritance
public class ColorPoint extends Point {
    
    /** Additional field: the point's Color */
    protected Color color;
    
    /**
     * construct a ColorPoint at the origin
     * 
     * @param c the Color to associate with this point
     */
    public ColorPoint(Color c) {
        
        // call our superclass constructor
        super();        
        color = c;
    }

    /**
     * construct a ColorPoint at the given coordinates
     * 
     * @param x the x-coordinate of the point
     * @param y the y-coordinate of the pont
     * @param c the Color to associate with this point
     */
    public ColorPoint(double x, double y, Color c) {
        
        // call our superclass constructor
        super(x, y);        
        color = c;
    }
    
    /**
     * override toString method of Point
     * 
     * @return string representation of our ColorPoint
     */
    @Override
    public String toString() {
        
        return "(" + x + "," + y + ") " + color;
    }
    
    public static void main(String[] args) {
        
        ColorPoint a = new ColorPoint(Color.red);
        Point b = new Point(3, 4);
        ColorPoint c = new ColorPoint(9, 12, Color.blue);
        Point d = new Point(b);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        
        System.out.println("Distance from b to c: " + b.distance(c));
        System.out.println("Distance from d to origin: " + d.distance());
        System.out.println("Distance from c to (1, 1): " + c.distance(1,1));
    
    }
}
