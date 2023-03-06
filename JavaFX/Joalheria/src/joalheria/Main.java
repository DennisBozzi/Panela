package joalheria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

//Autor @DennisBozzi
public class Main extends Application {

    //Variáveis para a criação de cache das telas
    private static Stage stage;
    private static Scene LoginPage;
    private static Scene HomePage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //OBS Sempre depois do start criar o primaryStage
        stage = primaryStage;

        //Cologando Login Page em Cache - Criando variável para seu FXML
        Parent fxmlLoginPage = FXMLLoader.load(getClass().getResource("FXMLLoginPage.fxml"));
        LoginPage = new Scene(fxmlLoginPage);

        //Cologando Home Page em Cache - Criando variável para seu FXML
        Parent fxmlHomePage = FXMLLoader.load(getClass().getResource("FXMLHomePage.fxml"));
        HomePage = new Scene(fxmlHomePage);

        Image icon = new Image("joalheria/images/caskita.png"); // <-- Variável do icone do aplicativo

        //.initStyle() <--- Atributo que me ajuda a iniciar sem mostrar a Windows Bar
        stage.initStyle(StageStyle.UNDECORATED);

        stage.getIcons().add(icon); // <-- Icone do aplicativo

        stage.setTitle("Lorem Ipsum");
        stage.setScene(LoginPage);
        stage.sizeToScene();
        stage.show();

    }

//Método changeScreen() <-- Criado para mudar de tela quando chamado EX: Main.changeScreen("home");
    public static void changeScreen(String scr) {
        switch (scr) {
            case "login":
                stage.setScene(LoginPage);
                break;
            case "home":
                stage.setScene(HomePage);
                break;
        }
    }

//@param args the command line arguments
    public static void main(String[] args) {
        launch(args);
    }

}
