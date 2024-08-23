package color;

public class Color {

    private String name;
    private int red;
    private int green;
    private int blue;

    // Constructor
    public Color(String name, int red, int green, int blue) {
        this.name = name;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Static objects for primary colors
    public static final Color RED = new Color("Red", 255, 0, 0);
    public static final Color BLUE = new Color("Blue", 0, 0, 255);
    public static final Color YELLOW = new Color("Yellow", 255, 255, 0);

    // Static objects for secondary colors
    public static final Color GREEN = new Color("Green", 0, 255, 0);
    public static final Color ORANGE = new Color("Orange", 255, 165, 0);
    public static final Color PURPLE = new Color("Purple", 128, 0, 128);

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    // toString method to display the color
    @Override
    public String toString() {
        return name + " (R: " + red + ", G: " + green + ", B: " + blue + ")";
    }
}
