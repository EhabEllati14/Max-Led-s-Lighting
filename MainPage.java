package application;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainPage {
	Stage stage1 ;
	
private Button infobutton , startbutton ,close;
private Label maxlabel;
 private HBox hboxmain = new HBox(80);

private Group group = new Group();

MainPage(){
	maxlabel = new Label("  Max LED'S Lighting  ");
    maxlabel.setStyle(
    		"-fx-background-color: derive(#61a2b1,1.7);"+"-fx-background-color:black;" +
            "-fx-background-insets: 0.5;" +
            "-fx-padding: 5;" +
            "-fx-background-radius: 100em; " +
            "-fx-min-width: 600px; " +
            "-fx-min-height: 40px; " +
            "-fx-max-width: 200px; " +
            "-fx-border-width: 1;" +
            "-fx-border-radius: 5;" +
            "-fx-fill: white;" 
    );


  
	maxlabel.setTextFill(Color.WHITE.brighter().brighter());
	maxlabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 60));
	maxlabel.setLayoutX(300);
	maxlabel.setLayoutY(200);

	infobutton = new Button("Information");
	infobutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	infobutton.setMinSize(150, 50);
	infobutton.setStyle(
            
			 "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: white;" 
    );
	

	close = new Button(" Close ");
	close.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	close.setMinSize(150, 50);
	close.setStyle(
            
			 "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: white;" 
    );
	
	startbutton = new Button("Lets Start");
	startbutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	startbutton.setMinSize(150, 50);
	startbutton.setStyle(
	        "-fx-background-radius: 10em; " +
	                "-fx-min-width: 200px; " +
	                "-fx-min-height: 50px; " +
	                "-fx-max-width: 250px; " +
	                "-fx-max-height: 150px; " +"-fx-background-color: white;"
	        );
	hboxmain.getChildren().addAll(infobutton,startbutton  ,close);
	hboxmain.setAlignment(Pos.CENTER);
	hboxmain.setLayoutX(250);
	hboxmain.setLayoutY(400);
	 Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/jody.jpg");
	 ImageView mg = new ImageView(m);
	 mg.setFitHeight(600);
	 mg.setFitWidth(1250);
	 group.getChildren().addAll(mg,maxlabel,hboxmain);
	
}



public Button getClose() {
	return close;
}



public void setClose(Button close) {
	this.close = close;
}



public Button getInfobutton() {
	return infobutton;
}
public Button getStartbutton() {
	return startbutton;
}
public Label getMaxlabel() {
	return maxlabel;
}
public void setInfobutton(Button infobutton) {
	this.infobutton = infobutton;
}
public void setStartbutton(Button startbutton) {
	this.startbutton = startbutton;
}
public void setMaxlabel(Label maxlabel) {
	this.maxlabel = maxlabel;
}
public HBox getHboxmain() {
	return hboxmain;
}



public Group getGroup() {
	return group;
}



public void setHboxmain(HBox hboxmain) {
	this.hboxmain = hboxmain;
}



public void setGroup(Group group) {
	this.group = group;
}


}
