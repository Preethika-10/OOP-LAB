public class DataOperations{
       public static void main(String[] args){
              int a = 1000;
              System.out.println("The first number is "+a);
              int b = 651;
              System.out.println("The second number is "+b);
              int sum = a+b;
              System.out.println("The sum of the two numbers is "+sum);
              int dif = a-b;
              System.out.println("The difference between the two numbers is "+dif);
              int mul = a*b;
              System.out.println("The multiplication of the two numbers is "+mul);
              double div = a/b;
              System.out.println("The division of the two numbers is "+div);
              float mod = a%b;
              System.out.println("The modulus of the two numbers is "+mod);
              System.out.println();
 
              int c = 1000;
              System.out.println("The third number is "+c);
              boolean gt = a>b;
              System.out.println("The truth value for a>b is "+gt);
              boolean ge = (a>=c);
              System.out.println("The truth value for a>=b is "+ge);
              boolean lt = a<b;
              System.out.println("The truth value for a<b is "+lt);
              boolean le = (b<=c);
              System.out.println("The truth value for b<=c is "+le);
              boolean e = a==b;
              System.out.println("The truth value for a==b is "+e);
              boolean ne = a!=b;
              System.out.println("The truth value for a!=b is "+ne);
              System.out.println();
    
              int x = 8;
              System.out.println(x++);
              System.out.println("x after increment is "+x);
              int y = 10;
              System.out.println(y--);
              System.out.println("y after decrement is "+y);
              int age = 20;
              boolean voterid = true;
              if (age>=18 && voterid == true){
                  System.out.println("Eligible to vote");
              }
              else{ 
                  System.out.println("Not eligible to vote");
              }
              boolean isWeekend = false;
              boolean schoolCanceled = true;
              if (isWeekend || schoolCanceled) {
                  System.out.println("Holiday");
              } 
              else {
                  System.out.println("Time for college");
              }
              boolean val = true;
              System.out.println(!val);
        }
}
