package garmentsChinhamhora;

/**
 * @author Bill
 * Date: 1/31/21
 * Time: 9:58 PM
 */
public class Pants extends Clothing {
    private int length;
    private boolean hemmed;

    public Pants( String size, String color, int length, boolean hemmed ) {
        super(size, color);
        this.length = length;
        this.hemmed = hemmed;
    }

    public int getLength() {
        return length;
    }

    public void setLength( int length ) {
        this.length = length;
    }

    public boolean isHemmed() {
        return hemmed;
    }

    public void setHemmed( boolean hemmed ) {
        this.hemmed = hemmed;
    }

    @Override
    public String wash() {
        return "Dry clean only";
    }

    public String hang() { return "Hang on a hanger"; }

    @Override
    public String toString() {
        return "Pants{" + super.toString() + ", length=" + length + ", hemmed=" + hemmed +
            ", " + wash() + ", " + hang() + "}" ;
    }
}
