public class Circle {

    private double radius;

    public Circle(double newRadius){
        this.radius = newRadius;
    }

    public double getCircumference(){
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

}
