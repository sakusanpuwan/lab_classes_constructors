public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String newID, String newName, int newBalance ){

        this.id = newID;
        this.name = newName;
        this.balance = newBalance;

    }

    public String getId(){
        return this.id = id;
    }

    public String getName(){
        return this.name = name;
    }

    public int getBalance(){
        return this.balance = balance;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void SetBalance(int balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }
}
