package pl.bubxtech.addomsystem.ClientDesktopApp.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import lombok.Getter;
import org.springframework.stereotype.Controller;

import java.util.HashMap;

@Controller
@Getter
public class SceneController {

    public enum ViewType {LOGIN, MAIN}

    private final HashMap<ViewType, Pane> screenMap = new HashMap<>();
    private FXMLLoader fxmlLoader;
    private Scene mainScene;

    public SceneController(){
        this.fxmlLoader = new FXMLLoader();
        initViews();
        this.mainScene = new Scene(screenMap.get(ViewType.LOGIN));
    }

    public void activate(ViewType name){
        mainScene.setRoot( screenMap.get(name) );
    }

    private void initViews(){
        try{
            screenMap.put(ViewType.LOGIN, FXMLLoader.load(getClass().getResource("/fxml/login.fxml")));
            screenMap.put(ViewType.MAIN, FXMLLoader.load(getClass().getResource("fxml/mainView.fxml")));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
