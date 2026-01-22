import java.util.*;
public class Attendance {
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the number of students:");
     int students = sc.nextInt();
	 
	 for(int i=0; i<=students; i++){
	       System.out.println("Enter the attendance percentage:");
	       int atp = sc.nextInt();
  
               System.out.println("Enter marks obtained:");      
	       int mark = sc.nextInt();
		  
		 if(atp >= 75){
		   System.out.println("Eligible to write exam");
			
		     if (atp > 90){
			    mark = mark + 5;
			    System.out.println("5 marks awarded");
                            
			  }
             System.out.println("Final marks:" + mark);		  
		    }
		else{
		    System.out.println("Not eligible to write");
			}
		}
	}
}
	