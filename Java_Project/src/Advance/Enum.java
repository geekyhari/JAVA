package Advance;

enum Status{
    Running, Failed, Pending,Success;
}

public class Enum {
    public static void main(String[] args) {
        int i = 5;
        Status S = Status.Running;
        Status P = Status.Failed;
//        System.out.println(P);

        Status[] x = Status.values();

//        for(Status x : s){
//            System.out.println(x);
//        }

        switch(S)
        {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }

        if(S ==Status.Running)
            System.out.println("All Good");
        else if(S ==Status.Failed)
            System.out.println("Try Again");
        else if ( S ==Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");

    }
}
