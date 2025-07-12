package Advance;
interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("coding");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("coding : faster");
    }
}

class Developer {
    public void DevApp(Computer lap){
        lap.code();
    }
}

public class Need_for_Interfaces {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer shri = new Developer();
        shri.DevApp(desk);
    }
}
