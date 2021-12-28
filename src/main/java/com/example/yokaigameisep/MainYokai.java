package com.example.yokaigameisep;


import com.example.yokaigameisep.components.PlateauComponent;
import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Group;
        import javafx.scene.Scene;
        import javafx.stage.Stage;

        import java.io.IOException;

public class MainYokai extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainYokai.class.getResource("hello-view.fxml"));
        //=========================================



        Board board = new Board();
        board.Initialize_Board();

        board.printBoard();
        Group g = new PlateauComponent(board);




        //=======================================
        Scene scene = new Scene(fxmlLoader.load(), 1000, 700);

        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
