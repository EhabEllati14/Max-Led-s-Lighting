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
import javafx.stage.Stage;

public class NoteFile {
    Stage stage11;
	private BorderPane fileborder = new BorderPane();
	private Label note,fileexample,filenote; 
	private Button filechoose,cancel,morebutton;
	private HBox filehbox= new HBox(10);
	private VBox notevbox= new VBox(10);
	NoteFile(){
		
		note= new Label("Note");
		note.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 30));
		note.setTextFill(javafx.scene.paint.Color.WHITE);
		note.setAlignment(Pos.CENTER);
		
		filenote= new Label(" --> Please , There Are Some Restrictions For The Inputs Inside The File ."+"\n"+"You must adhere to these restrictions in order for the data to be correct :) "+"\n"+" --> The File Input must Have only 2 lines , First line must be the source and second one is Leds order : "+"\n"+" First Line only contain One number which is the Source. "+"\n"+"The second Line contain the Leds Order ."+"If You Want to see what the lEDs Order Must be And the restriction Please Click More ! .");
		filenote.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		filenote.setTextFill(javafx.scene.paint.Color.WHITE);
		filenote.setAlignment(Pos.CENTER);
		
		fileexample= new Label("Here An Example For The File Inputs : "+"\n "+" 6 "+"\n"+" 2,6,3,5,4,1 "+"\n"+"Notes About Example --> 1- As We see The Source in first line , Leds Order In Second Line."+"\n"+"2- The order Of leds , Must have coma (,) Between Numbers ,when you enter the last number you dont have to put (,) ."+"\n"+"If the Source is Correct and the led order is correct any line after leds orderis done -->  is not Taken !."+"\n"+"  Thank You , Have A Nice Day !!");
		fileexample.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		fileexample.setTextFill(javafx.scene.paint.Color.RED);
		fileexample.setAlignment(Pos.CENTER);
		
		morebutton = new Button("More");
		morebutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		morebutton.setMinSize(150, 50);
		morebutton.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 20px; " +
			                "-fx-max-width: 150px; " +
			                "-fx-max-height: 100px; " +"-fx-background-color: black;" 
	    ); 
		morebutton.setTextFill(Color.WHITE);
		filechoose= new Button(" File Choose ");
		filechoose.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		filechoose.setMinSize(150, 50);
		filechoose.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );  
		filechoose.setTextFill(Color.WHITE);
		cancel= new Button(" Cancel ");
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
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/backblueyes.jpeg");
		ImageView mg = new ImageView(m);
		mg.setFitHeight(600);
		mg.setFitWidth(1270);
		fileborder.getChildren().add(mg);
		
		fileborder.setTop(note);
		
		notevbox.getChildren().addAll(filenote,fileexample,morebutton);
		notevbox.setAlignment(Pos.CENTER);
		
		fileborder.setCenter(notevbox);
		fileborder.setAlignment(notevbox, Pos.CENTER);
		
		filehbox.getChildren().addAll(filechoose,cancel);
		fileborder.setBottom(filehbox);
		filehbox.setAlignment(Pos.CENTER);
		fileborder.setAlignment(filehbox, Pos.CENTER);
		
	}
	public Stage getStage11() {
		return stage11;
	}
	public BorderPane getFileborder() {
		return fileborder;
	}
	public Label getNote() {
		return note;
	}
	public Label getFileexample() {
		return fileexample;
	}
	public Label getFilenote() {
		return filenote;
	}
	public Button getFilechoose() {
		return filechoose;
	}
	public Button getCancel() {
		return cancel;
	}
	public Button getMorebutton() {
		return morebutton;
	}
	public HBox getFilehbox() {
		return filehbox;
	}
	public VBox getNotevbox() {
		return notevbox;
	}
	public void setStage11(Stage stage11) {
		this.stage11 = stage11;
	}
	public void setFileborder(BorderPane fileborder) {
		this.fileborder = fileborder;
	}
	public void setNote(Label note) {
		this.note = note;
	}
	public void setFileexample(Label fileexample) {
		this.fileexample = fileexample;
	}
	public void setFilenote(Label filenote) {
		this.filenote = filenote;
	}
	public void setFilechoose(Button filechoose) {
		this.filechoose = filechoose;
	}
	public void setCancel(Button cancel) {
		this.cancel = cancel;
	}
	public void setMorebutton(Button morebutton) {
		this.morebutton = morebutton;
	}
	public void setFilehbox(HBox filehbox) {
		this.filehbox = filehbox;
	}
	public void setNotevbox(VBox notevbox) {
		this.notevbox = notevbox;
	}
	
	
	
}