package Advance;

public class Throw_keyword {
    public static void main(String[] args) {
        int i = 19;
        int j=0;

        try{
            j = 18/i;
            if(j==0) throw new ArithmeticException("I dont want to print 0");
        } catch (ArithmeticException e) {
            j=18/1;
            System.out.println("Default" + e);
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }
        System.out.println(j);
        System.out.println("Done");
    }
}
