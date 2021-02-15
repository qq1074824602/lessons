import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Moving extends Application {
  public static void main( String[] args ) {
  }
  launch( args );
    }
    
    @Override
 public void start( Stage stage ) throws Exception {
  View v = new View();
   Scene scene = new Scene( v, 400, 300 );
   stage.setScene( scene );
   stage.show();
    }
}
  class View extends Group {
    // コンストラクタ
    public View() {
      // 形をつくる、色をつける
      Rectangle rect = new Rectangle( 0, 0, 60, 70 );
      rect.setFill( Color.BLUE );
      
      // アニメーションをつくる；　時間、どれを動かすか
      TranslateTransition animation = new TranslateTransition( Duration.seconds( 2 ),  rect );
      
      // アニメーションについて；　最初の状態
      animation.setFromX( -50 );
      animation.setFromY( 50 );
      // アニメーションについて；　最後の状態
      animation.setToX( 300 );
      animation.setToY( 290 );w
      
      // アニメーションについて；　くりかえし
      animation.setCycleCount( Animation.INDEFINITE );
      // play, add
      animation.play();
      getChildren().add( rect );
    }
  }