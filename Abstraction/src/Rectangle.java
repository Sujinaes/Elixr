public class Rectangle extends Shape{
    @Override
    public void calculatearea(){
        int length = 5;
        int breadth= 7;
        int area = length*breadth;
        System.out.println("Area of a rectangle : " + area);
    }
}
