package Abstract;

abstract class Figure {
    float x;
    float y;
    Figure(float x, float y){
        this.x = x;
        this.y = y;
    }
    public abstract float getPerimeter();
    public abstract float getArea();
}
class Rectangle extends Figure{
    private float width;
    private float height;

    Rectangle(float x, float y, float width, float height){
        super(x, y);
        this.width=width;
        this.height=width;
    }

    @Override
    public float getPerimeter() {
        return height * 2 + width * 2;
    }

    @Override
    public float getArea() {
        return width * height;
    }
}
