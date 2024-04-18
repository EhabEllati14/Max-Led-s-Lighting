package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class ResultPage {
	
	private GridPane grid1 = new GridPane();
	private GridPane grid2 = new GridPane();
	private BorderPane allresultborder = new BorderPane();
	private Label input ,sourcelab,ledlab,resultlab,maxlab,exceptlab,tablelab;
	private Button closebut , tablebut, digrambutton;
	private TextField sourcetxt,maxtxt;
	private TextArea ledsorderta, exceptresultta;
	private Line line;
	private VBox upgrid= new VBox(15);
	private VBox upgrid2= new VBox(15);
	private HBox reshbox = new HBox(15);
	
	ResultPage(){
		input = new Label("Input");
		input.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 30));
		input.setTextFill(javafx.scene.paint.Color.WHITE);
		input.setAlignment(Pos.CENTER);
		
		resultlab = new Label(" Result ");
		resultlab.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 30));
		resultlab.setTextFill(javafx.scene.paint.Color.WHITE);
		resultlab.setAlignment(Pos.CENTER);
		
		sourcelab= new Label("Source Number :");
		sourcelab.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		sourcelab.setTextFill(javafx.scene.paint.Color.WHITE);
		sourcelab.setAlignment(Pos.CENTER);
		
		ledlab= new Label("LEDS Order  :");
	    ledlab.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		ledlab.setTextFill(javafx.scene.paint.Color.WHITE);
		ledlab.setAlignment(Pos.CENTER);
		
		maxlab= new Label("1- Max Number Of Leds Lighting : ");
		maxlab.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		maxlab.setTextFill(javafx.scene.paint.Color.WHITE);
		maxlab.setAlignment(Pos.CENTER);
		
		exceptlab= new Label("2- One Option for Excepted Result : ");
		exceptlab.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		exceptlab.setTextFill(javafx.scene.paint.Color.WHITE);
		exceptlab.setAlignment(Pos.CENTER);
		
		tablelab= new Label("3- To See DP Table Please Click on Table Option : ");
		tablelab.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		tablelab.setTextFill(javafx.scene.paint.Color.WHITE);
		tablelab.setAlignment(Pos.CENTER);
		
		
		sourcetxt=new TextField(null);
		sourcetxt.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		sourcetxt.setMinWidth(300);
		sourcetxt.setMinHeight(40);
		sourcetxt.setEditable(false);
		
		maxtxt=new TextField(null);
	    maxtxt.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		maxtxt.setMinWidth(300);
		maxtxt.setMinHeight(40);
		maxtxt.setEditable(false);
		
		
		tablebut = new Button(" Option Table ");
	
		tablebut .setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		tablebut .setMinSize(150, 50);
		tablebut .setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: white;"
		        );
		
		digrambutton = new Button(" Digram Option ");
		
		digrambutton .setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		digrambutton .setMinSize(150, 50);
		digrambutton .setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: white;"
		        );
		
		closebut = new Button(" Close The Program ");
		
		closebut .setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		closebut .setMinSize(150, 50);
		closebut .setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: white;"
		        );
		ledsorderta= new TextArea(null);
		ledsorderta.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		  ledsorderta.setStyle("-fx-border-color:black;-fx-border-width:3");
		  ledsorderta.setEditable(false);
		 // ledsorderta.setStyle("-fx-font-size:16");
		  ledsorderta.setMaxHeight(100);
		  ledsorderta.setMaxWidth(600);
		  exceptresultta= new TextArea(null);
		  exceptresultta.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		  exceptresultta.setStyle("-fx-border-color:black;-fx-border-width:3");
		  exceptresultta.setEditable(false);
		  exceptresultta.setMaxHeight(100);
		  exceptresultta.setMaxWidth(600);
		  Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/backblueyes.jpeg");
		  ImageView mg = new ImageView(m);
		  mg.setFitHeight(600);
		  mg.setFitWidth(1250);
		  allresultborder.getChildren().add(mg);
		  
		  line = new Line();
		line.setStroke(Color.WHITE);
		  line.setStartX(0);
		  line.setEndX(1250);
		  line.maxWidth(20);
		  input.setAlignment(Pos.CENTER);
		  grid1.add(sourcelab, 0, 0);
		  grid1.add(sourcetxt, 1, 0);
		  grid1.add(ledlab, 0, 1);
		  grid1.add(ledsorderta, 1, 1);
		  
		  grid1.setHgap(10);
		  grid1.setVgap(10);
		  
		  grid2.setHgap(10);
		  grid2.setVgap(10);
		  upgrid.getChildren().addAll(input,grid1,line);
		  upgrid.setAlignment(Pos.CENTER);
		  
		  allresultborder.setTop(upgrid);
		  
		  grid2.add(maxlab, 0, 0);
		  grid2.add(maxtxt, 1, 0);
		  grid2.add(exceptlab, 0, 1);
		  grid2.add(exceptresultta, 1, 1);
		  grid2.add(tablelab, 0, 2);
		  grid2.add(tablebut, 1, 2);
		   upgrid2.getChildren().addAll(resultlab,grid2);
		   upgrid2.setAlignment(Pos.CENTER);
		   allresultborder.setCenter(upgrid2);
		   closebut.setAlignment(Pos.CENTER);
		   reshbox.getChildren().addAll(closebut,digrambutton);
		   reshbox.setAlignment(Pos.CENTER);
		   allresultborder.setBottom(reshbox);
		
		
	}
	

	public Button getDigrambutton() {
		return digrambutton;
	}


	public HBox getReshbox() {
		return reshbox;
	}


	public void setDigrambutton(Button digrambutton) {
		this.digrambutton = digrambutton;
	}


	public void setReshbox(HBox reshbox) {
		this.reshbox = reshbox;
	}


	public GridPane getGrid1() {
		return grid1;
	}

	public GridPane getGrid2() {
		return grid2;
	}

	public BorderPane getAllresultborder() {
		return allresultborder;
	}

	public Label getInput() {
		return input;
	}

	public Label getSourcelab() {
		return sourcelab;
	}

	public Label getLedlab() {
		return ledlab;
	}

	public Label getResultlab() {
		return resultlab;
	}

	public Label getMaxlab() {
		return maxlab;
	}

	public Label getExceptlab() {
		return exceptlab;
	}

	public Label getTablelab() {
		return tablelab;
	}

	public Button getClosebut() {
		return closebut;
	}

	public Button getTablebut() {
		return tablebut;
	}

	public TextField getSourcetxt() {
		return sourcetxt;
	}

	public TextField getMaxtxt() {
		return maxtxt;
	}

	public TextArea getLedsorderta() {
		return ledsorderta;
	}

	public TextArea getExceptresultta() {
		return exceptresultta;
	}

	public Line getLine() {
		return line;
	}

	public VBox getUpgrid() {
		return upgrid;
	}

	public VBox getUpgrid2() {
		return upgrid2;
	}

	public void setGrid1(GridPane grid1) {
		this.grid1 = grid1;
	}

	public void setGrid2(GridPane grid2) {
		this.grid2 = grid2;
	}

	public void setAllresultborder(BorderPane allresultborder) {
		this.allresultborder = allresultborder;
	}

	public void setInput(Label input) {
		this.input = input;
	}

	public void setSourcelab(Label sourcelab) {
		this.sourcelab = sourcelab;
	}

	public void setLedlab(Label ledlab) {
		this.ledlab = ledlab;
	}

	public void setResultlab(Label resultlab) {
		this.resultlab = resultlab;
	}

	public void setMaxlab(Label maxlab) {
		this.maxlab = maxlab;
	}

	public void setExceptlab(Label exceptlab) {
		this.exceptlab = exceptlab;
	}

	public void setTablelab(Label tablelab) {
		this.tablelab = tablelab;
	}

	public void setClosebut(Button closebut) {
		this.closebut = closebut;
	}

	public void setTablebut(Button tablebut) {
		this.tablebut = tablebut;
	}

	public void setSourcetxt(TextField sourcetxt) {
		this.sourcetxt = sourcetxt;
	}

	public void setMaxtxt(TextField maxtxt) {
		this.maxtxt = maxtxt;
	}

	public void setLedsorderta(TextArea ledsorderta) {
		this.ledsorderta = ledsorderta;
	}

	public void setExceptresultta(TextArea exceptresultta) {
		this.exceptresultta = exceptresultta;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	public void setUpgrid(VBox upgrid) {
		this.upgrid = upgrid;
	}

	public void setUpgrid2(VBox upgrid2) {
		this.upgrid2 = upgrid2;
	}
	

}
