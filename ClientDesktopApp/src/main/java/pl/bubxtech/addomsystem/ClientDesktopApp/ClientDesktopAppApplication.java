package pl.bubxtech.addomsystem.ClientDesktopApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.shape.MeshView;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import pl.bubxtech.addomsystem.ClientDesktopApp.controllers.SceneController;

@SpringBootApplication
public class ClientDesktopAppApplication extends Application {

    ConfigurableApplicationContext springContext;

    @Autowired
    private SceneController sceneController;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        springContext = new SpringApplicationBuilder(ClientDesktopAppApplication.class)
                .run(getParameters().getRaw().toArray(new String[0]));

        sceneController.getFxmlLoader().setControllerFactory(springContext::getBean);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(sceneController.getMainScene());
        primaryStage.setTitle("Zaloguj do serwera");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        springContext.stop();
    }


}
