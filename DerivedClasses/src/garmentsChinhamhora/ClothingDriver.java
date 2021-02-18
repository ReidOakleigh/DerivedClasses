package garmentsChinhamhora;

import java.util.ArrayList;
import java.util.List;

/**************************************************************
 * Name        : Derived classes from Clothing class
 * Author      : Rumbi Chinhamhora
 * Created     : 1/31/2021
 * Course      : CIS 152 Data Structures
 * Language    : Java
 * Version     : 1.0
 * OS          : Windows 10
 * Copyright   : This is my own original work based on
 *               specifications issued by our instructor
 * Description : This program overall description here
 *               Input:  list and describe
 *               Output: list and describe
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or
 * unmodified. I have not given other fellow student(s) access to
 * my program.
 ***************************************************************/
public class ClothingDriver {
// Declare a list of Clothing objects
    List<Clothing> clothing;

    /**
     * Main method entry point
     * @param args : String[]
     * @return void
     */
    public static void main( String[] args ) {
        new ClothingDriver().go();
    }

    /**
     * Mainline logic
     * @return void
     */
    private void go() {
        clothing = new ArrayList<>();
        setClothing();
        pants();
        shirt();
        System.out.println();
        clothing.forEach(System.out::println);  // print all objects
    }

    private void print( int i ) {
        System.out.printf("Clothing %d:%s\n", (i+1), clothing.get(i));
    }

    private void setClothing() {
        Clothing clothing0 = new Clothing();
        clothing.add(clothing0); print(0);
        Clothing clothing1 = new Clothing("medium", "blue");
        clothing.add(clothing1); print(1);
        clothing0.setSize("L");
        clothing0.setColor("Black");
        clothing.set(0, clothing0); print(0); // change 1st clothing
    }
    private void pants() {
        Pants pants2 = new Pants("40", "Navy", 32, true);
        clothing.add(pants2); print(2);
        pants2.setSize("38");
        pants2.setColor("Royal");
        pants2.setLength(31);
        pants2.setHemmed(false);
        clothing.set(2, pants2); print(2);  // change pants
    }

    private void shirt() {
        Shirt shirt3 = new Shirt("L", "White", "long");
        clothing.add(shirt3); print(3);
        shirt3.setSize("M");
        shirt3.setColor("Pink");
        shirt3.setSleeves("short");
        clothing.set(3, shirt3); print(3);  // change shirt
    }


}
