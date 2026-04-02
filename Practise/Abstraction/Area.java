abstract class Shape{
abstract double area(double r);
void message(){
System.out.println("Area Calculation");
}
}

class Circle extends Shape{
double area(double r){
return 3.14*r*r;
}
}

public class Area{
public static void main(String[] args){
Shape s=new Circle();
s.message();
System.out.println(s.area(5));
}
}