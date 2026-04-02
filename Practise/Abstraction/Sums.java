abstract class Calculator{
abstract int add(int a,int b);
void display(){
System.out.println("Using Abstract Class");
}
}

class Sum extends Calculator{
int add(int a,int b){
return a+b;
}
}

public class Sums{
public static void main(String[] args){
Calculator c=new Sum();
c.display();
System.out.println(c.add(5,3));
}
}