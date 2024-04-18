package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class backview {
 Stage stage6;
 BorderPane backborder= new BorderPane();
 
 backview(){
	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/backblueyes.jpeg"); 
	ImageView mg = new ImageView(m);
	mg.setFitHeight(600);
	mg.setFitWidth(1200);
	
	backborder.getChildren().add(mg);
	
 }

public Stage getStage6() {
	return stage6;
}

public BorderPane getBackborder() {
	return backborder;
}

public void setStage6(Stage stage6) {
	this.stage6 = stage6;
}

public void setBackborder(BorderPane backborder) {
	this.backborder = backborder;
}
 
}
