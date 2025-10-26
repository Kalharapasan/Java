import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1,scene2;

    public static void main(String[] args) {


        launch(args);
    }

    @Override

    public void start(Stage primaryStage) throws Exception {
        window =primaryStage;

        Label label =new Label("Welcome to ther frist scene");
        Button button1 =new Button("Go to 2 scene");
        button1.setOnAction(e ->{
            window.setScene(scene2);
        });


        //Layout1 childern are lida out in vertical column

        VBox layout1 =new VBox(20) ;
        layout1.getChildren().addAll(label,button1);
        scene1=new Scene(layout1,200,200);

        //Button2
        Button button2 =new Button("Go to back scene");
        button2.setOnAction(e ->{
            window.setScene(scene1);
        });

        //Layout2
        StackPane layout2 =new StackPane();
        layout2.getChildren().add(button2);
        scene2 =new Scene(layout2,600,300);

        window.setScene(scene1);
        window.setTitle("Switching_Scenes");
        window.show();

    }
}