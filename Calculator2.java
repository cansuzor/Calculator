
//Cansu Zor Lab 08
//CISC 3115- ERQ6
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.Insets;


public class Calculator2 extends Application {
	public void start (Stage primaryStage) {
		HBox hb= new HBox();

		Button add= new Button ("+");
		Button sub= new Button ("-");
		Button mult= new Button ("x");
		Button div= new Button ("/");

		TextField op1= new TextField();
		TextField op2= new TextField();
		TextField Result= new TextField();
		Result.setEditable(false); 
		
		Label o1= new Label ("Operand 1: "); 
		Label o2= new Label ("Operand 2: ");
		Label result= new Label ("Result");


		EventHandler eventH= new EventHandler() {
			public void handle (Event e) {
				try{
					int tx1= Integer.parseInt(op1.getText());
					int tx2= Integer.parseInt(op2.getText());	
					
					if (e.getSource()==add) 
						Result.setText(Integer.toString(tx1+tx2));
					if (e.getSource()==sub)
						Result.setText(Integer.toString(tx1-tx2));
					if (e.getSource()==mult)
						Result.setText(Integer.toString(tx1*tx2));
					if (e.getSource()==div)
						Result.setText(Integer.toString(tx1/tx2)); 
					}
					
					catch(Exception e1){
					System.out.println("error");
				}	
			}
			};
		
		add.setOnAction(eventH);
		sub.setOnAction(eventH);
		mult.setOnAction(eventH);
		div.setOnAction(eventH);

		hb.getChildren().addAll(o1,op1,o2,op2,result, Result,add,sub,mult,div);
		Scene sce=new Scene (hb);
		primaryStage.setScene(sce);
		primaryStage.show();

	}
}