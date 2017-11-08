package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField nameTxt;

    @FXML
    private Button connectButton;

    @FXML
    private Button furtherButton;

    @FXML
    private Button downButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameTxt.setText("HelloWorld!");
    }
}
