package sharpie;

public class Sharpie {
//    Create Sharpie class
//    We should know about each sharpie their color (which should be a string), width (which will be a floating point number),
//    inkAmount (another floating point number)
//    When creating one, we need to specify the color and the width
//    Every sharpie is created with a default 100 as inkAmount
//    We can use() the sharpie objects
//    which decreases inkAmount

    private String color;
    private float width;
    private static float inkAmount = 100.0f;

    public Sharpie(String color, float width){
        this.color = color;
        this.width = width;
    }

    public static void use(float amount){
        inkAmount-= amount;
    }
}