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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Warningsource {
	Stage stage4;
	private Button ok;
	private Label wartxt, msgtxt;
	private BorderPane sourceborder = new BorderPane();
	private VBox warvbox = new VBox(10);

	Warningsource() {
		ok = new Button(" OK ");
		ok.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		ok.setStyle("-fx-border-color:black;-fx-border-width:8");
		ok.setMaxWidth(200);

		wartxt = new Label(" Attention Please !! ");
		wartxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		wartxt.setTextFill(javafx.scene.paint.Color.YELLOW);
		 
		msgtxt = new Label();
		msgtxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		msgtxt.setTextFill(javafx.scene.paint.Color.YELLOW);

		Image m  = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/warningphoto.jpg");
		ImageView mg = new ImageView(m);
		 mg.setFitHeight(400);
		 mg.setFitWidth(1100);
		
		warvbox.getChildren().addAll(wartxt,msgtxt);
		
		sourceborder.getChildren().add(mg);
		sourceborder.setCenter(warvbox);
		ok.setAlignment(Pos.CENTER);
		sourceborder.setBottom(ok);
		
		
	}

	public Stage getStage4() {
		return stage4;
	}

	public Button getOk() {
		return ok;
	}

	public Label getWartxt() {
		return wartxt;
	}

	public Label getMsgtxt() {
		return msgtxt;
	}

	public BorderPane getSourceborder() {
		return sourceborder;
	}

	public VBox getWarvbox() {
		return warvbox;
	}

	public void setStage4(Stage stage4) {
		this.stage4 = stage4;
	}

	public void setOk(Button ok) {
		this.ok = ok;
	}

	public void setWartxt(Label wartxt) {
		this.wartxt = wartxt;
	}

	public void setMsgtxt(Label msgtxt) {
		this.msgtxt = msgtxt;
	}

	public void setSourceborder(BorderPane sourceborder) {
		this.sourceborder = sourceborder;
	}

	public void setWarvbox(VBox warvbox) {
		this.warvbox = warvbox;
	}
	

}
