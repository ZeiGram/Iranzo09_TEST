module ExerJavaGUI {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml;
}
