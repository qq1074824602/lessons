import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
public class Test extends Application{
	public static void main(String[] args){
		launch( args );
	}
	@Override
	public void start(Stage stage) throws Exception{
		String msg="Hello,JavaFX!";
		String name="hyo usei";
		String cl="IG12";
		 Label h01 = new Label(msg);
		 Label h02 = new Label(name);
		 Label h03 = new Label(cl);
		BorderPane pane = new BorderPane();
		pane.setTop(h01);
		pane.setCenter(h02);
		pane.setBottom(h03);
		Scene scene = new Scene( pane,300,200);
		stage.setScene(scene);
		stage.show();
	}
}