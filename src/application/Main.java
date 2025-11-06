package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Main extends Application {

	@Override
	public void start(Stage stage) {
		TableView<User> table = new TableView<>();
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        TableColumn<User, String> colUsername   = new TableColumn<>("Username");
        TableColumn<User, String> colEmail      = new TableColumn<>("Email Address");
        TableColumn<User, String> colFirstName  = new TableColumn<>("First Name");
        TableColumn<User, String> colMiddleName = new TableColumn<>("Middle Name");
        TableColumn<User, String> colLastName   = new TableColumn<>("Last Name");
        TableColumn<User, String> colUserType   = new TableColumn<>("User Type");

        colUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("emailAddress"));
        colFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        colMiddleName.setCellValueFactory(new PropertyValueFactory<>("middleName"));
        colLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        colUserType.setCellValueFactory(new PropertyValueFactory<>("userType"));

        table.getColumns().addAll(
            colUsername, colEmail, colFirstName, colMiddleName, colLastName, colUserType
        );

        ArrayList<User> sampleList = new ArrayList<>();
        sampleList.add(new User("levioxaah",  "hjgranger@hogwarts.edu",  "Hermione",  "Jean",   "Granger",   "PROFESSOR"));
        sampleList.add(new User("sunshine.daisies", "rbweasley@hogwarts.edu",      "Ronald", "Bilius", "Weasley",   "PREFECT"));
        sampleList.add(new User("theboywholived",   "hjpotter@hogwarts.edu",   "Harry",   "James",   "Potter", "STUDENT"));
        sampleList.add(new User("darklord.official",   "tmriddle@hogwarts.edu",   "Tom",   "Marvolo",   "Riddle", "STUDENT"));
        
        ObservableList<User> data = FXCollections.observableArrayList(sampleList);
        table.setItems(data);
        
		BorderPane root = new BorderPane(table);
		
		// create the UI control node
		Button btn = new Button("Click me!");
		
		// instantiate the desired layout class		
		// add the created nodes/components to the layout
		root.getChildren().add(btn);
		
		
		root.setStyle("-fx-padding: 12;");
		stage.setScene(new Scene(root, 900, 320));
		stage.setTitle("Hogwarts User Accounts");
		stage.show();
	}

	public static void main(String[] args) { 
		launch(); 
	}

}

