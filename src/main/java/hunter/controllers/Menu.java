package hunter.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.stage.Stage;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;


import java.io.IOException;


public class Menu {

    @FXML
    private ImageView menuBcg, playBcg, highscoreBcg, exitBcg, afghanButton, muteIV;
    @FXML
    private VBox buttonsVBox;
    @FXML
    private Pane maps;

    @FXML
    public void initialize() {
        menuBcg.setImage(new Image(getClass().getResource("/images/menuS/menuBcg.png").toExternalForm()));
        playBcg.setImage(new Image(getClass().getResource("/images/menuS/playBcg.png").toExternalForm()));
        highscoreBcg.setImage(new Image(getClass().getResource("/images/menuS/highscoreBcg.png").toExternalForm()));
        exitBcg.setImage(new Image(getClass().getResource("/images/menuS/exitBcg.png").toExternalForm()));
        muteIV.setImage(new Image(getClass().getResource("/images/menuS/muteBcg.png").toExternalForm()));
            }




    //map choosing
    public void Play(ActionEvent event) {

        buttonsVBox.setVisible(false);
        afghanButton.setImage(new Image(getClass().getResource("/images/street/afghanButton.png").toExternalForm()));
        //button images will be here
        maps.setVisible(true);
    }

    //afghan map
    public void goAfghanistan(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/playAfghanFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.show();

    }

    public void highscore(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/highscore.fxml"));
        stage.setScene(new Scene(root));
        stage.show();

    }

    public void exitApp(ActionEvent event) {

        Platform.exit();
    }

    public void mute(ActionEvent event) {
        if (music) {


            muteIV.setImage(new Image(getClass().getResource("/images/menuS/unmuteBcg.png").toExternalForm()));
        } else {


            muteIV.setImage(new Image(getClass().getResource("/images/menuS/muteBcg.png").toExternalForm()));
        }


    }
}
