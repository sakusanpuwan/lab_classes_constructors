public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("1234","Sakusan",100);

//        myAccount.getId();
//        myAccount.getName();
//        myAccount.getBalance();

        System.out.println(myAccount.toString());

        //MVP Task 1
        Circle myCircle = new Circle(5);

        System.out.println(myCircle.getCircumference());

        myCircle.setRadius(50);

        System.out.println(myCircle.getCircumference());

        //MVP Task 2

        Rectangle myRectangle = new Rectangle(10,10);

        System.out.println(myRectangle.getPerimeter());
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getDiagonal());

        //MVP Task 3
        Customer myCustomer = new Customer("Sakusan","Puwan",100);
        myCustomer.subtractHeldMoney(20);
        System.out.println(myCustomer.toString());

        // Ext 1
        Account_ext myAccount_ext = new Account_ext("1",myCustomer,100);












    }



}
