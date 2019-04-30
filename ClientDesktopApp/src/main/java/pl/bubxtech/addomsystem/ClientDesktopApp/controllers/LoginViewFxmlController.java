package pl.bubxtech.addomsystem.ClientDesktopApp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginViewFxmlController {

    private final SceneController sceneController;

    @Autowired
    public LoginViewFxmlController(SceneController sceneController) {
        this.sceneController = sceneController;
    }

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
        sceneController.activate(SceneController.ViewType.MAIN);
    }

    @FXML
    private void handleExitButtonAction(ActionEvent event) {
    }


}
