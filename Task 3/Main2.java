interface Shape{
  double calculateArea();
}

class Rectangle implements Shape{
  private double length;
  private double width;

  public Rectangle(double length, double width){
    this.length=length;
    this.width=width;
  }
  @Override
  public double calculateArea(){
    return length*width;
  }
}
class Circle implements Shape{
  private double radius;
  public Circle(double radius){
    this.radius=radius;
  }
  @Override
  public double calculateArea(){
    return Math.PI* radius*radius;
  }
}



class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}


class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calculateArea(); 
        }
        return total;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("========== TASK 2: OCP ==========");
        
        Shape[] shapes = {
            new Rectangle(5, 10),  
            new Circle(7),         
            new Triangle(4, 6)   
        };
        
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        
        System.out.println("Total area of all shapes: " + totalArea);
    }
}


