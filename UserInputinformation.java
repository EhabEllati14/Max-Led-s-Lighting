package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class UserInputinformation {
    Stage stage7;
	private BorderPane ruleborder = new BorderPane();
	private Button ok;
	private Label rulelabel,rules6label,notelabel;
	private VBox rulevbox = new VBox(10);
	
	    UserInputinformation(){
		ok = new Button ("OK");
		ok.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		ok.setStyle("-fx-border-color:black;-fx-border-width:8");
		ok.setMaxWidth(200);
		
		rulelabel = new Label("                                  Rules                              ");
		rulelabel.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 60));
		rulelabel.setTextFill(javafx.scene.paint.Color.WHITE);
		
		rules6label= new Label("When inserting LED inputs some rules must be adhered to , so that the result is given correctly: "+"\n"+"1-The input for Leds must not be Zero If Source are not zero."+"\n"+"2-The Leds input must not be null ." +"\n"+"3- The Leds input must not Contain Character / String ."+"\n"+"4-The Leds inputs must not decrease any number of sources number and lenght because each source must have "+"\n"+"one led in Leds Circuit."+"\n"+"5- IF input are repeat more than one time so here we have problem we must have for each number one time only ! ."+"\n"+"6- The Data Must not be Sorted this condition is important sorted (ASC/DES) Must not sorted !!"+"\n"+"--> If you encounter this situation, a screen will appear with all the possibilities and you will select one between them "+"\n"+"--> so do not worry !");
		rules6label.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		rules6label.setTextFill(javafx.scene.paint.Color.WHITE);
		
		notelabel = new Label("Important Note --> If you do not comply with these Five Rules, warnings will appear so you can avoid them. Please adhere to "+"\n"+"these terms, Thank you !"+"\n"+"When you Done enter the input press Result Below To see ALL Results !! ");
		notelabel.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		notelabel.setTextFill(javafx.scene.paint.Color.RED.brighter());
		
		
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/backblueyes.jpeg");
		ImageView mg = new ImageView(m);
		mg.setFitHeight(600);
		mg.setFitWidth(1250);
		
		
		
		rulevbox.getChildren().addAll(rules6label,notelabel);
		rulevbox.setAlignment(Pos.CENTER);
	
		ruleborder.getChildren().add(mg);
		
		ruleborder.setTop(rulelabel);
		ruleborder.setAlignment(rulelabel, Pos.CENTER);
		rulelabel.setAlignment(Pos.CENTER);
		
		ruleborder.setCenter(rulevbox);
		
		ruleborder.setBottom(ok);
		ruleborder.setAlignment(ok,Pos.CENTER);
		ok.setAlignment(Pos.CENTER);
		
	}

	public BorderPane getRuleborder() {
		return ruleborder;
	}

	public Button getOk() {
		return ok;
	}

	public Label getRulelabel() {
		return rulelabel;
	}

	public Label getRules6label() {
		return rules6label;
	}

	public Label getNotelabel() {
		return notelabel;
	}

	public VBox getRulevbox() {
		return rulevbox;
	}

	public void setRuleborder(BorderPane ruleborder) {
		this.ruleborder = ruleborder;
	}

	public void setOk(Button ok) {
		this.ok = ok;
	}

	public void setRulelabel(Label rulelabel) {
		this.rulelabel = rulelabel;
	}

	public void setRules6label(Label rules6label) {
		this.rules6label = rules6label;
	}

	public void setNotelabel(Label notelabel) {
		this.notelabel = notelabel;
	}

	public void setRulevbox(VBox rulevbox) {
		this.rulevbox = rulevbox;
	}
	
	
	
	
}
