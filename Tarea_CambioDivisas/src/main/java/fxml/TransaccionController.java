/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author obetancourth
 */
public class TransaccionController implements Initializable {


    @FXML
    private TextField montoOrigen;
    @FXML
    private ComboBox<String> cbOrigen;
    @FXML
    private TextField montoResultado;
    @FXML
    private ComboBox<String> cmbResultado;
    
    //private float fOrigen  = 0f;
    //private float fResultado = 0f;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        montoOrigen.requestFocus();
        cbOrigen.getItems().add("Dolar");
        cbOrigen.getItems().add("Euro");
        cbOrigen.getItems().add("Yen");
        cbOrigen.getItems().add("BitCoin");
        cbOrigen.setValue("Dolar");
        
        cmbResultado.getItems().add("Dolar");
        cmbResultado.getItems().add("Euro");
        cmbResultado.getItems().add("Yen");
        cmbResultado.getItems().add("BitCoin");
        cmbResultado.setValue("Euro");
        
        //montoOrigen.setText(String.valueOf(fOrigen));
        //montoResultado.setText(String.valueOf(fResultado));
    }    

    @FXML
    private void montoOrigen_change(KeyEvent event) {
        String valor = montoOrigen.getText();
        Double num =  Double.parseDouble(valor);
        
        int indiceR=cmbResultado.getSelectionModel().getSelectedIndex();
        
        switch(cbOrigen.getSelectionModel().getSelectedIndex()){
            //DOLAR
            case 0:
            switch (indiceR) {
                case 1:
                    montoResultado.setText(String.valueOf(num*0.86));
                    break;
                case 2:
                    montoResultado.setText(String.valueOf(num*113.99));
                    break;
                case 3:
                    montoResultado.setText(String.valueOf(num*0.000016));
                    break;
                default:
                    montoResultado.setText(String.valueOf(num));
                    break;
            }
            break;

            //EURO
            case 1:
            switch (indiceR) {
                case 0:
                    montoResultado.setText(String.valueOf(num*1.17));
                    break;
                case 2:
                    montoResultado.setText(String.valueOf(num*1321565));
                    break;
                case 3:
                    montoResultado.setText(String.valueOf(num*0.000024));
                    break;
                default:
                    montoResultado.setText(String.valueOf(num));
                    break;
            }
            break;

            
           //YEN
            case 2:
            switch (indiceR) {
                case 0:
                    montoResultado.setText(String.valueOf(num*0.0088));
                    break;
                case 1:
                    montoResultado.setText(String.valueOf(num*0.0075));
                    break;
                case 3:
                    montoResultado.setText(String.valueOf(num*0.00));
                    break;
                default:
                    montoResultado.setText(String.valueOf(num));
                    break;
            }
            break;

            //BITCOIN
            case 3:
            switch (indiceR) {
                case 0:
                    montoResultado.setText(String.valueOf(num*61823.80));
                    break;
                case 1:
                    montoResultado.setText(String.valueOf(num*53029.36));
                    break;
                case 2:
                    montoResultado.setText(String.valueOf(num*7019968.84));
                    break;
                default:
                    montoResultado.setText(String.valueOf(num));
                    break;
            }

        }
    }

    @FXML
    private void montoResultado_Change(KeyEvent event) {
        String valor = montoResultado.getText();
        Double num =  Double.parseDouble(valor);
        
        int indiceR=cbOrigen.getSelectionModel().getSelectedIndex();
        
        switch(cmbResultado.getSelectionModel().getSelectedIndex()){
            //DOLAR
            case 0:
            switch (indiceR) {
                case 1:
                    montoOrigen.setText(String.valueOf(num*0.86));
                    break;
                case 2:
                    montoOrigen.setText(String.valueOf(num*113.58));
                    break;
                case 3:
                    montoOrigen.setText(String.valueOf(num*0.000016));
                    break;
                default:
                    montoOrigen.setText(String.valueOf(num));
                    break;
            }
            break;

            //EURO
            case 1:
            switch (indiceR) {
                case 0:
                    montoOrigen.setText(String.valueOf(num*1.17));
                    break;
                case 2:
                    montoOrigen.setText(String.valueOf(num*1321565));
                    break;
                case 3:
                    montoOrigen.setText(String.valueOf(num*0.000024));
                    break;
                default:
                    montoOrigen.setText(String.valueOf(num));
                    break;
            }
            break;

            
           //YEN
            case 2:
            switch (indiceR) {
                case 0:
                    montoOrigen.setText(String.valueOf(num*0.0088));
                    break;
                case 1:
                    montoOrigen.setText(String.valueOf(num*0.0075));
                    break;
                case 3:
                    montoOrigen.setText(String.valueOf(num*0.00));
                    break;
                default:
                    montoOrigen.setText(String.valueOf(num));
                    break;
            }
            break;

            //BITCOIN
            case 3:
            switch (indiceR) {
                case 0:
                    montoOrigen.setText(String.valueOf(num*61823.80));
                    break;
                case 1:
                    montoOrigen.setText(String.valueOf(num*53029.36));
                    break;
                case 2:
                    montoOrigen.setText(String.valueOf(num*7019968.84));
                    break;
                default:
                    montoOrigen.setText(String.valueOf(num));
                    break;
            }

        }
    }

    //COMBOBOX'S

    @FXML
    private void cmbMonto_Change(ActionEvent event) {
        String valor = montoOrigen.getText();
        Double num =  Double.parseDouble(valor);
        
        int indiceR=cmbResultado.getSelectionModel().getSelectedIndex();//indice del combobox de resultado
        int indiceM=cbOrigen.getSelectionModel().getSelectedIndex();
        
        switch(indiceM){
            //DOLAR
            case 0:
            switch (indiceR) {
                case 1:
                    montoResultado.setText(String.valueOf(num*0.86));
                    break;
                case 2:
                    montoResultado.setText(String.valueOf(num*113.99));
                    break;
                case 3:
                    montoResultado.setText(String.valueOf(num*0.000016));
                    break;
                default:
                    montoResultado.setText(String.valueOf(num));
                    break;
            }
            break;

            //EURO
            case 1:
            switch (indiceR) {
                case 0:
                    montoResultado.setText(String.valueOf(num*1.17));
                    break;
                case 2:
                    montoResultado.setText(String.valueOf(num*1321565));
                    break;
                case 3:
                    montoResultado.setText(String.valueOf(num*0.000024));
                    break;
                default:
                    montoResultado.setText(String.valueOf(num));
                    break;
            }
            break;

            
           //YEN
            case 2:
            switch (indiceR) {
                case 0:
                    montoResultado.setText(String.valueOf(num*0.0088));
                    break;
                case 1:
                    montoResultado.setText(String.valueOf(num*0.0075));
                    break;
                case 3:
                    montoResultado.setText(String.valueOf(num*0.00));
                    break;
                default:
                    montoResultado.setText(String.valueOf(num));
                    break;
            }
            break;

            //BITCOIN
            case 3:
            switch (indiceR) {
                case 0:
                    montoResultado.setText(String.valueOf(num*61823.80));
                    break;
                case 1:
                    montoResultado.setText(String.valueOf(num*53029.36));
                    break;
                case 2:
                    montoResultado.setText(String.valueOf(num*7019968.84));
                    break;
                default:
                    montoResultado.setText(String.valueOf(num));
                    break;
            }

        }
    }

    @FXML
    private void cmbResultado_Change(ActionEvent event) {
        String valor = montoResultado.getText();
        Double num =  Double.parseDouble(valor);
        
        int indiceR=cmbResultado.getSelectionModel().getSelectedIndex();//indice del combobox de resultado
        int indiceM=cbOrigen.getSelectionModel().getSelectedIndex();
        
        switch(indiceR){
            //DOLAR
            case 0:
            switch (indiceM) {
                case 1:
                    montoOrigen.setText(String.valueOf(num*0.86));
                    break;
                case 2:
                    montoOrigen.setText(String.valueOf(num*113.99));
                    break;
                case 3:
                    montoOrigen.setText(String.valueOf(num*0.000016));
                    break;
                default:
                    montoOrigen.setText(String.valueOf(num));
                    break;
            }
            break;

            //EURO
            case 1:
            switch (indiceM) {
                case 0:
                    montoOrigen.setText(String.valueOf(num*1.17));
                    break;
                case 2:
                    montoOrigen.setText(String.valueOf(num*1321565));
                    break;
                case 3:
                    montoOrigen.setText(String.valueOf(num*0.000024));
                    break;
                default:
                    montoOrigen.setText(String.valueOf(num));
                    break;
            }
            break;

            
           //YEN
            case 2:
            switch (indiceM) {
                case 0:
                    montoOrigen.setText(String.valueOf(num*0.0088));
                    break;
                case 1:
                    montoOrigen.setText(String.valueOf(num*0.0075));
                    break;
                case 3:
                    montoOrigen.setText(String.valueOf(num*0.00));
                    break;
                default:
                    montoOrigen.setText(String.valueOf(num));
                    break;
            }
            break;

            //BITCOIN
            case 3:
            switch (indiceM) {
                case 0:
                    montoOrigen.setText(String.valueOf(num*61823.80));
                    break;
                case 1:
                    montoOrigen.setText(String.valueOf(num*53029.36));
                    break;
                case 2:
                    montoOrigen.setText(String.valueOf(num*7019968.84));
                    break;
                default:
                    montoOrigen.setText(String.valueOf(num));
                    break;
            }

        }
    }

    

   
    
}