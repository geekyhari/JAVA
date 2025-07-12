package Advance;

public class Exceptions {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int[] nums = new int[5];

        try{
            j = 9/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero" );
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bounds");
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }
        System.out.println(j);
        System.out.println("done");
    }
}
