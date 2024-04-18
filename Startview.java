package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Startview {
	Stage stage3;
	private GridPane startgrid = new GridPane();
	private BorderPane stbp= new BorderPane();
	private HBox starthbox = new HBox(20);
	private Label sourcelabel,Ledslabel ,chooselabeloptions;
	private TextField sourcetxt , ledstxt;
	private Button userbutton , randombutton ,closestart, resultbutton ,cancel;
	private Text choosetext;
	private RadioButton fileoption ,chooseoption;
	private HBox source= new HBox(20);
	private  HBox led = new HBox(20);
	private HBox option = new HBox(20);
	private ImageView mg;
	Startview(){
		choosetext= new Text(" * First Welcome To The Program !! "+ "\n"+"* Please Choose option to input the Data For  the Source and Leds : ");
		choosetext.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,20));
		choosetext.setFill(Color.WHITE);
		
		fileoption= new RadioButton(" Read From File . ");
		fileoption.setTextFill(Color.WHITE);
		fileoption.setMaxSize(300, 300);
		fileoption.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,20));
		
		chooseoption= new RadioButton(" User Enter The Inputs / Random Option.");
		chooseoption.setTextFill(Color.WHITE);
		chooseoption.setMinSize(100, 10);
		chooseoption.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,20));
		
		sourcelabel= new Label("Number of Source : ");
		sourcelabel.setTextFill(Color.WHITE);
		sourcelabel.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,20));
		sourcelabel.setMinWidth(100);
		
		chooselabeloptions= new Label("Please Choose One Option for LEDS Input :");
		chooselabeloptions.setTextFill(Color.WHITE);
		chooselabeloptions.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,20));
		chooselabeloptions.setMinWidth(100);
		
		Ledslabel= new Label("Order of LED'S : ");
		Ledslabel.setTextFill(Color.WHITE);
		Ledslabel.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,20));
		Ledslabel.setMinWidth(100);
		
		sourcetxt=new TextField(null);
		sourcetxt.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		sourcetxt.setMinWidth(300);
		sourcetxt.setMinHeight(40);
		
		ledstxt=new TextField(null);
		ledstxt.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		ledstxt.setMinWidth(300);
		ledstxt.setMinHeight(40);
		
		userbutton= new Button(" User Enter  ");
		userbutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		userbutton.setMinSize(150, 50);
		userbutton.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );  
		userbutton.setTextFill(Color.WHITE);
		
		cancel = new Button(" Cancel" );
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
		
		randombutton= new Button(" Random Option  ");
		randombutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		randombutton.setMinSize(150, 50);
		randombutton.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );  
		randombutton.setTextFill(Color.WHITE);
		
		closestart= new Button(" Close ");
		closestart.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		closestart.setMinSize(150, 50);
		closestart.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );  
		closestart.setTextFill(Color.WHITE);
		
		resultbutton= new Button(" RESULT ");
		resultbutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		resultbutton.setMinSize(150, 50);
		resultbutton.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );  
		resultbutton.setTextFill(Color.WHITE);
		

		Image m = new Image("C:\\Users\\Ehab\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-11-19 184420.png");
		 ImageView mg = new ImageView(m);
		 mg.setFitHeight(350);
		 mg.setFitWidth(700);
		 Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/backblueyes.jpeg");
		 ImageView mg2 = new ImageView(m2);
		 mg2.setFitHeight(640);
		 mg2.setFitWidth(1250);
		 mg.setStyle("-fx-border-color: white; "+"-fx-border-width: 20;");
		
		 source.getChildren().addAll(sourcelabel,sourcetxt);
		 
		 led.getChildren().addAll(Ledslabel,ledstxt);
		 
		 option.getChildren().addAll(userbutton,randombutton ,cancel);
		 startgrid.add(choosetext, 0, 0);
		 startgrid.add(fileoption, 0, 1);
		 startgrid.add(chooseoption, 0, 2);
		 startgrid.add(source, 1, 1);
		 startgrid.add(led, 1, 2);
		 startgrid.add(chooselabeloptions, 1, 2);
		 startgrid.add(option, 1, 3);
		
		 startgrid.setHgap(5);
		 startgrid.setVgap(5);
		 stbp.getChildren().add(mg2);
		 starthbox.getChildren().addAll(closestart,resultbutton);
		 starthbox.setAlignment(Pos.CENTER);
		stbp.setTop(startgrid);
		stbp.setCenter(mg);
		stbp.setBottom(starthbox);
		stbp.setAlignment(starthbox, Pos.CENTER);
		
		

		
	}
	
	
	






	public ImageView getMg() {
		return mg;
	}









	public void setMg(ImageView mg2) {
		this.mg = mg;
	}









	public Button getCancel() {
		return cancel;
	}


	public void setCancel(Button cancel) {
		this.cancel = cancel;
	}


	public Label getChooselabeloptions() {
		return chooselabeloptions;
	}


	public void setChooselabeloptions(Label chooselabeloptions) {
		this.chooselabeloptions = chooselabeloptions;
	}


	public Stage getStage3() {
		return stage3;
	}

	public HBox getStarthbox() {
		return starthbox;
	}

	public Text getChoosetext() {
		return choosetext;
	}

	public RadioButton getFileoption() {
		return fileoption;
	}

	public RadioButton getChooseoption() {
		return chooseoption;
	}

	public HBox getSource() {
		return source;
	}

	public HBox getLed() {
		return led;
	}

	public HBox getOption() {
		return option;
	}

	public void setStage3(Stage stage3) {
		this.stage3 = stage3;
	}

	public void setStarthbox(HBox starthbox) {
		this.starthbox = starthbox;
	}

	public void setChoosetext(Text choosetext) {
		this.choosetext = choosetext;
	}

	public void setFileoption(RadioButton fileoption) {
		this.fileoption = fileoption;
	}

	public void setChooseoption(RadioButton chooseoption) {
		this.chooseoption = chooseoption;
	}

	public void setSource(HBox source) {
		this.source = source;
	}

	public void setLed(HBox led) {
		this.led = led;
	}

	public void setOption(HBox option) {
		this.option = option;
	}

	public GridPane getStartgrid() {
		return startgrid;
	}

	public BorderPane getStbp() {
		return stbp;
	}

	public Label getSourcelabel() {
		return sourcelabel;
	}

	public Label getLedslabel() {
		return Ledslabel;
	}

	public TextField getSourcetxt() {
		return sourcetxt;
	}

	public TextField getLedstxt() {
		return ledstxt;
	}

	public Button getUserbutton() {
		return userbutton;
	}

	public Button getRandombutton() {
		return randombutton;
	}

	public Button getClosestart() {
		return closestart;
	}

	public Button getResultbutton() {
		return resultbutton;
	}

	public void setStartgrid(GridPane startgrid) {
		this.startgrid = startgrid;
	}

	public void setStbp(BorderPane stbp) {
		this.stbp = stbp;
	}

	public void setSourcelabel(Label sourcelabel) {
		this.sourcelabel = sourcelabel;
	}

	public void setLedslabel(Label ledslabel) {
		Ledslabel = ledslabel;
	}

	public void setSourcetxt(TextField sourcetxt) {
		this.sourcetxt = sourcetxt;
	}

	public void setLedstxt(TextField ledstxt) {
		this.ledstxt = ledstxt;
	}

	public void setUserbutton(Button userbutton) {
		this.userbutton = userbutton;
	}

	public void setRandombutton(Button randombutton) {
		this.randombutton = randombutton;
	}

	public void setClosestart(Button closestart) {
		this.closestart = closestart;
	}

	public void setResultbutton(Button resultbutton) {
		this.resultbutton = resultbutton;
	}

	

}
