import java.util.*;
public class Marks3{
    public static void main(String[] args){
        int mat , che , phy , eng , csc, total;
        double finalscore;
        Scanner sm = new Scanner(System.in);
        total = sm.nextInt();
        for(int i = 0; i<total; i++) {
              System.out.println("Enter maths marks:");
              mat = sm.nextInt();
              System.out.println("Enter chemistry marks:");
              che = sm.nextInt();
              System.out.println("Enter physics marks:");
              phy = sm.nextInt();
              System.out.println("Enter english marks:");
              eng = sm.nextInt();
              System.out.println("Enter computer science marks:");
              csc = sm.nextInt();
              finalscore = (mat + che + phy + eng + csc)/5;
              if (finalscore >= 90)
                       System.out.println("Excellent");
              else if (finalscore >= 80)
                       System.out.println("Very Good");
              else if (finalscore >= 60)
                       System.out.println("Good");
              else if(finalscore >= 40)
                       System.out.println("Average");
              else
                       System.out.println("Poor");
           
      }
  }
}
                