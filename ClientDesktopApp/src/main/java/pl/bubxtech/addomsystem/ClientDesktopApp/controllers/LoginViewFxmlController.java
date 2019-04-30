package pl.bubxtech.addomsystem.ClientDesktopApp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.springframework.stereotype.Controller;

@Controller
public class LoginViewFxmlController {

    @FXML
    private Button loginButton;

    @FXML
    private Button exitButton;

    @FXML
    private void initialize() {
        loginButton.setOnAction(this::handleLoginButtonAction);
        exitButton.setOnAction(this::handleExitButtonAction);
    }

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        System.out.println("Działa!");
        //TODO
    }

    @FXML
    private void handleExitButtonAction(ActionEvent event) {
        //TODO
    }


}
