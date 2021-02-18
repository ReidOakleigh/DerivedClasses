package garmentsChinhamhora;

/**
 * @author Bill
 * Date: 1/31/21
 * Time: 10:06 PM
 */
public class Shirt extends Clothing {
    private String sleeves;

    public Shirt( String size, String color, String sleeves ) {
        super(size, color);
        setSize(size);
        setSleeves(sleeves);
    }

    public String getSleeves() {
        return sleeves;
    }

    @Override
    public void setSize(String size) {
        if (size.equals("S") || size.equals("M") || size.equals("L")) {
            super.setSize(size);
        }
    }
    public void setSleeves( String sleeves ) {
        if (sleeves.equals("short") || sleeves.equals("long") || sleeves.equals("none"))
            this.sleeves = sleeves;
        else this.sleeves = "";
    }

    @Override
    public String wash() {
        return "Dry clean only";
    }

    public String hang() {
        return "Hanger only";
    }

    @Override
    public String toString() {
        return "Shirt{" +  super.toString() + ", sleeves=" + sleeves +
            ", " + wash() + ", " + hang() + "}";
    }
}
