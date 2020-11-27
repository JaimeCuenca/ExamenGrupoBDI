package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Controller {

    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;

    int clicks=0;
    List<String> numeros = Arrays.asList("1", "2", "3", "4", "5");

    @FXML
    public void numerosAleatorios() {
        Collections.shuffle(numeros);
        b1.setText(numeros.get(0));
        b2.setText(numeros.get(1));
        b3.setText(numeros.get(2));
        b4.setText(numeros.get(3));
        b5.setText(numeros.get(4));
    }

    @FXML
    public void onBotonClickado(Button b){



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
