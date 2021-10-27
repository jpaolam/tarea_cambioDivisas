module com.mycompany.tarea_cambiodivisas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.tarea_cambiodivisas to javafx.fxml;
    exports com.mycompany.tarea_cambiodivisas;
}
