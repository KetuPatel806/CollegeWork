import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class StudentRegistration extends Application{
public static void main(String args[]) {
launch(args);
}
public void start(Stage primaryStage) throws Exception {
Label nameLabel = new Label("Name: ");
TextField nameField = new TextField();
Label emailLabel = new Label("Email: ");
TextField emailField = new TextField();
Label genderLabel = new Label("Gender: ");
RadioButton maleButton = new RadioButton("Male");
RadioButton femaleButton = new RadioButton("Female");
Label hobbiesLabel = new Label("Hobbies: ");
CheckBox sportsCheckbox = new CheckBox("Sports");
CheckBox musicCheckbox = new CheckBox("Music");
Label courseLabel = new Label("Course: ");
ComboBox<String> courseComboBox = new ComboBox<>();
courseComboBox.getItems().addAll(
"Engineering",
"Business Administration",
"Medicine",
"Law"
);
Label aboutLabel = new Label("About: ");
TextArea aboutTextArea = new TextArea();
Label countryLabel = new Label("Country: ");
ListView<String> countryListView = new ListView<>();
countryListView.getItems().addAll(
"India",
"United States",
"United Kingdom",
"China"
);
countryListView.setMaxHeight(50);
Label ageLabel = new Label("Age: ");
ScrollBar ageScrollBar = new ScrollBar();
ageScrollBar.setMin(0);
ageScrollBar.setMax(100);
ageScrollBar.setOrientation(Orientation.HORIZONTAL);
ageScrollBar.setPrefWidth(150);
ageScrollBar.setMaxHeight(50);
Label salaryLabel = new Label("Salary: ");
//Create Slider
Slider salarySlider = new Slider(0, 100000, 50000);
salarySlider.setShowTickLabels(true);
salarySlider.setShowTickMarks(true);
salarySlider.setMajorTickUnit(25000);
salarySlider.setMinorTickCount(5);
salarySlider.setBlockIncrement(1000);
Button submitButton = new Button("Submit");
GridPane gridPane = new GridPane();
gridPane.setPadding(new Insets(10));
gridPane.setHgap(10);
gridPane.setVgap(10);
gridPane.add(nameLabel, 0, 0);
gridPane.add(nameField, 1, 0);
gridPane.add(emailLabel, 0, 1);
gridPane.add(emailField, 1, 1);
gridPane.add(genderLabel, 0, 2);
gridPane.add(maleButton, 1, 2);
gridPane.add(femaleButton, 2, 2);
gridPane.add(hobbiesLabel, 0, 3);
gridPane.add(sportsCheckbox, 1, 3);
gridPane.add(musicCheckbox, 2, 3);
gridPane.add(courseLabel, 0, 4);
gridPane.add(courseComboBox, 1, 4);
gridPane.add(aboutLabel, 0, 5);
gridPane.add(aboutTextArea, 1, 5);
gridPane.add(countryLabel, 0, 6);
gridPane.add(countryListView, 1, 6);
gridPane.add(ageLabel, 0, 7);
gridPane.add(ageScrollBar, 1, 7);
gridPane.add(salaryLabel, 0, 8);
gridPane.add(salarySlider, 1, 8);
gridPane.add(submitButton, 0, 9, 2, 1);
Scene scene = new Scene(gridPane, 500, 500);
primaryStage.setScene(scene);
primaryStage.setTitle("Student Registration");
primaryStage.show();
}
}