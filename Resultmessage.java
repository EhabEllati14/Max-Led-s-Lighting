package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Resultmessage {
    Stage stage5;
	private Label notelabel,optionresult, rightresult;
	private Button ok ,cancel,close;
	private VBox resultvbox = new VBox(10);
    private BorderPane resmsgbp= new BorderPane();
    private TextArea ta = new TextArea();
    private HBox rescan= new HBox(10);
	
	Resultmessage(){
		notelabel = new Label("                                           Note             ");
		notelabel.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 30));
		notelabel.setTextFill(javafx.scene.paint.Color.WHITE);
		
		optionresult = new Label("The Program Are Select The Order Input for Leds, You Can see The inputs Here down !");
		optionresult.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		optionresult.setTextFill(javafx.scene.paint.Color.WHITE);
		
		rightresult = new Label("You Have 3 Options : "+"\n"+" 1- If You Like this Input select (*Result*) to See All Results Table + Max Leds Lighting."+"\n"+"2-If You Don't Like The Input Click Another Time To take another Random leds input ."+"\n"+"3-If you Dont Want Random Option and delete all please select Close --> Input Page .");
		rightresult.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		rightresult.setTextFill(javafx.scene.paint.Color.RED.brighter().brighter());
		
		 ok = new Button(" Result ");
		ok .setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
			ok.setMinSize(150, 50);
			ok.setStyle(
		            
					 "-fx-background-radius: 10em; " +
				                "-fx-min-width: 100px; " +
				                "-fx-min-height: 20px; " +
				                "-fx-max-width: 150px; " +
				                "-fx-max-height: 100px; " +"-fx-background-color: black;" 
		    );  
			ok.setTextFill(Color.WHITE);
	     
	     cancel = new Button(" Another Time ");
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
	     
			close = new Button(" Close ");
			close.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
			close.setMinSize(150, 50);
			close.setStyle(
			            
						 "-fx-background-radius: 10em; " +
					                "-fx-min-width: 100px; " +
					                "-fx-min-height: 20px; " +
					                "-fx-max-width: 150px; " +
					                "-fx-max-height: 100px; " +"-fx-background-color: black;" 
			    );  
			close.setTextFill(Color.WHITE);
			
	    ta.setStyle("-fx-border-color:black;-fx-border-width:3");
	 	ta.setStyle("-fx-font-size:16");
	 	ta.setMaxHeight(100);
	 	ta.setMaxWidth(650);
	 	ta.setEditable(false);
	 	
	 	rescan.getChildren().addAll(ok,cancel,close);
	 	
		
	     Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/backblueyes.jpeg");
	     ImageView mg = new ImageView(m);
	     mg.setFitHeight(350);
		 mg.setFitWidth(750);
		 
	     resultvbox.getChildren().addAll(notelabel,optionresult ,rightresult);
	     resmsgbp.getChildren().add(mg);
	     
	     
	     rightresult.setAlignment(Pos.CENTER);
	     resmsgbp.setAlignment(resultvbox, Pos.CENTER);
	     resmsgbp.setTop(resultvbox);
	     rightresult.setAlignment(Pos.CENTER);
	     resmsgbp.setAlignment(resultvbox, Pos.CENTER);
	     
	     
	     resmsgbp.setCenter(ta);
	     resmsgbp.setBottom(rescan);
	     rescan.setAlignment(Pos.CENTER);
	     
	    
		
		
	}
	

	public Button getClose() {
		return close;
	}


	public void setClose(Button close) {
		this.close = close;
	}


	public Button getCancel() {
		return cancel;
	}


	public TextArea getTa() {
		return ta;
	}


	public HBox getRescan() {
		return rescan;
	}


	public void setCancel(Button cancel) {
		this.cancel = cancel;
	}


	public void setTa(TextArea ta) {
		this.ta = ta;
	}


	public void setRescan(HBox rescan) {
		this.rescan = rescan;
	}


	public Stage getStage5() {
		return stage5;
	}

	public Label getNotelabel() {
		return notelabel;
	}

	public Label getOptionresult() {
		return optionresult;
	}

	public Label getRightresult() {
		return rightresult;
	}

	public Button getOk() {
		return ok;
	}

	public VBox getResultvbox() {
		return resultvbox;
	}

	public BorderPane getResmsgbp() {
		return resmsgbp;
	}

	public void setStage5(Stage stage5) {
		this.stage5 = stage5;
	}

	public void setNotelabel(Label notelabel) {
		this.notelabel = notelabel;
	}

	public void setOptionresult(Label optionresult) {
		this.optionresult = optionresult;
	}

	public void setRightresult(Label rightresult) {
		this.rightresult = rightresult;
	}

	public void setOk(Button ok) {
		this.ok = ok;
	}

	public void setResultvbox(VBox resultvbox) {
		this.resultvbox = resultvbox;
	}

	public void setResmsgbp(BorderPane resmsgbp) {
		this.resmsgbp = resmsgbp;
	}
	
	
}
