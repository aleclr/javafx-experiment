package hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
        Group root = new Group();
        primaryStage.setTitle("Hello Worlds");
        primaryStage.setScene(new Scene(root, 600, 600, Color.LIGHTCORAL));

        Image icon = new Image("unnamed.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(true);
        primaryStage.setFullScreen(false);

        Text text = new Text();
        text.setText("Amanda Webber Jegger Main Jensen");
        text.setX(150);
        text.setY(150);
        text.setFont(Font.font("sans-serif", 30));
        text.setFill(Color.WHITESMOKE);

        root.getChildren().add(text);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}