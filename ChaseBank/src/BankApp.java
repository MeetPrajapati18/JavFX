import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Use this template to create Apps with Graphical User Interfaces.
 *
 * @author Meetkumar Prajapati
 */
public class BankApp extends Application {

    // TODO: Instance Variables for View Components and Model
    private BankAccount account;
    private Label appTitle;
    private TextField inputBox;
    private Button depositButton;
    private Button withdrawButton;

    // TODO: Private Event Handlers and Helper Methods

    private void deposit(ActionEvent e){
        String str =inputBox.getText();
        double amount = Double.parseDouble(str);

        if(amount>0.0)
             account.deposit(amount);
        else {
            amount = 0.00;
            inputBox.setText("0.00");
        }

        str = "Balance: $";
        str += String.format("%.2f",account.getBalance());
        appTitle.setText(str);

        inputBox.setText("0.00");
    }

    private void withdraw(ActionEvent e){
        String str =inputBox.getText();
        double amount = Double.parseDouble(str);
        account.withdraw(amount);

        str = "Balance: $";
        str += String.format("%.2f",account.getBalance());
        appTitle.setText(str);

        inputBox.setText("0.00");

    }



    /**
     * This is where you create your components and the model and add event
     * handlers.
     *
     * @param stage The main stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 500, 300); // set the size here
        stage.setTitle("FX GUI Template"); // set the window title here
        stage.setScene(scene);
        // TODO: Add your GUI-building code here

        // 1. Create the model
        account = new BankAccount("Dave");

        // 2. Create the GUI components
        appTitle = new Label("Balance: $0.00");
        depositButton = new Button("Deposit");
        withdrawButton = new Button("Withdraw");
        inputBox = new TextField("0.00");

        // 3. Add components to the root
        root.getChildren().addAll(appTitle,depositButton,withdrawButton,inputBox);
        // 4. Configure the components (colors, fonts, size, location)
        appTitle.relocate(100,40);
        appTitle.setFont(new Font("System",40));

        inputBox.relocate(100,100);
        depositButton.relocate(120,180);
        withdrawButton.relocate(230,180);
        // 5. Add Event Handlers and do final setup
        depositButton.setOnAction(this::deposit);
        withdrawButton.setOnAction(this::withdraw);
        // 6. Show the stage
        stage.show();
    }

    /**
     * Make no changes here.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}