package Conditionals;

public class quadrants {
    public static void main(String[] args) {
        int x=0, y=0;

        if (x>0 && y>0) System.out.println("1st Quadrant");
        else if (x>0 && y<0) System.out.println("4th Quadrant");
        else if (x<0 && y<0) System.out.println("3rd Quadrant");
        else if (x==0 && y!=0) System.out.println("Y-axis");
        else if (y==0 && x!=0) System.out.println("X-axis");
        else System.out.println("Origin");

    }
}
