package ArrayList;
import java.util.ArrayList;
public class Methods {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(2,6);

        al.set(2,5);
        al.remove(1);
        int s = al.size();
        boolean chk = al.contains(2);
        al.clear();int a = al.get(1);
        boolean chk1 = al.isEmpty();

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println("\n"+a);
        System.out.println("\n"+chk+" "+ chk1);
    }
}
