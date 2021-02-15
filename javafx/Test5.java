import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
public class Test extends Application {
　  public static void main( String[] args ) {
　      launch( args );
　   }
　   @Override
public void start( Stage stage ) throws Exception {
　      View v = new View();			// View は Group を継承している
　      Scene scene = new Scene( v, 500, 400 );
　      stage.setScene( scene );
　      stage.show();
　  }
　}

　  class View extends Group {
　    public View() {
　      // shape
　      Circle circle = new Circle( 200, 200, 30 );
　      circle.setFill( Color.BLUE );
　      
　      // animation, duration
　      TranslateTransition animation = new TranslateTransition( Duration.senconds(2), circle );
　      
　      // animation-from, to
　      animation.setFromX(50);
　      animation.setFromY(400);
　      animation.setToX(400);
　      animation.setToY(100);
　      
　      // repeat?
　      animation.setCycleCount( Animation.INDEFINITE );
　      
　      // play, add
　      animation.play();
　      getChildren().add( circle );
　  }
}