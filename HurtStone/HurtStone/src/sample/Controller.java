package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label Num;

    @FXML
    private TextField Text;

    @FXML
    private Button Calc;

    @FXML
    void makeCalc(ActionEvent event) {
        try
        {
            // the String to int conversion happens here
            int turns = Integer.parseInt(Text.getText().trim());

            int Number = Calc(turns);
            Num.setText("Turn " + turns + " does " + Number + " damage");
            Num.setVisible(true);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }

    }

    public int Calc(int turns){
        int damage = 0;
        int[] k = new int[100];
        k[0] = 0;
        for (int i = 1; i < turns+1; i++) {
            damage = i + k[i-1];
            k[i] = damage;
        }
        return damage;
    }



    }


