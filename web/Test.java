import javafx.animation.Animation;
   import javafx.animation.ScaleTransition;
   import javafx.util.Duration;
   import javafx.application.Application;
   import javafx.stage.Stage;
   import javafx.scene.Scene;
   import javafx.scene.Group;
   import javafx.scene.paint.Color;
   import javafx.scene.shape.Rectangle;
   
   public class Test extends Application {
     // main()
     public static void main( String[] args ) {
       launch( args );
     }
     
     // start()
     @Override
     public void start( Stage stage ) throws Exception {
       View v = new View();
       Scene scene = new Scene( v, 400, 300 );
       stage.setScene( scene );
       stage.show();
     }
   }
   
   class View extends Group {
     // constructor
     public View() {
       // shape, color
       Rectangle rect = new Rectangle( 0, 0, 50, 40 );
       rect.setFill( Color.CYAN );
       
       // animation, setcyclecount, setautoreverse
       ScaleTransition animation = new ScaleTransition( Duration.seconds( 2 ), rect );
       animation.setFromX( 1 );
       animation.setFromY( 1 );
       animation.setToX( 5 );
       animation.setToY( 5 );
       animation.setCycleCount( Animation.INDEFINITE );
       animation.setAutoReverse( true );
       
       // play, add
       animation.play();
       getChildren().add( rect );
     }
   }