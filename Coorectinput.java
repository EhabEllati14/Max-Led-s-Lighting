package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Coorectinput {
   private BorderPane correctinput = new BorderPane();
   private Label correctlabel;
   private Button correctbutton, cancel;
   private VBox corvbo = new VBox(10);
   private HBox corohbox = new HBox(10);
   Coorectinput(){
	   cancel= new Button("Cancel");
	   cancel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	   cancel.setMinSize(150, 50);
	   cancel.setStyle(
		            
					 "-fx-background-radius: 10em; " +
				                "-fx-min-width: 100px; " +
				                "-fx-min-height: 20px; " +
				                "-fx-max-width: 150px; " +
				                "-fx-max-height: 100px; " +"-fx-background-color: black;" 
		    ); 
	   cancel.setTextFill(Color.WHITE);
	   correctlabel= new Label("The Inputs Is Correct !!"+"\n"+"Please Press Result To see all results for The program !!"+"\n"+"Note If you press cancel the sorce and leds order will be deleted !!!!");
	   correctlabel.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
	   correctlabel.setTextFill(javafx.scene.paint.Color.WHITE);
	   
	   correctbutton= new Button("Result");
	   correctbutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	   correctbutton.setMinSize(150, 50);
	   correctbutton.setStyle(
		            
					 "-fx-background-radius: 10em; " +
				                "-fx-min-width: 100px; " +
				                "-fx-min-height: 20px; " +
				                "-fx-max-width: 150px; " +
				                "-fx-max-height: 100px; " +"-fx-background-color: black;" 
		    );  
	   Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/backk.jpg");
	   ImageView mg = new ImageView(m);
	   mg.setFitHeight(200);
	   mg.setFitWidth(600);
	   
	   corohbox.getChildren().addAll(correctbutton,cancel);
	   corohbox.setAlignment(Pos.CENTER);
	   correctbutton.setTextFill(Color.WHITE);
	   
	   corvbo.getChildren().addAll(correctlabel,corohbox);
	   corvbo.setAlignment(Pos.CENTER);
	   
	   correctinput.getChildren().add(mg);
	   correctinput.setCenter(corvbo);
	   
	   
	   
   }

public BorderPane getCorrectinput() {
	return correctinput;
}

public Label getCorrectlabel() {
	return correctlabel;
}

public Button getCorrectbutton() {
	return correctbutton;
}

public VBox getCorvbo() {
	return corvbo;
}

public void setCorrectinput(BorderPane correctinput) {
	this.correctinput = correctinput;
}

public void setCorrectlabel(Label correctlabel) {
	this.correctlabel = correctlabel;
}

public void setCorrectbutton(Button correctbutton) {
	this.correctbutton = correctbutton;
}

public void setCorvbo(VBox corvbo) {
	this.corvbo = corvbo;
}
   
   
}
