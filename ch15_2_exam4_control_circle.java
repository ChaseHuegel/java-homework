import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircleWithoutEventHandling extends Application 
{
	private CirclePane circlePane = new CirclePane();

	@Override
	public void start(Stage primaryStage) 
	{
		circlePane.setStroke(Color.BLACK);
		circlePane.setFill(Color.WHITE);
		
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btnEnlarge = new Button("Enlarge");
		Button btnShrink = new Button("Shrink");
		hBox.getChildren().add(btnEnlarge);
		hBox.getChildren().add(btnShrink);

		btnEnlarge.setOnAction(new EnlargeHandler());
		btnShrink.setOnAction(new ShrinkHandler());

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("ControlCircle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}

	class EnlargeHandler implements EventHandler<ActionEvent> 
	{
		@Override
		public void handle(ActionEvent e) 
		{
			circlePane.enlarge();
		}
	  }
	  
	class ShrinkHandler implements EventHandler<ActionEvent> 
	{
		@Override
		public void handle(ActionEvent e) 
		{
			circlePane.shrink();
		}
  	}
}

class CirclePane extends StackPane 
{
	private Circle circle = new Circle(50); 
	
	public CirclePane() 
	{
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}
	
	public void enlarge() 
	{
		circle.setRadius(circle.getRadius() + 2);
	}
	
	public void shrink() 
	{
		circle.setRadius(circle.getRadius() > 2 ? 
		circle.getRadius() - 2 : circle.getRadius());
	}
}