interface Calculator{
int add(int a,int b);
}

class Sum implements Calculator{
public int add(int a,int b){
return a+b;
}
}

public class Cls{
public static void main(String[] args){
Calculator c=new Sum();
System.out.println(c.add(10,5));
}
}