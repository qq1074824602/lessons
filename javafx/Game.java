 import java.util.Random;
   import java.util.Scanner;
   public class Game {
     public static void main ( String[] args ) {
       Random random = new Random();
       Scanner sc = new Scanner( System.in );
       int target = random.nextInt( 10 );
       System.out.print( "your answer? >" );
       int answer = sc.nextInt();
       if ( answer == target ) {
         System.out.println( "you win!" );
       } else {
         System.out.println( "target: " + target );
       }
     }
   }