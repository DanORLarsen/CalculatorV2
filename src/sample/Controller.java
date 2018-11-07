package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {
    @FXML
    public TextField talDisplay;

    double resultat;
    public double getDoubleTalDisplay()
    {
        double temp = Double.parseDouble(talDisplay.getText());
        return temp;
    }

    public void plusMetode(ActionEvent actionEvent) {
       String s = talDisplay.getText();
       s += "+";
       talDisplay.setText(s);
    }

    public void minusMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        s += "-";
        talDisplay.setText(s);
        //try og Catch
        try {
            int a = 3/0;

        }
        catch (Exception e){
            System.out.println("Jeg fangede en ERROR lålålå");
        }
    }



    public void equalsMetode(ActionEvent actionEvent) {
        //Tilføj lommeregner og sæt resultatet til at blive resultat.
        talDisplay.setText(Double.toString(resultat));
    }


}