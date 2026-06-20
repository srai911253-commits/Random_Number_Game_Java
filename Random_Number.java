import java.util.*;
public class Random_Number{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int myNumber = (int)(Math.random()*100);
     int userName = 0;
    do{
        System.out.println("Guess my number (1-100) :");
        userName = sc.nextInt();
        if(userName == myNumber){
            System.out.println("WOHOO .. CORRECT NUMBER !!!");
            break;
        }
        else if(userName>myNumber){
            System.out.println("your number is too large");
        }
        else{
            System.out.println("your number is too small");
        }
        
     } while (userName>=0) ;
        System.out.print("My Number was :");
        System.out.println(myNumber);
        
            
        
    
  }
}