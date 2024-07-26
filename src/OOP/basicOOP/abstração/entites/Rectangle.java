package OOP.basicOOP.abstração.entites;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    public Rectangle (){
        super();
    }

    public Rectangle (Color color,double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double area() {
        return width * height;
    }
}
