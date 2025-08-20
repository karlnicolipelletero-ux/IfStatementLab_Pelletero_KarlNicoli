package karl;
import java.util.Scanner;

public class Karl {

    public static void main(String[] args){
      //Shows the word "Problem 1" in output
      System.out.println("Problem 1"); 
      Scanner input= new Scanner(System.in);
      //Evaluates the data that user will type (di ko sure pero ana guro)
      System.out.println("What is your Age?");
      //Output to the user about their age 
      int age=input.nextInt();
      //Bale mao ni ang basis sa if and else statements where ang iinput sa user kay iremember sa device for conditionin)
        
        
      
        if (age <13){
            System.out.println("You are a child!"); 
        }  else if (age<=19){
            System.out.println("You are a teenager!");
        }  else {
            System.out.println("You are an Adult!");
        }
        
      
      System.out.println();         
      System.out.println("Problem 2");
      System.out.println("What is today's temperature (in C)");
      int temp=input.nextInt();
        
        
        if (temp<0){
            System.out.println("You are experiencing Freezing weather levels");
        } else if (temp<=25){
            System.out.println("You are experiencing Normal weather levels");
        } else {
            System.out.println("You are experiencing Hot Levels");
        }
        
      System.out.println();
      System.out.println("Problem 3");
      System.out.println("What is your Grade in Senior High School?");
      int scr=input.nextInt();
      
        if (scr<75){
            System.out.println("You have Failed!");
        } else if (scr<=89) {
            System.out.println("You are Good!");
        } else {
            System.out.println("You are Excellent!");
        }
        
      System.out.println();
      System.out.println("Problem 4");
      System.out.println("Input any radius of a circle");
      double rad=input.nextDouble();
      
        if (rad<=0){
            System.out.println("Invalid Radius");
            
      //if ever ang input is not 0, iyaha dayung i evaluate ang given equations, if ang condition is not satisfied, mu print sha sa circumference and area respectively
        } else { 
            double circ=(Math.PI * Math.pow(rad, 2));
            double area=(2 * Math.PI * rad);
            
            System.out.println("Circumference:" +circ);
            System.out.println("Area:" +area);
        }
        
      System.out.println();
      System.out.println("Problem 5");
      System.out.println("Input any Integer");
      int integer=input.nextInt();
      
      //bale ang pasabot sa %2 kay if i divide og 2 ang number, if 0 ang remainder,even sha. And if 1 ang remainder, odd
      if (integer % 2==0){
          System.out.println("This is an Even number!");
      } else{
          System.out.println("This is an Odd number!");
          
      }
        
    }
}
    
    
