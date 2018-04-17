package javafx;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Here we set up all the pre-requisites for a scene.
        stage.setTitle("JavaFX Example");
        GridPane pane = new GridPane();
        initContent(pane);

        // Prepare the popup window for future use.
        popup = new PopupWindow("Person Information", stage);

        // More initialization.
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final Controller controller = new Controller();
    private PopupWindow popup;
    private TextField txfName;

    private void initContent(GridPane pane) {
        // Set some basic attributes about the way we want our pane to look.
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // Create a label.
        Label lblExample = new Label("JavaFX Example");
        // Add our label to our pane.
        pane.add(lblExample, 0, 0);

        // Assign our textfield to our txfName variable.
        txfName = new TextField();
        // Add our textfield to our pane.
        pane.add(txfName, 1, 0);

        // Create a button.
        Button btnPopup = new Button("Popup");
        // Add our button to our pane.
        pane.add(btnPopup, 2, 2);
        // Set the method which the button will call upon being clicked.
        btnPopup.setOnAction(event -> controller.btnPopupAction());
    }

    // Our private controller class, used for organizing data and handling button-
    // clicks etc.
    private class Controller {
        // Our button is clicked:
        public void btnPopupAction() {
            // Make out popup appear.
            popup.showAndWait();
        }
    }

}
