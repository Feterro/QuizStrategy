package Vista;

import Modelo.DragWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Pantalla implements Initializable, DragWindow {

    @FXML
    private ComboBox<?> artesCBJ1;

    @FXML
    private Pane contenedor;

    //Ataques jugador 1
    @FXML
    private Text at1art1J1;

    @FXML
    private Text at2art1J1;

    @FXML
    private Text at3art1J1;

    @FXML
    private Text at1art2J1;

    @FXML
    private Text at2art2J1;

    @FXML
    private Text at3art2J1;

    @FXML
    private Text at1art3J1;

    @FXML
    private Text at2art3J1;

    @FXML
    private Text at3art3J1;

    //Ataques jugador 2

    @FXML
    private Text at1art1J2;

    @FXML
    private Text at2art1J2;

    @FXML
    private Text at3art1J2;

    @FXML
    private Text at1art2J2;

    @FXML
    private Text at2art2J2;

    @FXML
    private Text at3art3J2;

    @FXML
    private Text at1art3J2;

    @FXML
    private Text at2art3J2;

    @FXML
    private Text at3art2J2;

    //Textos de área ataques
    @FXML
    private TextArea ataquesNormalesJ1;

    @FXML
    private TextArea ataquesNormalesJ2;

    @FXML
    private TextArea ataquesEspecialesJ2;

    @FXML
    private TextArea ataquesEspecialesJ1;

    //Imágenes de ataques
    @FXML
    private ImageView fotoArteJ1;

    @FXML
    private ImageView fotoArte1J2;

    @FXML
    private ImageView fotoArte2J2;

    @FXML
    private ImageView fotoArte3J2;

    //Artes J1
    @FXML
    private Text arte1J1;

    @FXML
    private Text arte2J1;

    @FXML
    private Text arte3J1;

    //Artes J2
    @FXML
    private Text arte1J2;

    @FXML
    private Text arte2J2;

    @FXML
    private Text arte3J2;

    //Puntajes

    @FXML
    private Text puntajeJ1;

    @FXML
    private Text puntajeJ2;


    private ArrayList<Text> ataquesArte1J1 = new ArrayList<>();
    private ArrayList<Text> ataquesArte2J1 = new ArrayList<>();
    private ArrayList<Text> ataquesArte3J1 = new ArrayList<>();
    private ArrayList<Text> ataquesArte1J2 = new ArrayList<>();
    private ArrayList<Text> ataquesArte2J2 = new ArrayList<>();
    private ArrayList<Text> ataquesArte3J2 = new ArrayList<>();

    @FXML
    void generarAtaqueJ1(ActionEvent event) {

    }

    @FXML
    void atacarJ1(ActionEvent event) {

    }

    @FXML
    void atacarJ2(ActionEvent event) {

    }

    @FXML
    void generarAtaqueJ2(ActionEvent event) {

    }

    @FXML
    void pelear(ActionEvent event) {

    }

    @FXML
    void reasignarj1(ActionEvent event) {

    }

    @FXML
    void reasignarj2(ActionEvent event) {

    }

    private void nombrarArtesAtaques(ArrayList<?> artesJ1, ArrayList<?> artesJ2){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.onDraggedScene(contenedor);
        ataquesArte1J1.add(at1art1J1); ataquesArte1J1.add(at2art1J1); ataquesArte1J1.add(at3art1J1);
        ataquesArte2J1.add(at1art2J1); ataquesArte1J1.add(at2art2J1); ataquesArte1J1.add(at3art2J1);
        ataquesArte3J1.add(at1art3J1); ataquesArte1J1.add(at2art3J1); ataquesArte1J1.add(at3art3J1);

        ataquesArte1J2.add(at1art1J2); ataquesArte1J2.add(at2art1J2); ataquesArte1J2.add(at3art1J2);
        ataquesArte2J2.add(at1art2J2); ataquesArte1J2.add(at2art2J2); ataquesArte1J2.add(at3art2J2);
        ataquesArte3J2.add(at1art3J2); ataquesArte1J2.add(at2art3J2); ataquesArte1J2.add(at3art3J2);
    }
}
