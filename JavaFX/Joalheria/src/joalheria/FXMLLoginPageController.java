package joalheria;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

//@Autor DennisBozzi
public class FXMLLoginPageController implements Initializable {

    @FXML
    private Label confirmacao;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField userField;

    @FXML
    private javafx.scene.control.Button fecharTela;

    @FXML
    private void fecharTelaAction() {
        //Obtendo a janela atual
        Stage stage = (Stage) fecharTela.getScene().getWindow();
        
        //Fechando a Tela
        stage.close();
    }

    @FXML // Quando clica no botão "Login", e possui a senha e o usuario correto, printa alguma coisa.
    private void handleButtonAction() {

        String user = "123"; //login
        String password = "123"; //senha

        //Conferindo Login e Senha
        if (userField.getText().equals(user) && passwordField.getText().equals(password)) {
            System.out.println("Você logou!");
            Main.changeScreen("home"); //<-- Chamando a nova tela quando logado!
        }
    }

    @FXML //Switch-Case para quando apertar "Enter" tentar Logar
    public void keyPressed(KeyEvent event) {

        switch (event.getCode()) {
            case ENTER:
                handleButtonAction();
                break;

            default:
                break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
