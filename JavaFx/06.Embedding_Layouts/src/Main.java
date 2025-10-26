import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application  {

    Stage window;

    public static void main(String[] args) {


        launch(args);
    }

    @Override

    public void start(Stage primaryStage) throws Exception {
        window =primaryStage;
        window.setTitle("Menu Bar");

        HBox topMenu =new HBox();
        Button ButtonA =new Button("File");
        Button ButtonB =new Button("Edit");
        Button ButtonC =new Button("View");
        topMenu.getChildren().addAll(ButtonA, ButtonB, ButtonC);

        VBox leftMenu =new VBox();
        Button ButtonD =new Button("A");
        Button ButtonE =new Button("B");
        Button ButtonF =new Button("C");
        topMenu.getChildren().addAll(ButtonD, ButtonE, ButtonF);

        BorderPane borderPane =new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);



        Scene scene = new Scene(borderPane, 300, 250);
        window.setScene(scene);
        window.show();


    }

}

