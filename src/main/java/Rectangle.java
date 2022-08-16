public class Rectangle {

    private float length;
    private float width;

    public Rectangle(float newLength, float newWidth){
        this.length = newLength;
        this.width = newWidth;
    }

    public float getLength(){
        return this.length;
    }

    public float getWidth(){
        return this.width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getPerimeter(){
        float perimeter = 2 * width + 2 * length;
        return perimeter;
    }

    public float getArea(){
        float area = length * width;
        return area;
    }

    public float getDiagonal(){
        double diagonal = Math.sqrt(Math.pow(length,2) + Math.pow(width,2));
        float floatDiagonal = (float)diagonal;
        return floatDiagonal;
    }
}
