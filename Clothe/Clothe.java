/*******************************************************************************
*    Author: coronapl
*    Class: Clothe
*    Description:
*    Introduction to classes, setters and getters.
*******************************************************************************/

public class Clothe {

    private String size, color, material;

    public Clothe(String size, String color, String material) {
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = size;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String characteristics() {
        return ("The color is " + color + ", the size is " + size + " and the material is " + material);
    }

    public String Comment() {
        return ("The " + size + " size fits you perfectly");
    }

    public static void main(String[] args) {
        Clothe jeans = new Clothe("small", "blue", "cotton");
        Clothe shirt = new Clothe("large", "green", "linen");
        Clothe jacket = new Clothe("medium", "brown", "leather");

        String JeansCharacteristics = jeans.characteristics();
        System.out.println("Jeans: " + JeansCharacteristics);

        String ShirtCharacteristics = shirt.characteristics();
        System.out.println("Shirt: " + ShirtCharacteristics);

        jacket.setSize("small");
        String JacketCharacteristics = jacket.characteristics();
        System.out.println("Jacket: " + JacketCharacteristics);

        String ShirtComment = shirt.Comment();
        System.out.println(ShirtComment);
    }
}
