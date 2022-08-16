import java.util.Random;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private double heldMoney;

    public Customer(String newFirstName, String newLastName,double newHeldMoney){
        Random random = new Random();
        this.id = random.nextInt(1000);
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.heldMoney = newHeldMoney;
    }

    public String getFullName(){
        String fullName = this.firstName + " " + this.lastName;
        return fullName;
    }

    public void subtractHeldMoney(double outgoingMoney){
        this.heldMoney -= outgoingMoney;
    }

    public double getHeldMoney(){
        return this.heldMoney;
    }

    @Override
    public String toString() {
        return "Account{" + "id='" + id + ", name='" + firstName + ", held money=" + heldMoney + '}';
    }
}
