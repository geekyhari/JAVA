package Advance;

class MyException extends Exception{
    public MyException(String string){
        super(string);
    }
}

public class Custom_Exceptions {
    public static void main(String[] args) {

        int i = 19;
        int j=0;

        try{
            j = 18/i;
            if(j==0) throw new MyException("I dont want to print 0");
        } catch (MyException e) {
            j=18/1;
            System.out.println("Default" + e);
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }
        System.out.println(j);
        System.out.println("Done");
    }
}
