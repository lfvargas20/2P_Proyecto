module ec.edu.espol.pruebaproyecto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.mail;

    opens ec.edu.espol.pruebaproyecto to javafx.fxml;
    opens ec.edu.espol.controller to javafx.fxml;
    exports ec.edu.espol.pruebaproyecto;
    exports ec.edu.espol.controller;
}
