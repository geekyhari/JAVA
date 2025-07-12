package ObjectOrientedProgramming.bank;

class Account{
    public String name;
    protected String email;
    private String pass;

    //getters and setters
    public String getPass(){
        return this.pass;
    }
    public void setPass(String passw){
        this.pass = passw;
    }
}
public class Bank{
    public String name;

    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "shri";
        acc1.email = "xyz@mail.com";
        acc1.setPass("abcd");
        System.out.println(acc1.getPass());
    }
}