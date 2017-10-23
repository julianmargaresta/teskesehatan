/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author M12RjUL14n
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXRadioButton rdlaki;
    @FXML
    private ToggleGroup grup;
    @FXML
    private JFXRadioButton rdperempuan;
    @FXML
    private JFXButton buttonproses;
    @FXML
    private JFXButton buttonreset;
    @FXML
    private TextField hasil;
    @FXML
    private TextField saran;
    @FXML
    private TextField ideal;
    @FXML
    private JFXTextField edittinggi;
    @FXML
    private JFXTextField editberat;
    @FXML
    private JFXTextField editnama;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Lakii(ActionEvent event) {
    }

    @FXML
    private void perempuan(ActionEvent event) {
    }

    @FXML
    private void proses(ActionEvent event) {
    int ihasil = 0;
    String hasil3 = null;
    String hasil2 = null;
    
    if(rdlaki.isSelected()){
        ihasil = parseInt(edittinggi.getText()) - 105;
    }
    if(rdperempuan.isSelected()){
         ihasil = parseInt(edittinggi.getText()) - 110;
    }
    hasil.setText(""+ihasil);
    
    if(parseInt(editberat.getText()) == parseInt(edittinggi.getText())){
        hasil3 ="ideal";
        hasil2="lanjutkan";
    }
    else if(parseInt (editberat.getText()) > parseInt(edittinggi.getText())){
        hasil3 ="kelebihan";
        hasil2="lanjutkan";
    }
        else if(parseInt (editberat.getText()) < parseInt(edittinggi.getText())){
        hasil3 ="kekurangan";
        hasil2="lanjutkan";
    }
    saran.setText("Nama "+editnama.getText()+", Tinggi "+edittinggi.getText()+", Berat"+editberat.getText()+", kesimpulan"+hasil3);
    ideal.setText("berat anda "+hasil3+", jagalah kesehatan anda");
    }
    

    @FXML
    private void hapus(ActionEvent event) {
       editnama.setText("");
       edittinggi.setText("");
       editberat.setText("");
       rdlaki.setSelected(false);
       rdperempuan.setSelected(false);
       hasil.setText("");
       saran.setText("");
       ideal.setText("");
    }

    @FXML
    private void ideal(ActionEvent event) {
    }

    @FXML
    private void hasil(ActionEvent event) {
    }

    @FXML
    private void saran(ActionEvent event) {
        
    }

    @FXML
    private void tinggibadan(ActionEvent event) {
    }

    @FXML
    private void beratbadan(ActionEvent event) {
    }

    @FXML
    private void nama(ActionEvent event) {
    }
    
}
