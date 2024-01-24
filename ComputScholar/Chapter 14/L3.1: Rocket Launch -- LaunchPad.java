import java.util.*;
class LaunchPad
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter destination and speed (KPS): ");
       String destination = input.next();
       double speed = input.nextDouble();
       input.close();

       // student code here       
       Rocket newRocket = new Rocket();
       newRocket.setDestination(destination);
       newRocket.setSpeed(speed);
       newRocket.launch();

   }
} 
                
