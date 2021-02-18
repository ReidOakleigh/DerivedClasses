package garmentsChinhamhora;

/**
 * Clothing items
 * @author Rumbi Chinhamhora
 * @version 1.0
 */
public class Clothing {
    // data members
    private String size;
    private String color;

    /**
     * Creates an empty Clothing object
     */
    public Clothing() {}

    /**
     * Creates a Clothing object
     * @param size : String
     * @param color : String
     */
    public Clothing( String size, String color ) {
        this.size = size;
        this.color = color;
    }

    /**
     * Returns Clothing size
     * @return size : String
     */
    public String getSize() {
        return size;
    }

    /**
     * Set Clothing size
     * @param size : String
     */
    public void setSize( String size ) {
        this.size = size;
    }

    /**
     * Return the Clothing color
     * @return color : String
     */
    public String getColor() {
        return color;
    }

    /**
     * Set Clothing color
     * @param color : String
     */
    public void setColor( String color ) {
        this.color = color;
    }

    /**
     * Returns Clothing washing instructions
     * @return : String
     */
    public String wash() {
        return "Wash in cold water";
    }

    /**
     * Returns Clothing packing instructions
     * @return : String
     */
    public String pack() {
        return "Pack in a dry place";
    }

    /**
     * Return a string of this object's values
     * @return : String
     */
    @Override
    public String toString() {
        return "clothing[" + "size=" + size + ", color=" + color + ']';
    }
}
