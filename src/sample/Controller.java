package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Controller {
    @FXML
    private Label label;
    @FXML
    private TextField eT;
    @FXML
    private Button boton;

    int vez=0;

    @FXML
    public void setTexto() {
        label.setText(String.valueOf(ThreadLocalRandom.current().nextInt(0, 100)));
    }

    @FXML
    public void onTextoEditado(){
        vez++;
        if(vez%2!=0) {
            if (label.getText().equals(eT.getText())) {
                boton.setVisible(true);
                setTexto();
            } else {
                boton.setVisible(false);
            }
        }else{
            if(label.getText().equals(eT.getText())){
                boton.setDisable(false);
            }else{
                boton.setDisable(true);
            }
        }
    }
    @FXML
    public void onBotonClickado(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample2.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
