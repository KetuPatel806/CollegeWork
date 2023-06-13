import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class ShapeDrawing extends Application {
@Override
public void start(Stage primaryStage) {
Group root = new Group();
// draw circle in bottom left
Circle circle = new Circle(50, 450, 50);
circle.setFill(Color.BLUE);
// draw triangle in top right
Polygon triangle = new Polygon();
triangle.getPoints().addAll(new Double[]{
550.0, 50.0,
600.0, 150.0,
500.0, 150.0});
triangle.setFill(Color.GREEN);
// add shape name text
Text circleText = new Text(30, 455,"Circle");
Text triangleText = new Text(520, 125,"Triangle");
circleText.setFont(Font.font(20));
triangleText.setFont(Font.font(15));
root.getChildren().addAll(circle, triangle, circleText,
triangleText);
Scene scene = new Scene(root, 600, 500);
primaryStage.setTitle("Shape Drawing");
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}