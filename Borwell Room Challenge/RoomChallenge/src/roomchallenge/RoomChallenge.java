/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomchallenge;

/**
 *
 * @author Connor
 */
import java.util.Scanner;
public class RoomChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome. This program will prompt you to enter dimensions for a room, and will output the area of the floor, the ammount of paint required to cover the walls and ceiling, and the volume of the room.");
       System.out.println("It is presumed that walls are perpendicular to the floor and the ceiling.");
       
     Scanner scanner = new Scanner(System.in);
     System.out.println("Are all of the angles in the room exact right angles? (y/n): ");
     String yesno = scanner.next();
     if ("y".equals(yesno)){
    System.out.print("Room Width: ");
    double width = Double.parseDouble(scanner.next());
    System.out.print("Room Height: ");
    double height = Double.parseDouble(scanner.next());
    System.out.print("Room Length: ");
    double length = Double.parseDouble(scanner.next());
    double area = length*width;
    double wallsa = length*height*2;
    double wallsb = width*height*2;
    double paint = area+wallsa+wallsb;
    double volume = length*width*height;
    System.out.println("Area of the floor: " +area +"m^2");
    System.out.println("Amount of paint required to paint the walls: " +paint +"m^2");
    System.out.println("Volume of the room: " +volume +"m^3");
     }
     else { System.out.print("Room Height: ");
    double height = Double.parseDouble(scanner.next());
     System.out.print("Length of wall a: ");
     double lengtha = Double.parseDouble(scanner.next());
          System.out.print("Length of wall b: ");
     double lengthb = Double.parseDouble(scanner.next());
          System.out.print("Length of wall c: ");
     double lengthc = Double.parseDouble(scanner.next());
          System.out.print("Length of wall d: ");
     double lengthd = Double.parseDouble(scanner.next());
               System.out.print("Angle between walls a and b (degrees): ");
     double dega = Double.parseDouble(scanner.next());
     double anglea = Math.toRadians(dega);
                     System.out.print("Angle between walls c and d (degrees): ");
     double degc = Double.parseDouble(scanner.next());
          double anglec = Math.toRadians(degc);
     
     double angles = anglea+anglec;
     double s2 = lengtha+lengthb+lengthc+lengthd;
     double s = s2/2;
     double value = ((s-lengtha)*(s-lengthb)*(s-lengthc)*(s-lengthd)-(1/2)*(lengtha*lengthb*lengthc*lengthd*(1+Math.cos(angles))));
       double area = Math.sqrt(value);;
     System.out.println("Area of the floor: " +area +"m^2");
     double paint = (area+lengtha*height+lengthb*height+lengthc*height+lengthd*height);
      System.out.println("Amount of paint required to paint the walls: " +paint +"m^2");
      double volume = area*height;  
      System.out.println("Volume of the room: " +volume + "m^3");      
     }
    }
    
}
