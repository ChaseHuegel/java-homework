import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class SierpinskiTriangle extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		SierpinskiTrianglePane trianglePane = new SierpinskiTrianglePane(); 
		TextField tfOrder = new TextField(); 
		tfOrder.setOnAction(e -> trianglePane.setOrder(Integer.parseInt(tfOrder.getText())));
		tfOrder.setPrefColumnCount(4);
		tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(new Label("Enter an order: "), tfOrder);
		hBox.setAlignment(Pos.CENTER);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(trianglePane);
		borderPane.setBottom(hBox);
			
		Scene scene = new Scene(borderPane, 200, 210);
		primaryStage.setTitle("SierpinskiTriangle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		scene.widthProperty().addListener(ov -> trianglePane.paint());
		scene.heightProperty().addListener(ov -> trianglePane.paint());
	}

	static class SierpinskiTrianglePane extends Pane 
	{
		private int order = 0;

		public void setOrder(int _order) 
		{
			this.order = _order;
			paint();
		}

		SierpinskiTrianglePane() {}

		protected void paint() 
		{
			Point2D p1 = new Point2D(getWidth() / 2, 10);
			Point2D p2 = new Point2D(10, getHeight() - 10);
			Point2D p3 = new Point2D(getWidth() - 10, getHeight() - 10);

			this.getChildren().clear();

			displayTriangles(order, p1, p2, p3);
		}

		private void displayTriangles(int _order, Point2D _p1, Point2D _p2, Point2D _p3) 
		{
			if (_order == 0) 
			{
				Polygon triangle = new Polygon();
				triangle.getPoints().addAll(_p1.getX(), _p1.getY(), _p2.getX(), _p2.getY(), _p3.getX(), _p3.getY());
				triangle.setStroke(Color.BLACK);
				triangle.setFill(Color.WHITE);

				this.getChildren().add(triangle);
			} 
			else 
			{
				Point2D p12 = _p1.midpoint(_p2);
				Point2D p23 = _p2.midpoint(_p3);
				Point2D p31 = _p3.midpoint(_p1);

				displayTriangles(_order - 1, _p1, p12, p31);
				displayTriangles(_order - 1, p12, _p2, p23);
				displayTriangles(_order - 1, p31, p23, _p3);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}