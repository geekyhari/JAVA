package ObjectOrientedProgramming;

class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "Phone";
        System.out.println("in static block");
    }
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class statickeyword {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "Samsung";
        obj.price = 1400;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
    }
}
