module com.mycompany.agenda {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.mycompany.agenda to javafx.fxml;
    exports com.mycompany.agenda;
}
