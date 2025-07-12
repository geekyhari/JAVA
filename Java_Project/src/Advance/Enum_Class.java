package Advance;
enum Laptops{
    Macbook(2000), Windows(1500), Surface(1800), XPS;

    private int price;

    private Laptops() {
        price = 1000;
    }

    Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Enum_Class {
    public static void main(String[] args) {
        Laptops lap = Laptops.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

        for(Laptops lap1 : Laptops.values()){
            System.out.println(lap1 + " : " + lap1.getPrice());
        }
    }
}
