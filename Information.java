package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Information {
 Stage stage2;
 private Button closebutton;
 private Label Infolabel;
 private TextArea textinformation ;
 private BorderPane borderinformation = new BorderPane();
 
Information(){
	closebutton= new Button(" Close ");
	closebutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	closebutton.setMinSize(150, 50);
	closebutton.setStyle(
            
			 "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
    );  
	closebutton.setTextFill(Color.WHITE);
	Infolabel = new Label("  Information About Program !!!   ");
	Infolabel.setStyle(
    		"-fx-background-color: derive(#61a2b1,1.7);"+"-fx-background-color:black;" +
            "-fx-background-insets: 0.5;" +
            "-fx-padding: 5;" +
            "-fx-background-radius: 100em; " +
            "-fx-min-width: 600px; " +
            "-fx-min-height: 40px; " +
            "-fx-max-width: 900px; " +
            "-fx-border-width: 1;" +
            "-fx-border-radius: 5;" +
            "-fx-fill: white;" 
    );
     Infolabel.setTextFill(Color.WHITE.brighter().brighter());
     Infolabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 60));

     textinformation=new TextArea();
     textinformation.setText(" Welcome To My Program !! "+"\n"+" * This Program consist 2 Circuits boards(S-circuit  and L-circuit ) : "+"\n"+
     " * S circuit --> contains n numbers of power sources ."+"\n"+ " * L circuit --> conatins n numbers of LED's ."+"\n"+" * Note --> The Sources S is Sorted ( ascending order),  For Example -->  <1, 2, 3, … , n>  ."+"\n"+"  But , The LEDS's Circuit are not Sorted which it is Random ,For Example -->  <2, 9, 5, 14, 3,... > . "
     		+"\n"+" --> ** You were asked to connect each LED in L circuit  to its pair in S circuit  (i.e., 1 with 1, 2 with 2) through unshielded wires . "+"\n"+" --> thus when a wire connects a LED (li) in L with its corresponding source in S (si)."+"\n"+" it may prevent other LEDs from being connected (no two wires may cross)."
     		+"\n"+ "So My Program Goal is --> Is to find the best pairs to be connected, so the maximum number of LEDs are lighted By using Dynamic Programming !! ");
     textinformation.setStyle("-fx-border-color:black;-fx-border-width:3");
     textinformation.setStyle("-fx-font-size:18");
     textinformation.setMaxHeight(600);
     textinformation.setMaxWidth(1200);
     textinformation.setEditable(false);
     Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/backblueyes.jpeg");
	 ImageView mg = new ImageView(m);
	 mg.setFitHeight(600);
	 mg.setFitWidth(1300);
	 borderinformation.getChildren().add(mg);
     borderinformation.setCenter(textinformation);
     borderinformation.setTop(Infolabel);
     borderinformation.setAlignment(Infolabel, Pos.CENTER);
     borderinformation.setBottom(closebutton);
     borderinformation.setAlignment(closebutton, Pos.CENTER);
}

public Stage getStage2() {
	return stage2;
}

public Button getClosebutton() {
	return closebutton;
}

public Label getInfolabel() {
	return Infolabel;
}

public TextArea getTextinformation() {
	return textinformation;
}

public BorderPane getBorderinformation() {
	return borderinformation;
}

public void setStage2(Stage stage2) {
	this.stage2 = stage2;
}

public void setClosebutton(Button closebutton) {
	this.closebutton = closebutton;
}

public void setInfolabel(Label infolabel) {
	Infolabel = infolabel;
}

public void setTextinformation(TextArea textinformation) {
	this.textinformation = textinformation;
}

public void setBorderinformation(BorderPane borderinformation) {
	this.borderinformation = borderinformation;
}

}
