/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ch.view;

import com.ch.controller.ImageController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LoginView extends BorderPane {
//atributos

    private static LoginView instanciaLoginView;
    //atributos para
    private HBox barraVentana;
    private Button btnCerrarVentana;
    private Label lblTituloVentana;

    private ImageView imgLogoLogin;
    private TextField txtNombreUsuario;
    private Label lblNombreUsuario;

    private PasswordField pwdClave;
    private Label lblClave;

    private GridPane formulario;
    private Button btnIniciarSesion;
    private VBox cajaVertical;

//constructores
    private LoginView() {

        this.setPadding(new Insets(10));
        this.setBorder(new Border(
                new BorderStroke(
                        Color.PINK, //color del borde
                        BorderStrokeStyle.SOLID, //tipo de borde
                        new CornerRadii(20), //px de borde
                        new BorderWidths(5)) //ancho del borde, con borderwidths se usan los de "fabrica "  new BorderWidths(x , x, x, x) arriba derecha abajo zquierda
        ));
        this.setBackground(new Background(
                new BackgroundFill(
                        Color.CORAL,
                        new CornerRadii(20),
                        new Insets(1))));

        //el panel como tal ahora es la clase 
        barraVentana = new HBox(20);

        btnCerrarVentana = new Button("X");
        lblTituloVentana = new Label("JAVAFX SiMULACION LOGIN MAT");
        lblTituloVentana.setTextFill(Color.WHITE);

        /**/

        /**/
        barraVentana.getChildren().addAll(btnCerrarVentana, lblTituloVentana);
        this.setTop(barraVentana);

        cajaVertical = new VBox(15);
        formulario = new GridPane();

        lblNombreUsuario = new Label("Usuario:");
        txtNombreUsuario = new TextField();
        lblNombreUsuario.setFont(Font.font("Arial", 5));
        
        lblClave = new Label("Contraseña:");
        pwdClave = new PasswordField();
        
        btnIniciarSesion = new Button("Iniciar Sesion");
        formulario.add(lblNombreUsuario, 0, 0);
        formulario.add(txtNombreUsuario, 1, 0);

        formulario.add(lblClave, 0, 1);
        formulario.add(pwdClave, 1, 1);



        imgLogoLogin = new ImageView(new ImageController().getImageLogin("logo"));
        imgLogoLogin.setFitHeight(160);
        imgLogoLogin.setFitWidth(180);
        cajaVertical.setAlignment(Pos.CENTER);
        cajaVertical.getChildren().addAll(imgLogoLogin, formulario, btnIniciarSesion);
        this.setCenter(cajaVertical);
        
    }

    //metodos
    //getters y setters
    public static LoginView getInstanciaLoginView() {
        if (instanciaLoginView == null) {
            instanciaLoginView = new LoginView();
        }
        return instanciaLoginView;
    }

    public static void setInstanciaLoginView(LoginView instanciaLoginView) {
        LoginView.instanciaLoginView = instanciaLoginView;
    }

    public HBox getBarraVentana() {
        return barraVentana;
    }

    public void setBarraVentana(HBox barraVentana) {
        this.barraVentana = barraVentana;
    }

    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }

    public void setBtnCerrarVentana(Button btnCerrarVentana) {
        this.btnCerrarVentana = btnCerrarVentana;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public ImageView getImgLogoLogin() {
        return imgLogoLogin;
    }

    public void setImgLogoLogin(ImageView imgLogoLogin) {
        this.imgLogoLogin = imgLogoLogin;
    }

    public TextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public void setTxtNombreUsuario(TextField txtNombreUsuario) {
        this.txtNombreUsuario = txtNombreUsuario;
    }

    public Label getLblNombreUsuario() {
        return lblNombreUsuario;
    }

    public void setLblNombreUsuario(Label lblNombreUsuario) {
        this.lblNombreUsuario = lblNombreUsuario;
    }

    public PasswordField getPwClave() {
        return pwdClave;
    }

    public void setPwClave(PasswordField pwClave) {
        this.pwdClave = pwClave;
    }

    public Label getLblClave() {
        return lblClave;
    }

    public void setLblClave(Label lblClave) {
        this.lblClave = lblClave;
    }

    public GridPane getFormulario() {
        return formulario;
    }

    public void setFormulario(GridPane formulario) {
        this.formulario = formulario;
    }

    public Button getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setBtnIniciarSesion(Button btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public VBox getCajaVertical() {
        return cajaVertical;
    }

    public void setCajaVertical(VBox cajaVertical) {
        this.cajaVertical = cajaVertical;
    }

}
