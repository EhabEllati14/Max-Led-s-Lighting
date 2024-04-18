package application;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Random;
import java.util.Scanner;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Main extends Application {

	// We define the Objects of classes
	MainPage View = new MainPage();
	Information infoscreen = new Information();
	Startview startscreen = new Startview();
	Warningsource srcwar = new Warningsource();
	Resultmessage resultmsg = new Resultmessage();
	backview back = new backview();
	UserInputinformation rules = new UserInputinformation();
	Coorectinput correct = new Coorectinput();
	ResultPage resultpage = new ResultPage();
	NoteFile notefile = new NoteFile();
	RulesFile rulefile = new RulesFile();

	public static int[] source;
	public static int ledsize;
	public static int sourcesize;
	public static int[] leds;
	public static int[] checkled;
	public static int number;
    public static int endindex = number;
	public static int[][] cost ;
	public  static String[][] b ;
	public static int[]c;

	// We define the stages for each class of the previous objects
	Stage stage1 = new Stage();
	Stage stage2 = new Stage();
	Stage stage3 = new Stage();
	Stage stage4 = new Stage();
	Stage stage5 = new Stage();
	Stage stage6 = new Stage();
	Stage stage7 = new Stage();
	Stage stage8 = new Stage();
	Stage stage9 = new Stage();
	Stage stage11= new Stage();
	Stage stage12 = new Stage();

	// We define the scenes for the screens and we set the stages on it !!
	Scene scene1 = new Scene(View.getGroup(), 1250, 600);
	Scene scene2 = new Scene(infoscreen.getBorderinformation(), 1200, 600);
	Scene scene3 = new Scene(startscreen.getStbp(), 1200, 640);
	Scene scene4 = new Scene(srcwar.getSourceborder(), 1100, 400);
	Scene scene5 = new Scene(resultmsg.getResmsgbp(), 750, 350);
	Scene scene6 = new Scene(back.getBackborder(), 1200, 600);
	Scene scene7 = new Scene(rules.getRuleborder(), 1250, 600);
	Scene scene8 = new Scene(correct.getCorrectinput(), 600, 200);
	Scene scene9 = new Scene(resultpage.getAllresultborder(),1250,600);
    Scene scene11 = new Scene(notefile.getFileborder(),1270,600);
    Scene scene12 = new Scene(rulefile.getRuleborder(),1250,600);
	public void start(Stage primaryStage) {
		try {
			stage1.setScene(scene1);
			stage1.show();
			
			View .getClose().setOnAction(e->{
				stage1.close();
			});
			TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(1.5), View.getMaxlabel());
        	translateTransition.setByX(100); // move by 100 pixels horizontally
        	translateTransition.setCycleCount(TranslateTransition.INDEFINITE); // repeat indefinitely
        	translateTransition.setAutoReverse(true); // move back and forth
        	translateTransition.play();

			FadeTransition fadeTransition12 = new FadeTransition(Duration.seconds(2), startscreen.getLedslabel());
			fadeTransition12.setFromValue(0.0);
			fadeTransition12.setToValue(1.0);

			FadeTransition fadeTransition13 = new FadeTransition(Duration.seconds(2), startscreen.getSourcetxt());
			fadeTransition13.setFromValue(0.0);
			fadeTransition13.setToValue(1.0);

			FadeTransition fadeTransition14 = new FadeTransition(Duration.seconds(2), startscreen.getLedstxt());
			fadeTransition14.setFromValue(0.0);
			fadeTransition14.setToValue(1.0);

			FadeTransition fadeTransition15 = new FadeTransition(Duration.seconds(2), startscreen.getUserbutton());
			fadeTransition15.setFromValue(0.0);
			fadeTransition15.setToValue(1.0);

			FadeTransition fadeTransition16 = new FadeTransition(Duration.seconds(2), startscreen.getRandombutton());
			fadeTransition16.setFromValue(0.0);
			fadeTransition16.setToValue(1.0);

			FadeTransition fadeTransition17 = new FadeTransition(Duration.seconds(2),
					startscreen.getChooselabeloptions());
			fadeTransition17.setFromValue(0.0);
			fadeTransition17.setToValue(1.0);

			FadeTransition fadeTransition18 = new FadeTransition(Duration.seconds(2), startscreen.getCancel());
			fadeTransition18.setFromValue(0.0);
			fadeTransition18.setToValue(1.0);
			

			FadeTransition fadeTransition19 = new FadeTransition(Duration.seconds(2), startscreen.getSourcelabel());
			fadeTransition19.setFromValue(0.0);
			fadeTransition19.setToValue(1.0);
			
			
			

			ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(2), View.getMaxlabel());
			scaleTransition.setFromX(0.0);
			scaleTransition.setFromY(0.0);
			scaleTransition.setToX(1.0);
			scaleTransition.setToY(1.0);
			scaleTransition.playFromStart();

			ScaleTransition scaleTransition1 = new ScaleTransition(Duration.seconds(2), View.getStartbutton());
			scaleTransition1.setFromX(0.0);
			scaleTransition1.setFromY(0.0);
			scaleTransition1.setToX(1.0);
			scaleTransition1.setToY(1.0);
			scaleTransition1.playFromStart();

			ScaleTransition scaleTransition2 = new ScaleTransition(Duration.seconds(2), View.getInfobutton());
			scaleTransition2.setFromX(0.0);
			scaleTransition2.setFromY(0.0);
			scaleTransition2.setToX(1.0);
			scaleTransition2.setToY(1.0);
			scaleTransition2.playFromStart();
			
			ScaleTransition scaleTransition3 = new ScaleTransition(Duration.seconds(2), View.getClose());
			scaleTransition3.setFromX(0.0);
			scaleTransition3.setFromY(0.0);
			scaleTransition3.setToX(1.0);
			scaleTransition3.setToY(1.0);
			scaleTransition3.playFromStart();
			
			View.getInfobutton().setOnAction(e -> {
				stage2.setScene(scene2);
				stage1.close();
				stage2.show();
			});

			View.getStartbutton().setOnAction(e -> {
				startscreen.getSourcetxt().setVisible(false);
				startscreen.getSourcelabel().setVisible(false);
				startscreen.getLedslabel().setVisible(false);
				startscreen.getLedstxt().setVisible(false);
				startscreen.getUserbutton().setVisible(false);
				startscreen.getRandombutton().setVisible(false);
				startscreen.getChooselabeloptions().setVisible(false);
				startscreen.getCancel().setVisible(false);
				startscreen.getResultbutton().setVisible(false);

				stage3.setScene(scene3);
				stage1.close();
				stage3.show();
			});

			infoscreen.getClosebutton().setOnAction(e -> {
				stage1.setScene(scene1);
				stage2.close();
				stage1.show();
				scaleTransition.playFromStart();
				scaleTransition1.playFromStart();
				scaleTransition2.playFromStart();
				scaleTransition3.playFromStart();
			});

			startscreen.getChooseoption().setOnAction(e -> {
				startscreen.getFileoption().setSelected(false);
				startscreen.getSourcetxt().setVisible(true);
				startscreen.getSourcelabel().setVisible(true);
				startscreen.getLedslabel().setVisible(false);
				startscreen.getLedstxt().setVisible(false);
				startscreen.getUserbutton().setVisible(true);
				startscreen.getRandombutton().setVisible(true);
				startscreen.getChooselabeloptions().setVisible(true);
				startscreen.getResultbutton().setVisible(false);
				startscreen.getCancel().setVisible(true);
				translateTransition.play();
				fadeTransition12.playFromStart();
				fadeTransition13.playFromStart();
				fadeTransition14.playFromStart();
				fadeTransition15.playFromStart();
				fadeTransition16.playFromStart();
				fadeTransition17.playFromStart();
				fadeTransition18.playFromStart();
				fadeTransition19.playFromStart();

			});
			startscreen.getFileoption().setOnAction(e -> {
				startscreen.getChooseoption().setSelected(false);
				startscreen.getSourcetxt().setVisible(false);
				startscreen.getSourcelabel().setVisible(false);
				startscreen.getLedslabel().setVisible(false);
				startscreen.getLedstxt().setVisible(false);
				startscreen.getUserbutton().setVisible(false);
				startscreen.getRandombutton().setVisible(false);
				startscreen.getChooselabeloptions().setVisible(false);
				startscreen.getCancel().setVisible(false);
				startscreen.getResultbutton().setVisible(false);
				stage11.setScene(scene11);
				stage11.show();
				stage3.close();
			});
            
			notefile.getMorebutton().setOnAction(e->{
				stage11.close();
				stage12.setScene(scene12);
				stage3.close();
				stage12.show();
			});
			
			rulefile.getOk().setOnAction(e->{
				stage12.close();
				stage11.show();
				stage3.close();
			});
			notefile.getCancel().setOnAction(e->{
				startscreen.getFileoption().setSelected(false);
				stage11.close();
				stage3.setScene(scene3);
				stage3.show();
				});
			notefile.getFilechoose().setOnAction(e->{
				FileChooser fe = new FileChooser();
				File file1 = fe.showOpenDialog(stage1);
				int x=0;
				try (Scanner scan = new Scanner(file1)) {
					
					//while file have an next line we read it 
					while (scan.hasNextLine()) {
						String s = scan.nextLine();
						//we use array to split the line by use tokens
						//we split by use comma
						if(x==0) {
						if(s==null) {
							srcwar.getMsgtxt()
							.setText("Please The Source is Null ! " + "\n" + " The First line in File Must be Number Of Sources ." + "\n"
									+ "And The second Line is the Order Of leds !!" + "\n" + "  Thank You ! ");
							startscreen.getLedslabel().setVisible(false);
							startscreen.getLedstxt().setVisible(false);
							startscreen.getFileoption().setSelected(false);
							startscreen.getChooseoption().setSelected(false);
							startscreen.getChooselabeloptions().setVisible(false);
					stage3.close();
					stage1.show();
					stage4.setScene(scene4);
					stage4.show();	
					
					
					break;
					
						}
						else if(!(isValidNumber(s))) {
					srcwar.getMsgtxt().setText("Please The input of  Source in file is : "+s+"\n"+"  --> is Not Number is Character / String  (Except only number) ! ");
					
					startscreen.getLedslabel().setVisible(false);
					startscreen.getLedstxt().setVisible(false);
					startscreen.getFileoption().setSelected(false);
					startscreen.getChooseoption().setSelected(false);
					startscreen.getChooselabeloptions().setVisible(false);
					
					stage4.setScene(scene4);
					stage3.show();
					stage11.close();
					stage4.show();	
					break;
						}
						else if((Integer.parseInt(s)==0)){
							srcwar.getMsgtxt().setText(" The Source is Zero ,Led Is Zero  So :" + "\n"
									+ "The Result is Zero theres no leds and sources .");
							startscreen.getLedslabel().setVisible(false);
							startscreen.getLedstxt().setVisible(false);
							startscreen.getUserbutton().setVisible(false);
							startscreen.getRandombutton().setVisible(false);
							startscreen.getSourcetxt().setVisible(false);
							startscreen.getSourcelabel().setVisible(false);
							startscreen.getLedslabel().setVisible(false);
							startscreen.getLedstxt().setVisible(false);
							startscreen.getFileoption().setSelected(false);
							startscreen.getChooseoption().setSelected(false);
							startscreen.getChooselabeloptions().setVisible(false);
							stage3.close();
							stage11.close();
							stage1.show();
							stage4.setScene(scene4);
							stage4.show();	
							break;
						    }
						else {
							number = Integer.parseInt(s);
							sourcesize = number + 1;
							ledsize = number + 1;
							endindex = number;
							source = new int[sourcesize];
							leds = new int[ledsize];
							source[0] = 0;
							leds[0] = 0;
							cost= new int[sourcesize][ledsize];
							b=new String[sourcesize][ledsize];
							for (int i = 1; i <= number; i++) {
								source[i] = i;
								}
							x=1;
							}
						}
						else {
                         
							if (s == null) {
								srcwar.getMsgtxt().setText("Please The LEDS Order is Null !! ");
								stage4.setScene(scene4);
								stage4.show();
								break;
							} else if (isIntegerStringcoma(s) == false) {
								srcwar.getMsgtxt().setText(
										"Please The LEDS Must Only Contains Numbers" + "\n" + "Not Characters / String !! ");
								stage4.setScene(scene4);
								stage4.show();
								break;
							}
							
							// out of range
							else if (isIntegerStringcoma(s) == true) {
								int r = 0;
								if (leds.length - 1 == checkled.length) {
									for (int i = 0; i < checkled.length; i++) {
										if (checkled[i] <= number && checkled[i] > 0) {
											r = 0;
										} else {
											srcwar.getMsgtxt().setText(checkled[i] + " Number is out of The Range ." + "\n"
													+ " --> The Range Must be Between -->  1 to as max --> " + number + "\n"
													+ " Please Enter The  Order of Leds Again (Between The Range Please)!! ");
											startscreen.getLedstxt().setText(null);
											stage4.setScene(scene4);
											stage4.show();
											leds[0] = 0;
											for (int j = 0; j <= number; j++) {
												leds[j] = 0;
											}
											for (int k = 0; k < number; k++) {
												checkled[k] = 0;
											}
											r = 1;
											break;
										}
									}
									if (r == 0) {
	
										if (hasDuplicates(checkled)) {
											srcwar.getMsgtxt().setText("Please We Have Duplicated Number !! "+"\n"+" -->   There are numbers Missed !!!!!   <--" + "\n"
														+ "Please Enter The Numbers agian but check these points " + "\n"
														+ "1-The numbers  length are :  " + number + "." + "\n"
														+ "2- Remeber That the range of the number must between 1 to as maximum num value : "
														+ number + ".");
												startscreen.getLedstxt().setText(null);
												stage4.setScene(scene4);
												stage4.show();
												break;
										} else {
											for (int i = 0; i < checkled.length; i++) {
												leds[i + 1] = checkled[i];
											}
											for (int k = 0; k < number; k++) {
												checkled[k] = 0;
											}
											int j=0;
											int g=0;
											for(int i=1;i<=number;i++) {
												if(source[i]==leds[i]) {
													++j;
												}
												else if (source[i] ==leds[source.length-i]) {
	                                              ++g;
												}
											}
											
											if(j==number) {
												srcwar.getMsgtxt().setText(" The Leds Are Sorted ,, The Leds Must Not Be Sorted (Program said) "+"\n"+"Because if the Program is Sorted we have this Results :"+"\n"+"1- The Max Leds Light is All Leds = "+checkled.length+"\n"+"So all Leds Will BE Lighting From 1 to : "+checkled.length);
												stage4.setScene(scene4);

												for (int i = 0; i <= number; i++) {
													source[i] = 0;
												}
												for (int i = 0; i <= number; i++) {
													leds[i] = 0;
												}

               									 number = 0;
												sourcesize = 0;
												ledsize = 0;
												source = new int[sourcesize];
												leds = new int[ledsize];
												stage4.show();
												break;
											}
											else if (g == number-1  &&  j==1 || g==number) {
												
												srcwar.getMsgtxt().setText(" The Leds Are Sorted Descending,, The Leds Must Not Be Sorted descending/ Ascending (Program said) !!"+"\n"+"Because if the Program is Sorted we have this Results :"+"\n"+"1- The Max Leds Light is All Leds =  1 ."+"\n"+"So the Leds Will BE Lighting is "+number +" of options !! "+"\n"+"One Option is led lighting : "+number);
												stage4.setScene(scene4);

												for (int i = 0; i <= number; i++) {
													source[i] = 0;
												}
												for (int i = 0; i <= number; i++) {
													leds[i] = 0;
												}

               									 number = 0;
												sourcesize = 0;
												ledsize = 0;
												source = new int[sourcesize];
												leds = new int[ledsize];
												stage4.show();
												break;
											}
											else {
											stage8.setScene(scene8);
											stage6.setScene(scene6);
											stage6.show();
											stage8.show();
											stage3.close();
                                             break;
										}
										}
									}

								
							}
							
                                   else if (leds.length - 1 > checkled.length) {
									startscreen.getLedstxt().setText(null);
									srcwar.getMsgtxt().setText(" -->   There are numbers Missed !!!!!   <--" + "\n"
											+ "Please Enter The Numbers agian but check these points " + "\n"
											+ "1-The numbers  length are :  " + number + "." + "\n"
											+ "2- Remeber That the range of the number must between 1 to as maximum num value : "
											+ number + ".");
									stage4.setScene(scene4);
									stage4.show();
									break;

								} else {
									if(hasDuplicates(checkled)) {
									srcwar.getMsgtxt()
								.setText("We Have Duplicated Numbers in The Leds order "+"\n"+" And ,, Please You Entered More than The number length of source you must enter only :"
										+ number + " Numbers with Range 1 --> to as max --> " + number + "\n"
										+ "Please Enter The input Again !!!!");
						        startscreen.getLedstxt().setText(null);
						        stage4.setScene(scene4);
						        stage4.show();
						        break;
									}
									
									else {
										srcwar.getMsgtxt()
										.setText("Please You Entered More than The number length of source you must enter only :"
												+ number + " Numbers with Range 1 --> to as max --> " + number + "\n"
												+ "Please Enter The input Again !!!!");
								        startscreen.getLedstxt().setText(null);
								        stage4.setScene(scene4);
								        stage4.show();
								        break;
									}
				             
							
							}
						}
					
							
						}
					
						
					}	
						
					
				
				}catch (FileNotFoundException e1) {
					System.out.println(
							"error !! : please enter the file name \n if the file does not exsists the filewriter will create it !");

				} catch (Exception ex) {
					System.out.println("You are read from null ");

				}
					
				
				
			});
			
			startscreen.getSourcetxt().setOnMouseClicked(e -> {
				try {
					startscreen.getSourcetxt().setText(null);
				} catch (Exception ex) {

				}
			});

			startscreen.getLedstxt().setOnMouseClicked(e -> {
				try {
					startscreen.getLedstxt().setText(null);
				} catch (Exception ex) {

				}
			});
			startscreen.getClosestart().setOnAction(e -> {
				stage3.close();
				stage1.setScene(scene1);
				stage1.show();
				scaleTransition.playFromStart();
				scaleTransition1.playFromStart();
				scaleTransition2.playFromStart();
				scaleTransition3.playFromStart();
			});

			startscreen.getUserbutton().setOnAction(e -> {
				startscreen.getChooselabeloptions().setVisible(false);
				startscreen.getLedslabel().setVisible(false);
				startscreen.getLedstxt().setVisible(false);
				startscreen.getRandombutton().setVisible(false);
				if (startscreen.getSourcetxt().getText() == null) {
					srcwar.getMsgtxt()
							.setText("Please The Source is Null ! " + "\n" + " You must first enter the Source ." + "\n"
									+ " Then you can enter the order of Leds !!" + "\n" + "  Thank You  ");
					startscreen.getChooselabeloptions().setVisible(true);
					startscreen.getLedslabel().setVisible(false);
					startscreen.getLedstxt().setVisible(false);
					stage4.setScene(scene4);
					stage4.show();
				} else if (!(isValidNumber(startscreen.getSourcetxt().getText()))) {
					srcwar.getMsgtxt().setText("Please The Source is Not Number (Except only number) ! ");
					startscreen.getChooselabeloptions().setVisible(true);
					startscreen.getLedslabel().setVisible(false);
					startscreen.getLedstxt().setVisible(false);
					stage4.setScene(scene4);
					stage4.show();
				} else if (Integer.parseInt(startscreen.getSourcetxt().getText()) == 0) {
					srcwar.getMsgtxt().setText(" The Source is Zero ,Led Is Zero  So :" + "\n"
							+ "The Result is Zero theres no leds and sources .");
					startscreen.getLedslabel().setVisible(false);
					startscreen.getLedstxt().setVisible(false);
					startscreen.getUserbutton().setVisible(false);
					startscreen.getRandombutton().setVisible(false);
					startscreen.getSourcetxt().setVisible(false);
					startscreen.getSourcelabel().setVisible(false);
					stage4.setScene(scene4);
					stage4.show();
				} else {
					number = Integer.parseInt(startscreen.getSourcetxt().getText());
					sourcesize = number + 1;
					ledsize = number + 1;
					endindex = number;
					source = new int[sourcesize];
					leds = new int[ledsize];
					source[0] = 0;
					leds[0] = 0;
					cost= new int[sourcesize][ledsize];
					b=new String[sourcesize][ledsize];
					for (int i = 1; i <= number; i++) {
						source[i] = i;
						}
					stage7.setScene(scene7);
					stage7.show();
				}
			});
			startscreen.getCancel().setOnAction(e -> {
				try {
					startscreen.getSourcetxt().setVisible(false);
					startscreen.getSourcetxt().clear();
					startscreen.getSourcelabel().setVisible(false);
					startscreen.getLedslabel().setVisible(false);
					startscreen.getLedstxt().setVisible(false);
					startscreen.getRandombutton().setVisible(false);
					startscreen.getLedstxt().clear();
					startscreen.getUserbutton().setVisible(false);
					startscreen.getChooselabeloptions().setVisible(false);
					startscreen.getCancel().setVisible(false);
					startscreen.getChooseoption().setSelected(false);
					startscreen.getResultbutton().setVisible(false);
					for (int i = 0; i <= number; i++) {
						System.out.print(source[i]);
					}
					for (int i = 0; i <= number; i++) {
						System.out.print(leds[i]);
					}
					System.out.println("----------------------");
					System.out.println("----------------------");
					System.out.println("----------------------");

					for (int i = 0; i <= number; i++) {
						source[i] = 0;
					}
					for (int i = 0; i <= number; i++) {
						leds[i] = 0;
					}
		
					number = 0;
					sourcesize = 0;
					ledsize = 0;
					source = new int[sourcesize];
					leds = new int[ledsize];

				} catch (Exception ex) {

				}
			});

			startscreen.getRandombutton().setOnAction(e -> {
				try {
					startscreen.getResultbutton().setVisible(false);
					if (startscreen.getSourcetxt().getText() == null) {
						srcwar.getMsgtxt()
								.setText("Please The Source is Null ! " + "\n" + " You must first enter the Source ."
										+ "\n" + " Then you can enter the order of Leds !!" + "\n" + "  Thank You  ");
						startscreen.getChooselabeloptions().setVisible(true);
						startscreen.getLedslabel().setVisible(false);
						startscreen.getLedstxt().setVisible(false);
						stage4.setScene(scene4);
						stage4.show();
					} else if (!(isValidNumber(startscreen.getSourcetxt().getText()))) {
						srcwar.getMsgtxt().setText("Please The Source is Not Number (Except only number) ! ");
						startscreen.getChooselabeloptions().setVisible(true);
						startscreen.getLedslabel().setVisible(false);
						startscreen.getLedstxt().setVisible(false);
						stage4.setScene(scene4);
						stage4.show();
					} else if (Integer.parseInt(startscreen.getSourcetxt().getText()) == 0) {
						srcwar.getMsgtxt().setText(" The Source is Zero ,Led Is Zero  So :" + "\n"
								+ "The Result is Zero theres no leds and sources .");
						startscreen.getLedslabel().setVisible(false);
						startscreen.getLedstxt().setVisible(false);
						startscreen.getUserbutton().setVisible(false);
						startscreen.getRandombutton().setVisible(false);
						startscreen.getSourcetxt().setVisible(false);
						startscreen.getSourcelabel().setVisible(false);
						stage4.setScene(scene4);
						stage4.show();
					} else {
						number = Integer.parseInt(startscreen.getSourcetxt().getText());
						sourcesize = number + 1;
						ledsize = number + 1;
						endindex = number;
						source = new int[sourcesize];
						leds = new int[ledsize];
						source[0] = 0;
						leds[0] = 0;
						cost= new int[sourcesize][ledsize];
						b=new String[sourcesize][ledsize];
					
						for (int i = 1; i <= number; i++) {
							source[i] = i;
						}
						for (int i = 1; i <= number; i++) {
							leds[i] = i;
						}
						shuffleRange(leds, endindex);

						for (int i = 1; i <= number; i++) {
							resultmsg.getTa().appendText(String.valueOf(leds[i]) + " ");
						}
						
						stage6.setScene(scene6);
						stage6.show();
						stage5.setScene(scene5);
						stage5.show();
						stage3.close();
					}
				} catch (Exception ex) {

				}

			});
			srcwar.getOk().setOnAction(e -> {
				stage4.close();
			});

			resultmsg.getOk().setOnAction(e -> {
				//try {
				startscreen.getSourcetxt().setVisible(false);
				startscreen.getSourcelabel().setVisible(false);
				startscreen.getLedslabel().setVisible(false);
				startscreen.getLedstxt().setVisible(false);
				startscreen.getUserbutton().setVisible(false);
				startscreen.getRandombutton().setVisible(false);
				startscreen.getChooselabeloptions().setVisible(false);
				startscreen.getCancel().setVisible(false);
				startscreen.getResultbutton().setVisible(false);
				resultpage.getSourcetxt().setText(String.valueOf(number));
				for (int i = 1; i <leds.length; i++) {
					resultpage.getLedsorderta().appendText(String.valueOf(leds[i])+" - ");
				}
				MAXLeds(source, sourcesize, ledsize, leds, cost, b ) ;
				
				printMax(b,source,sourcesize-1,ledsize-1);
				
				resultpage.getMaxtxt().setText(String.valueOf(cost[sourcesize-1][ledsize-1]));
				stage9.setScene(scene9);
				stage9.show();
				stage5.close();
				stage6.close();
//				}catch(Exception ex) {
//					
//				}

			});
			resultmsg.getCancel().setOnAction(e -> {
				leds[0] = 0;
				for (int i = 1; i <= number; i++) {
					leds[i] = 0;
				}
				for (int i = 1; i <= number; i++) {
					leds[i] = i;
				}
				shuffleRange(leds, endindex);
				resultmsg.getTa().setText(null);
				for (int i = 1; i <= number; i++) {
					resultmsg.getTa().appendText(String.valueOf(leds[i]) + " ");
				}
			});
			
			correct.getCorrectbutton().setOnAction(e->{
				resultpage.getSourcetxt().setText(String.valueOf(number));
				for (int i = 1; i <leds.length; i++) {
					resultpage.getLedsorderta().appendText(String.valueOf(leds[i])+" - ");
				}
				MAXLeds(source, sourcesize, ledsize, leds, cost,b ) ;
				printMax(b,source,sourcesize-1,ledsize-1);
				
				resultpage.getMaxtxt().setText(String.valueOf(cost[sourcesize-1][ledsize-1]));
				stage9.setScene(scene9);
				stage9.show();
				stage8.close();
				stage6.close();
			});
			
			resultmsg.getClose().setOnAction(e -> {
				startscreen.getSourcetxt().setVisible(false);
				startscreen.getSourcetxt().clear();
				startscreen.getSourcelabel().setVisible(false);
				startscreen.getLedslabel().setVisible(false);
				startscreen.getLedstxt().setVisible(false);
				startscreen.getResultbutton().setVisible(false);
				startscreen.getLedstxt().clear();
				startscreen.getUserbutton().setVisible(false);
				startscreen.getRandombutton().setVisible(false);
				startscreen.getChooselabeloptions().setVisible(false);
				startscreen.getCancel().setVisible(false);
				startscreen.getChooseoption().setSelected(false);
				resultmsg.getTa().setText(null);
				startscreen.getChooseoption().setSelected(false);
				startscreen.getFileoption().setSelected(false);
				for (int i = 0; i <= number; i++) {
					source[i] = 0;
				}
				for (int i = 0; i <= number; i++) {
					leds[i] = 0;
				}
				number = 0;
				sourcesize = 0;
				ledsize = 0;
				source = new int[sourcesize];
				leds = new int[ledsize];
				stage6.close();
				stage5.close();
				stage3.show();
			});

			rules.getOk().setOnAction(e -> {
				startscreen.getLedslabel().setVisible(true);
				startscreen.getLedstxt().setVisible(true);
				startscreen.getResultbutton().setVisible(true);
				stage7.close();
			});
			startscreen.getResultbutton().setOnAction(e -> {
				String s = startscreen.getLedstxt().getText();

				if (s == null) {
					srcwar.getMsgtxt().setText("Please The LEDS Order is Null !! ");
					startscreen.getLedstxt().setText(null);
					startscreen.getLedstxt().setVisible(false);
					startscreen.getRandombutton().setVisible(true);
					startscreen.getUserbutton().setVisible(true);
					startscreen.getChooselabeloptions().setVisible(true);
					startscreen.getResultbutton().setVisible(false);
					startscreen.getLedslabel().setVisible(false);
					stage4.setScene(scene4);
					stage4.show();
				} else if (isIntegerString(s) == false) {
					startscreen.getLedstxt().setText(null);
					startscreen.getLedstxt().setVisible(false);
					startscreen.getRandombutton().setVisible(true);
					startscreen.getUserbutton().setVisible(true);
					startscreen.getChooselabeloptions().setVisible(true);
					startscreen.getResultbutton().setVisible(false);
					startscreen.getLedslabel().setVisible(false);
					srcwar.getMsgtxt().setText(
							"Please The LEDS Must Only Contains Numbers" + "\n" + "Not Characters / String !! ");
					stage4.setScene(scene4);
					stage4.show();
				}
				// out of range
				else if (isIntegerString(s) == true) {
					int x = 0;
					if (leds.length - 1 == checkled.length) {
						for (int i = 0; i < checkled.length; i++) {
							if (checkled[i] <= number && checkled[i] > 0) {
								x = 0;
							} else {
								startscreen.getLedstxt().setText(null);
								startscreen.getLedstxt().setVisible(false);
								startscreen.getRandombutton().setVisible(true);
								startscreen.getUserbutton().setVisible(true);
								startscreen.getChooselabeloptions().setVisible(true);
								startscreen.getResultbutton().setVisible(false);
								startscreen.getLedslabel().setVisible(false);
								srcwar.getMsgtxt().setText(checkled[i] + " Number is out of The Range ." + "\n"
										+ " --> The Range Must be Between -->  1 to as max --> " + number + "\n"
										+ " Please Enter The  Order of Leds Again (Between The Range Please)!! ");
								
								stage4.setScene(scene4);
								stage4.show();
								leds[0] = 0;
								for (int j = 0; j <= number; j++) {
									leds[j] = 0;
								}
								for (int k = 0; k < number; k++) {
									checkled[k] = 0;
								}
								x = 1;
								srcwar.getMsgtxt().setText(checkled[i] + " Number is out of The Range ." + "\n"
										+ " --> The Range Must be Between -->  1 to as max --> " + number + "\n"
										+ " Please Enter The  Order of Leds Again (Between The Range Please)!! ");
								
								stage4.setScene(scene4);
								stage4.show();
								break;
							}
						}
						if (x == 0) {
							
							if (hasDuplicates(checkled)) {
								startscreen.getLedstxt().setText(null);
								startscreen.getLedstxt().setVisible(false);
								startscreen.getRandombutton().setVisible(true);
								startscreen.getUserbutton().setVisible(true);
								startscreen.getChooselabeloptions().setVisible(true);
								startscreen.getResultbutton().setVisible(false);
								startscreen.getLedslabel().setVisible(false);
								srcwar.getMsgtxt().setText("Please We Have Duplicated Number !! "+"\n"+" -->   There are numbers Missed !!!!!   <--" + "\n"
											+ "Please Enter The Numbers agian but check these points " + "\n"
											+ "1-The numbers  length are :  " + number + "." + "\n"
											+ "2- Remeber That the range of the number must between 1 to as maximum num value : "
											+ number + ".");
								
									stage4.setScene(scene4);
									stage4.show();
									} else {
								for (int i = 0; i < checkled.length; i++) {
									leds[i + 1] = checkled[i];
								}
								for (int k = 0; k < number; k++) {
									checkled[k] = 0;
								}
								int j=0;
								int g=0;
								for(int i=1;i<=number;i++) {
									if(source[i]==leds[i]) {
										++j;
									}
									else if (source[i] ==leds[source.length-i]) {
                                      ++g;
									}
								}
								
								if(j==number) {
									startscreen.getLedstxt().setText(null);
									startscreen.getLedstxt().setVisible(false);
									startscreen.getRandombutton().setVisible(true);
									startscreen.getUserbutton().setVisible(true);
									startscreen.getChooselabeloptions().setVisible(true);
									startscreen.getResultbutton().setVisible(false);
									startscreen.getLedslabel().setVisible(false);
									srcwar.getMsgtxt().setText(" The Leds Are Sorted ,, The Leds Must Not Be Sorted (Program said) "+"\n"+"Because if the Program is Sorted we have this Results :"+"\n"+"1- The Max Leds Light is All Leds = "+checkled.length+"\n"+"So all Leds Will BE Lighting From 1 to : "+checkled.length);
									stage4.setScene(scene4);

									for (int i = 0; i <= number; i++) {
										leds[i] = 0;
									}
                                      
									ledsize = 0;
									leds = new int[ledsize];
									stage4.show();
									
								}
								else if (g == number-1  &&  j==1 || g==number) {
									
									srcwar.getMsgtxt().setText(" The Leds Are Sorted Descending,, The Leds Must Not Be Sorted descending/ Ascending (Program said) !!"+"\n"+"Because if the Program is Sorted we have this Results :"+"\n"+"1- The Max Leds Light is All Leds =  1 ."+"\n"+"So the Leds Will BE Lighting is "+number +" of options !! "+"\n"+"One Option is led lighting : "+number);
									stage4.setScene(scene4);
									for (int i = 0; i <= number; i++) {
										leds[i] = 0;
									}

									ledsize = 0;
									leds = new int[ledsize];
									startscreen.getLedstxt().setText(null);
									startscreen.getLedstxt().setVisible(false);
									startscreen.getRandombutton().setVisible(true);
									startscreen.getUserbutton().setVisible(true);
									startscreen.getChooselabeloptions().setVisible(true);
									startscreen.getResultbutton().setVisible(false);
									startscreen.getLedslabel().setVisible(false);
									stage4.show();
								}
								else {
								stage8.setScene(scene8);
								stage6.setScene(scene6);
								stage6.show();
								stage8.show();
								stage3.close(); 
							}
							}
						}
					
				}
				

					else if (leds.length - 1 > checkled.length) {
						startscreen.getLedstxt().setText(null);
						startscreen.getLedstxt().setVisible(false);
						startscreen.getRandombutton().setVisible(true);
						startscreen.getUserbutton().setVisible(true);
						startscreen.getChooselabeloptions().setVisible(true);
						startscreen.getResultbutton().setVisible(false);
						startscreen.getLedslabel().setVisible(false);
						srcwar.getMsgtxt().setText(" -->   There are numbers Missed !!!!!   <--" + "\n"
								+ "Please Enter The Numbers agian but check these points " + "\n"
								+ "1-The numbers  length are :  " + number + "." + "\n"
								+ "2- Remeber That the range of the number must between 1 to as maximum num value : "
								+ number + ".");
						stage4.setScene(scene4);
						stage4.show();

					} else {
						if(hasDuplicates(checkled)) {
						srcwar.getMsgtxt()
					.setText("We Have Duplicated Numbers in The Leds order "+"\n"+" And ,, Please You Entered More than The number length of source you must enter only :"
							+ number + " Numbers with Range 1 --> to as max --> " + number + "\n"
							+ "Please Enter The input Again !!!!");
						startscreen.getLedstxt().setText(null);
						startscreen.getLedstxt().setVisible(false);
						startscreen.getRandombutton().setVisible(true);
						startscreen.getUserbutton().setVisible(true);
						startscreen.getChooselabeloptions().setVisible(true);
						startscreen.getResultbutton().setVisible(false);
						startscreen.getLedslabel().setVisible(false);
			        stage4.setScene(scene4);
			        stage4.show();
						}
						else {
							srcwar.getMsgtxt()
							.setText("Please You Entered More than The number length of source you must enter only :"
									+ number + " Numbers with Range 1 --> to as max --> " + number + "\n"
									+ "Please Enter The input Again !!!!");
							startscreen.getLedstxt().setText(null);
							startscreen.getLedstxt().setVisible(false);
							startscreen.getRandombutton().setVisible(true);
							startscreen.getUserbutton().setVisible(true);
							startscreen.getChooselabeloptions().setVisible(true);
							startscreen.getResultbutton().setVisible(false);
							startscreen.getLedslabel().setVisible(false);
					        stage4.setScene(scene4);
					        stage4.show();
						}
//						if (hasDuplicates(checkled)) {
//							srcwar.getMsgtxt().setText("We Remove The Duplicated Numbers !!!" + "\n"
//									+ " We take the first one (First Occurrences) and we Remove the others .");
//							startscreen.getLedstxt().setText(null);
//							stage4.setScene(scene4);
//							stage4.show();
//							checkled = removeDuplicates(checkled);
//
//							if (leds.length - 1 > checkled.length) {
//								srcwar.getMsgtxt().setText("We Remove The Duplicated Numbers !!!" + "\n"
//										+ " We take the first one (First Occurrences) and we Remove the others ." + "\n"
//										+ " But ,, -->   There are numbers Missed !!!!!   <--" + "\n"
//										+ "Please Enter The Numbers agian but check these points " + "\n"
//										+ "1-The numbers  length are :  " + number + "." + "\n"
//										+ "2- Remeber That the range of the number must between 1 to as maximum num value : "
//										+ number + ".");
//								startscreen.getLedstxt().setText(null);
//								stage4.setScene(scene4);
//								stage4.show();
//							} else if (leds.length - 1 == checkled.length) {
//								for (int i = 0; i < checkled.length; i++) {
//									if (checkled[i] <= number && checkled[i] > 0) {
//										x = 0;
//									} else {
//										srcwar.getMsgtxt().setText(checkled[i] + " Number is out of The Range ." + "\n"
//												+ " --> The Range Must be Between -->  1 to as max --> " + number + "\n"
//												+ " Please Enter The  Order of Leds Again (Between The Range Please)!! ");
//										startscreen.getLedstxt().setText(null);
//										stage4.setScene(scene4);
//										stage4.show();
//										leds[0] = 0;
//										for (int j = 0; j <= number; j++) {
//											leds[j] = 0;
//										}
//										for (int k = 0; k < number; k++) {
//											checkled[k] = 0;
//										}
//										x = 1;
//										break;
//									}
//								}
//								if (x == 0) {
//									stage8.setScene(scene8);
//									stage6.setScene(scene6);
//									stage6.show();
//									stage8.show();
//									stage3.close();
//									for (int i = 0; i < checkled.length; i++) {
//										leds[i + 1] = checkled[i];
//									}
//									for (int k = 0; k < number; k++) {
//										checkled[k] = 0;
//									}
//									for (int i = 0; i < leds.length; i++) {
//										System.out.println(leds[i] + " ");
//									}
//								}
//							} else {
//								srcwar.getMsgtxt().setText(
//										"Please You Entered More than The number of source you must enter only :"
//												+ number + " Numbers with Range 1 --> to as max --> " + number + "\n"
//												+ "Please Enter The input Again !!!!");
//								startscreen.getLedstxt().setText(null);
//								stage4.setScene(scene4);
//								stage4.show();
//							}
//						} else {
////							srcwar.getMsgtxt()
////									.setText("Please You Entered More than The number of source you must enter only :"
//											+ number + " Numbers with Range 1 --> to as max --> " + number + "\n"
//											+ "Please Enter The input Again !!!!");
//							startscreen.getLedstxt().setText(null);
//							stage4.setScene(scene4);
//							stage4.show();
//						}
//					}
				}
				}
				
			});
			resultpage.getClosebut().setOnAction(e->{
				resultpage.getMaxtxt().clear();
				resultpage.getSourcetxt().clear();
				resultpage.getLedsorderta().clear();
				resultpage.getExceptresultta().clear();
				
				System.out.println(leds.length);
				System.out.println(source.length);
				for (int j = 0; j <= number; j++) {
					leds[j] = 0;
				}
				for (int i = 0; i <= number; i++) {
					source[i] = 0;
				}
				startscreen.getSourcetxt().setVisible(false);
				startscreen.getSourcelabel().setVisible(false);
				startscreen.getLedslabel().setVisible(false);
				startscreen.getLedstxt().setVisible(false);
				startscreen.getSourcetxt().clear();
				startscreen.getLedstxt().clear();
				startscreen.getUserbutton().setVisible(false);
				startscreen.getRandombutton().setVisible(false);
				startscreen.getChooselabeloptions().setVisible(false);
				startscreen.getCancel().setVisible(false);
				startscreen.getResultbutton().setVisible(false);
				startscreen.getChooseoption().setSelected(false);
				startscreen.getFileoption().setSelected(false);
				number=0;
				sourcesize=0;
				ledsize=0;
				stage9.close();
				stage1.setScene(scene1);
				stage1.show();
				
				
				
			});
			resultpage.getTablebut().setOnAction(e->{
				
					Pane root = new Pane();
					GridPane g=new GridPane();
					BorderPane bp = new BorderPane();
					ScrollBar scrollvertical = new ScrollBar();
					ScrollBar scrollhorz = new ScrollBar();
					Button back = new Button("Back");
					back .setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
					back .setMinSize(150, 50);
					back .setStyle(
				            
							 "-fx-background-radius: 10em; " +
						                "-fx-min-width: 200px; " +
						                "-fx-min-height: 50px; " +
						                "-fx-max-width: 250px; " +
						                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
				    ); 
					source[0]=0;
					leds[0]=0;
					back .setTextFill(Color.WHITE);
					scrollvertical.setOrientation(Orientation.VERTICAL);
					for(int i = 1 ; i <= source.length ; i++) {
						Text m=new Text(String.valueOf(source[i-1])) ;
						m.setFont(Font.font(50));
						m.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
						m.setFill(Color.WHITE);
						g.add(m, i, 0);
					}
					
					for(int j = 1 ; j <= leds.length ; j++) {
						Text m=new Text(String.valueOf(leds[j-1])) ;
						m.setFont(Font.font(50));
						m.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
						m.setFill(Color.WHITE);
						g.add(m, 0, j);
					}
                      
					
					
					for(int i = 1 ; i <= source.length ; i++) {
						Text m=new Text(String.valueOf(0)) ;
						m.setFont(Font.font(50));
						m.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
						m.setFill(Color.WHITE);
						g.add(m, i, 1);
					}
					
					for(int j = 1 ; j <=source.length; j++) {
						Text m=new Text(String.valueOf(0)+"     ") ;
						m.setFont(Font.font(50));
						m.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
						m.setFill(Color.WHITE);
						g.add(m, 1, j);
					}
					
					
					
					
					
					
					for(int i = 2 ; i < source.length+1 ; i++)
					{ 
					   for(int j = 2 ; j<  leds.length +1; j++)
					   {
						Text m=new Text(String.valueOf(cost[i-1][j-1])+ " ,  "+ String.valueOf(b[i-1][j-1])) ;
					
						m.setFont(Font.font(50));
						m.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
						m.setFill(Color.WHITE);
					  g.add(m, i, j);
					   }
					 
					}
					g.add(back,0,0);
					
					Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/backk.jpg");
					
					ImageView mg = new ImageView(m);
					mg.setFitWidth(1250);
					mg.setFitHeight(600);
					bp.getChildren().add(mg);
					root.getChildren().add(mg);

					scrollvertical.valueProperty().addListener((observable, oldValue, newValue) -> {
			           
			            g.setLayoutY(-newValue.doubleValue()*200);
			        });
					scrollhorz.valueProperty().addListener((observable, oldValue, newValue) -> {
				           
			            g.setLayoutX(-newValue.doubleValue()*200);
			        });

					  g.setGridLinesVisible(true);
					  g.setHgap(10);
					  g.setVgap(10);

					  root.getChildren().add(g);
					  g.setAlignment(Pos.CENTER);
					  bp.setCenter(root);
					
						bp.setBottom(scrollhorz);
						bp.setRight(scrollvertical);
				Scene scene = new Scene(bp,1250,600);

					Stage stage10 = new Stage();
					stage10.setScene(scene);
					stage10.show();
    back.setOnAction(es->{
	stage10.close();
	stage9.setScene(scene9);
	stage9.show();
    });
					

		});
			
			
			
			resultpage.getDigrambutton().setOnAction(es->{
				
				if(number <=20 ) {
				  Group bp = new Group();
			      Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/Premium%20Photo%20_%20Product%20showcase%20spotlight%20on%20black%20gradient%20background_.jpeg");
		            ImageView mgh = new ImageView(m);
		            mgh.setFitHeight(600);
		            mgh.setFitWidth(1250);
			      bp.getChildren().add(mgh);
                   
                   c= new int[cost[sourcesize-1][ledsize-1]];
 
                   print_LCS(b,source,sourcesize-1,ledsize-1,c,0);
		              Text t = new Text("Source Circuit ");
		              t.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
		       		t.setFill(javafx.scene.paint.Color.WHITE);
		       		t.setLayoutX(600);
		       		t.setLayoutY(50);
		       	 bp.getChildren().add(t);
		              Text b = new Text ("Leds Order Circuit ");
		              b.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
		       		b.setFill(javafx.scene.paint.Color.WHITE);
		       		b.setLayoutX(600);
		       		b.setLayoutY(540);
		       		Button back = new Button("Back");
					back .setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
					back .setMinSize(150, 50);
					back .setStyle(
				            
							 "-fx-background-radius: 10em; " +
						                "-fx-min-width: 200px; " +
						                "-fx-min-height: 50px; " +
						                "-fx-max-width: 250px; " +
						                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
				    );  
					back .setTextFill(Color.WHITE);
					back.setLayoutX(1000);
				    back.setLayoutY(540);
					bp.getChildren().add(back);
		       		
		       	 bp.getChildren().add(b);
		          
		       	int [] line1 = new int[c.length] ;
                
                int [] line2 = new int[c.length] ;
		       	 for (int i = 0; i <c.length; i++) {
		       		 System.out.println(c[i]);
		       	 }
		       	 
		         int start = 0;
		         int end = c.length - 1;

		         // Swap elements from start to end
		         while (start < end) {
		             int temp = c[start];
		             c[start] = c[end];
		             c[end] = temp;

		             start++;
		             end--;
		         }
		         System.out.println(c.length);
			    
			           
			        int numberOfLabels = number;
			        int k=0;
			        int n=0;
			            for (int i = 1; i <=number ; i++) {
			            	if(n < c.length && source[i] == c[n]) {
			            		 Image image = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/on%20click.jpeg"); 
				                 ImageView mg = new ImageView(image);
				                 mg.setFitWidth(50);
				                 mg.setFitHeight(50);

				                Label label = new Label();
				                label.setGraphic(mg);
				                int r=k+30;
				                label.setLayoutX(r+k);
				                label.setLayoutY(130);
				     
				        		label.setMaxHeight(50);
				         		label.setMaxWidth(50);
				         		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), label);
				    			scaleTransitiony.setFromX(0.0);
				    			scaleTransitiony.setFromY(0.0);
				    			scaleTransitiony.setToX(1.0);
				    			scaleTransitiony.setToY(1.0);
				    			scaleTransitiony.playFromStart();
				         
				               bp.getChildren().add(label);
				                 line1[n]=(int)label.getLayoutX();
				                 
				            	k=k+30;
				            	n++;
			            	}
			            	else {
			            		 Image image = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/off%20click.jpeg"); 
				                 ImageView mg = new ImageView(image);
				                 mg.setFitWidth(50);
				                 mg.setFitHeight(50);

				                Label label = new Label();
				                label.setGraphic(mg);
				                int r=k+30;
				                label.setLayoutX(r+k);
				                label.setLayoutY(130);
				     
				        		label.setMaxHeight(50);
				             	label.setMaxWidth(50);
				    
				         		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), label);
				    			scaleTransitiony.setFromX(0.0);
				    			scaleTransitiony.setFromY(0.0);
				    			scaleTransitiony.setToX(1.0);
				    			scaleTransitiony.setToY(1.0);
				    			scaleTransitiony.playFromStart();
				         
				               bp.getChildren().add(label);
				              
				            	k=k+30;
			            	}
			            	
			             
			            }
			           
			            int e=0;
			            for (int i = 1; i <= number; i++) {
			            	
			            	
			                Label x = new Label(String.valueOf(i));
			                 x.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
			         		x.setTextFill(javafx.scene.paint.Color.WHITE);
			         		x.setMinHeight(50);
			         		x.setMinWidth(50);
			         		 int y=e+30;
				              x.setLayoutX(e+y);
				              x.setLayoutY(70);
			
				        		x.setMaxHeight(50);
				         		x.setMaxWidth(50);

			        	    x.setAlignment(Pos.CENTER);
			        		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), x);
			    			scaleTransitiony.setFromX(0.0);
			    			scaleTransitiony.setFromY(0.0);
			    			scaleTransitiony.setToX(1.0);
			    			scaleTransitiony.setToY(1.0);
			    			scaleTransitiony.playFromStart();
			              bp.getChildren().add(x);
			            	e=e+30;
			             
			            }
			            
			            int u=0;
			            int j=0;
			            n=0;
			            for (int i = 1; i <=number; i++) {
			            	if(u<c.length && leds[i]==c[u]) {
			            		 Image image = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/Lighting.jpg"); // Replace with the path to your image
				                 ImageView mg = new ImageView(image);
				                 mg.setFitWidth(50);
				                 mg.setFitHeight(50);

				         		
				                Label label = new Label();
				                label.setGraphic(mg);
				                int r=j+30;
				                label.setLayoutX(r+j);
				                label.setLayoutY(400);
				        	
				        		label.setMaxHeight(50);
				         		label.setMaxWidth(50);
				         		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), label);
				    			scaleTransitiony.setFromX(0.0);
				    			scaleTransitiony.setFromY(0.0);
				    			scaleTransitiony.setToX(1.0);
				    			scaleTransitiony.setToY(1.0);
				    			scaleTransitiony.playFromStart();
				         
				               bp.getChildren().add(label);
				               line2[u]=(int)label.getLayoutX();
				            	j=j+30;
				             u++;
				            }
			            	else {
			            	
			            	 Image image = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/non-lighting.jpg"); // Replace with the path to your image
			                 ImageView mg = new ImageView(image);
			                 mg.setFitWidth(50);
			                 mg.setFitHeight(50);

			         		
			                Label label = new Label();
			                label.setGraphic(mg);
			                int r=j+30;
			                label.setLayoutX(r+j);
			                label.setLayoutY(400);
			        	
			        		label.setMaxHeight(50);
			         		label.setMaxWidth(50);
			         		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), label);
			    			scaleTransitiony.setFromX(0.0);
			    			scaleTransitiony.setFromY(0.0);
			    			scaleTransitiony.setToX(1.0);
			    			scaleTransitiony.setToY(1.0);
			    			scaleTransitiony.playFromStart();
			         
			               bp.getChildren().add(label);
			            
			            	j=j+30;
			             
			            }
			            }
			           
			            int p=0;
			            for (int i = 1; i <=number; i++) {
			            	
			            	 Image image = new Image("file:///C:/Users/Ehab/eclipse-workspace/Ramdan/src/ramadanbackg.jpeg"); // Replace with the path to your image
			                 ImageView mg = new ImageView(image);
			                 mg.setFitWidth(50);
			                 mg.setFitHeight(50);
			                Label x = new Label(String.valueOf(leds[i]));
			                 x.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
			         		x.setTextFill(javafx.scene.paint.Color.WHITE);
			         		x.setMinHeight(50);
			         		x.setMinWidth(50);
			         		 int d=p+30;
				                x.setLayoutX(d+p);
				                x.setLayoutY(440);
				        	
				        		x.setMaxHeight(50);
				         		x.setMaxWidth(50);
			        		x.setAlignment(Pos.CENTER);

			        		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), x);
			    			scaleTransitiony.setFromX(0.0);
			    			scaleTransitiony.setFromY(0.0);
			    			scaleTransitiony.setToX(1.0);
			    			scaleTransitiony.setToY(1.0);
			    			scaleTransitiony.playFromStart();
			              bp.getChildren().add(x);
			            	p=p+30;
			             
			            }
			            
			            for(int y=0; y<c.length ;y++) {
			            	Line l = new Line();
			   
			            	FadeTransition fadeTransition20 = new FadeTransition(Duration.seconds(4), l);
			    			fadeTransition20.setFromValue(0.0);
			    			fadeTransition20.setToValue(1.0);
			    			fadeTransition20.play();
			            	l.setStartX(line1[y]+30);
			            	l.setStartY(180);
			            	l.setEndX(line2[y]+30);
			            	l.setEndY(400);
			            	l.setStrokeWidth(3);
			            	l.setStroke(Color.WHITE);
			            	  bp.getChildren().add(l);
			            }

			            Stage stage13= new Stage();
				        Scene scene13 = new Scene(bp, 1250, 600);
				        stage13.setScene(scene13);
				         stage13.show();
				         back.setOnAction(ef->{
								stage9.setScene(scene9) ;
								stage9.show();
								stage13.close();
							 });
				}
				else {
					
	
		 Group bp = new Group();
		  ScrollBar scrollvertical = new ScrollBar();
			 ScrollBar scrollhorz = new ScrollBar();
			 Image g = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/Premium%20Photo%20_%20Product%20showcase%20spotlight%20on%20black%20gradient%20background_.jpeg");
	            ImageView mgg = new ImageView(g);
	            mgg.setFitHeight(600);
	            mgg.setFitWidth(1270);

	                   
	                   c= new int[cost[sourcesize-1][ledsize-1]];
	 
	                   print_LCS(b,source,sourcesize-1,ledsize-1,c,0);
			              Text t = new Text("Source Circuit ");
			              t.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
			       		t.setFill(javafx.scene.paint.Color.WHITE);
			       		t.setLayoutX(300);
			       		t.setLayoutY(70);
			       	 bp.getChildren().add(t);
			              Text b = new Text ("Leds Order Circuit ");
			              b.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
			       		b.setFill(javafx.scene.paint.Color.WHITE);
			       		b.setLayoutX(800);
			       		b.setLayoutY(70);
			       		Button back = new Button("Back");
						back .setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
						back .setMinSize(150, 50);
						back .setStyle(
					            
								 "-fx-background-radius: 10em; " +
							                "-fx-min-width: 200px; " +
							                "-fx-min-height: 50px; " +
							                "-fx-max-width: 250px; " +
							                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
					    );  
						back .setTextFill(Color.WHITE);
						back.setLayoutX(525);
					    back.setLayoutY(20);
						bp.getChildren().add(back);
			       		
			       	 bp.getChildren().add(b);
			          
			       	int [] line1 = new int[c.length] ;
	                
	                int [] line2 = new int[c.length] ;
			       	 for (int i = 0; i <c.length; i++) {
			       		 System.out.println(c[i]);
			       	 }
			       	 
			         int start = 0;
			         int end = c.length - 1;

			         // Swap elements from start to end
			         while (start < end) {
			             int temp = c[start];
			             c[start] = c[end];
			             c[end] = temp;

			             start++;
			             end--;
			         }
			         System.out.println(c.length);
				    
				           
				        int numberOfLabels = number;
				        int k=0;
				        int n=0;
				            for (int i = 1; i <=number ; i++) {
				            	if(n < c.length && source[i] == c[n]) {
				            		 Image image = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/on%20click.jpeg"); 
					                 ImageView mg = new ImageView(image);
					                 mg.setFitWidth(50);
					                 mg.setFitHeight(50);

					                Label label = new Label();
					                label.setGraphic(mg);
					                int r=k+100;
					                label.setLayoutX(400);
					                label.setLayoutY(r+k);
					     
					        		label.setMaxHeight(50);
					         		label.setMaxWidth(50);
					         		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), label);
					    			scaleTransitiony.setFromX(0.0);
					    			scaleTransitiony.setFromY(0.0);
					    			scaleTransitiony.setToX(1.0);
					    			scaleTransitiony.setToY(1.0);
					    			scaleTransitiony.playFromStart();
					         
					               bp.getChildren().add(label);
					                 line1[n]=(int)label.getLayoutY();
					                 
					            	k=k+30;
					            	n++;
				            	}
				            	else {
				            		 Image image = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/off%20click.jpeg"); 
					                 ImageView mg = new ImageView(image);
					                 mg.setFitWidth(50);
					                 mg.setFitHeight(50);

					                Label label = new Label();
					                label.setGraphic(mg);
					                int r=k+100;
					                label.setLayoutX(400);
					                label.setLayoutY(r+k);
					     
					        		label.setMaxHeight(50);
					             	label.setMaxWidth(50);
					    
					         		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), label);
					    			scaleTransitiony.setFromX(0.0);
					    			scaleTransitiony.setFromY(0.0);
					    			scaleTransitiony.setToX(1.0);
					    			scaleTransitiony.setToY(1.0);
					    			scaleTransitiony.playFromStart();
					         
					               bp.getChildren().add(label);
					              
					            	k=k+30;
				            	}
				            	
				             
				            }
				           
				       int e=0;
				       for (int i = 1; i <= number; i++) {
				            	
				            	
				                Label x = new Label(String.valueOf(i));
				                 x.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
				         		x.setTextFill(javafx.scene.paint.Color.WHITE);
				         		x.setMinHeight(50);
				         		x.setMinWidth(50);
				         		 int y=e+100;
					               x.setLayoutX(300);
					                x.setLayoutY(e+y);
				
					        		x.setMaxHeight(50);
					         		x.setMaxWidth(50);

				        		x.setAlignment(Pos.CENTER);
				        		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), x);
				    			scaleTransitiony.setFromX(0.0);
				    			scaleTransitiony.setFromY(0.0);
				    			scaleTransitiony.setToX(1.0);
				    			scaleTransitiony.setToY(1.0);
				    			scaleTransitiony.playFromStart();
				              bp.getChildren().add(x);
				            	e=e+30;
				             
				            }
				            
				            int u=0;
				            int j=0;
				            n=0;
				            for (int i = 1; i <=number; i++) {
				            	if(u<c.length && leds[i]==c[u]) {
				            		 Image image = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/Lighting.jpg"); // Replace with the path to your image
					                 ImageView mg = new ImageView(image);
					                 mg.setFitWidth(50);
					                 mg.setFitHeight(50);

					         		
					                Label label = new Label();
					                label.setGraphic(mg);
					                int r=j+100;
					                label.setLayoutX(800);
					                label.setLayoutY(r+j);
					        	
					        		label.setMaxHeight(50);
					         		label.setMaxWidth(50);
					         		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), label);
					    			scaleTransitiony.setFromX(0.0);
					    			scaleTransitiony.setFromY(0.0);
					    			scaleTransitiony.setToX(1.0);
					    			scaleTransitiony.setToY(1.0);
					    			scaleTransitiony.playFromStart();
					         
					               bp.getChildren().add(label);
					               line2[u]=(int)label.getLayoutY();
					            	j=j+30;
					             u++;
					            }
				            	else {
				            	
				            	 Image image = new Image("file:///C:/Users/Ehab/eclipse-workspace/MAX%20LEDS%20%20--%20%20FIRST%20%20PROJECT%20(ALGORITHM%20)/src/application/non-lighting.jpg"); // Replace with the path to your image
				                 ImageView mg = new ImageView(image);
				                 mg.setFitWidth(50);
				                 mg.setFitHeight(50);

				         		
				                Label label = new Label();
				                label.setGraphic(mg);
				                int r=j+100;
				                label.setLayoutX(800);
				                label.setLayoutY(r+j);
				        	
				        		label.setMaxHeight(50);
				         		label.setMaxWidth(50);
				         		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), label);
				    			scaleTransitiony.setFromX(0.0);
				    			scaleTransitiony.setFromY(0.0);
				    			scaleTransitiony.setToX(1.0);
				    			scaleTransitiony.setToY(1.0);
				    			scaleTransitiony.playFromStart();
				         
				               bp.getChildren().add(label);
				            
				            	j=j+30;
				             
				            }
				            }
				           
				            int p=0;
				            for (int i = 1; i <=number; i++) {
				            	
				            	 Image image = new Image("file:///C:/Users/Ehab/eclipse-workspace/Ramdan/src/ramadanbackg.jpeg"); // Replace with the path to your image
				                 ImageView mg = new ImageView(image);
				                 mg.setFitWidth(50);
				                 mg.setFitHeight(50);
				                Label x = new Label(String.valueOf(leds[i]));
				                 x.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
				         		x.setTextFill(javafx.scene.paint.Color.WHITE);
				         		x.setMinHeight(50);
				         		x.setMinWidth(50);
				         		 int d=p+100;
					                x.setLayoutX(900);
					                x.setLayoutY(d+p);
					        	
					        		x.setMaxHeight(50);
					         		x.setMaxWidth(50);
				        		x.setAlignment(Pos.CENTER);

				        		ScaleTransition scaleTransitiony = new ScaleTransition(Duration.seconds(3), x);
				    			scaleTransitiony.setFromX(0.0);
				    			scaleTransitiony.setFromY(0.0);
				    			scaleTransitiony.setToX(1.0);
				    			scaleTransitiony.setToY(1.0);
				    			scaleTransitiony.playFromStart();
				              bp.getChildren().add(x);
				            	p=p+30;
				             
				            }
				            
				            for(int y=0; y<c.length ;y++) {
				            	Line l = new Line();
				   
				            	FadeTransition fadeTransition20 = new FadeTransition(Duration.seconds(4), l);
				    			fadeTransition20.setFromValue(0.0);
				    			fadeTransition20.setToValue(1.0);
				    			fadeTransition20.play();
				            	l.setStartX(450);
				            	l.setStartY(line1[y]+30);
				            	l.setEndX(810);
				            	l.setEndY(line2[y]+30);
				            	l.setStrokeWidth(1);
				            	l.setStroke(Color.WHITE);
				            	  bp.getChildren().add(l);
				            }
				     	 
							 
						
						        
							 scrollhorz.setMin(0);
							 scrollhorz.setMax(bp.getBoundsInLocal().getWidth() - 1250);
							 scrollhorz.valueProperty().addListener((observable, oldValue, newValue) ->
						                bp.setTranslateX(-newValue.doubleValue()*10)
						        );
							 scrollvertical.setMin(0);
							 scrollvertical.setMax(bp.getBoundsInLocal().getHeight() - 500);
							 scrollvertical.valueProperty().addListener((observable, oldValue, newValue) ->
						                bp.setTranslateY(-newValue.doubleValue()*10)
						        );

			
							     scrollvertical.setLayoutX(1255);
								 scrollvertical.setMaxWidth(4);
								 scrollvertical.setMinHeight(600);
								 scrollvertical.setOrientation(Orientation.VERTICAL);
							  Pane rootPane = new Pane(mgg,bp, scrollvertical);
				            Stage stage13= new Stage();
					        Scene scene13 = new Scene(rootPane, 1270, 600);
					        stage13.setScene(scene13);
					         stage13.show();
					         back.setOnAction(ef->{
									stage9.setScene(scene9) ;
									stage9.show();
									stage13.close();
								 });
				}
			});
		
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	} 
	
	// methods
	public static boolean isValidNumber(String str) {
		return str.matches("\\d+");
	}

	public static void shuffleRange(int[] leds, int endIndex) {
		Random random = new Random();
		for (int i = 1; i < endIndex; i++) {
			int randomIndex = random.nextInt(endIndex - 1 + 1) + 1;
			int temp = leds[i];
			leds[i] = leds[randomIndex];
			leds[randomIndex] = temp;
		}
	}

	public static boolean isIntegerString(String s) {
		// Split the string by a single space
		// so if we have many space we take one only !!
		String[] numberss = s.split("\\s+");
		checkled = new int[numberss.length];
		try {
			// Attempt to parse each substring as an integer
			for (int i = 0; i < numberss.length; i++) {
				String num = numberss[i].trim(); // Trim to remove leading/trailing spaces
				if (!num.isEmpty()) {
					Integer.parseInt(num);
					checkled[i] = Integer.parseInt(num);
				}
			}
			return true;
		} catch (NumberFormatException e) {
			// If any parsing fails, catch the exception and return false
			return false;
		}
	}

	static boolean hasDuplicates(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	public static boolean isIntegerStringcoma(String s) {
		// Split the string by a single space
		String[] numberss = s.split(",");
		checkled = new int[numberss.length];
		try {
			// Attempt to parse each substring as an integer
			for (int i = 0; i < numberss.length; i++) {
				String num = numberss[i].trim(); // Trim to remove leading/trailing spaces
				if (!num.isEmpty()) {
					Integer.parseInt(num);
					checkled[i] = Integer.parseInt(num);
				}
			}
			return true;
		} catch (NumberFormatException e) {
			// If any parsing fails, catch the exception and return false
			return false;
		}
	}




//	static int[] removeDuplicates(int[] arr) {
//		int n = arr.length;
//		if (n == 0 || n == 1) {
//			return arr;
//		}
//
//		int[] result = new int[n];
//		result[0] = arr[0];
//		int resultIndex = 1;
//
//		for (int i = 1; i < n; i++) {
//			boolean isDuplicate = false;
//
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					isDuplicate = true;
//					break;
//				}
//			}
//
//			if (!isDuplicate) {
//				result[resultIndex] = arr[i];
//				resultIndex++;
//			}
//		}
//
//		return java.util.Arrays.copyOf(result, resultIndex);
//	}

	public static void MAXLeds(int[] x, int xs, int ys, int[] y, int[][] cost, String[][] b) {

		int x_size = xs;
		int y_size = ys;

		for (int i = 1; i < x_size; i++) {
			cost[i][0] = 0;
		}

		for (int j = 1; j < y_size; j++) {
			cost[0][j] = 0;
		}

		for (int i = 1; i < x_size; i++) {
			for (int j = 1; j < y_size; j++) {

				if (x[i] == y[j]) {
					cost[i][j] = cost[i - 1][j - 1] + 1;
				    b[i][j] = "M";
				} else {

					if (cost[i][j - 1] >= cost[i - 1][j]) {
						cost[i][j] = cost[i][j - 1];
						b[i][j] = "U";
					}

					else {
						cost[i][j] = cost[i - 1][j];
						b[i][j] = "L";
					}

				}
			}
		}
}
			
	public void printMax(String [][] b, int[] x, int i, int j) {

				if (i == 0 || j == 0) {
				return ;
				} else {

					if (b[i][j] == "M") {
						printMax(b, x, i - 1, j - 1);
					     resultpage.getExceptresultta().appendText(String.valueOf(x[i])+" - ");
					} else {

						if (b[i][j] == "U") {
							printMax(b, x, i, j - 1);
						} else {
							printMax(b, x, i - 1, j);
							

						}
						
					}
					

				}
				

			}
	
	public void print_LCS(String [][] b, int[] x, int i, int j,int[] c,int p) {

		if (i == 0 || j == 0) {
		return ;
		} else {

			if (b[i][j] == "M") {
				 c[p]=x[i];
			   print_LCS(b, x, i - 1, j - 1,c,++p);
			  
			} else {
				if (b[i][j] == "U") {
					print_LCS(b, x, i, j - 1,c,p);
				} else {
					print_LCS(b, x, i - 1, j,c,p);
					

				}
				
			}
			

		}
		

	}
				

//			table.setOnAction(new EventHandler<ActionEvent>() {
//
//				@Override
//				public void handle(ActionEvent arg0) {
//					BorderPane root = new BorderPane();
//					GridPane g=new GridPane();
//					root.setStyle("-fx-background-image:url('coo.jpg'); -fx-background-repeat: no-repeat; -fx-background-size: 1550 800; -fx-background-position: center center;");
//					
//				
//					
//				
//					for(int i = 0 ; i < k ; i++)
//					{ 
//					   for(int j = 0 ; j< k ; j++)
//					   {
//						Label m=new Label(String.valueOf(d[i][j]))  ;
//					
//						m.setFont(Font.font(50));
//						m.setFont(Font.font(null, FontWeight.BOLD, m.getFont().getSize()));
//					  g.add(m, j, i);
//					   }
//					 
//					}
//				
//					
//					ImageView back = new ImageView(
//							"backk.png");
//					back.setFitWidth(100);
//					back.setFitHeight(80);
//					Button backk = new Button("", back);
//					backk.setOnAction(new EventHandler<ActionEvent>() {
//
//						@Override
//						public void handle(ActionEvent arg0) {
//							primaryStage.setScene(scene);
//
//						}
//						
//
//					});
//					  g.setGridLinesVisible(true);
//					 
//					  
//					  g.setHgap(10);
//					  g.setVgap(10);
//						
//					root.setAlignment(backk, Pos.CENTER);
//					root.setBottom(backk);
//					g.setAlignment(Pos.CENTER);
//				
//					root.setCenter(g);
//					Scene scene = new Scene(root,1550,800);
//					primaryStage.setScene(scene);
//					primaryStage.show();
//					
//				}
//				
//			});
		
	

	public static void main(String[] args) {
		launch(args);
	}
}
