module com.nef.cruddeusuuarios {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.nef.cruddeusuuarios to javafx.fxml;
    exports com.nef.cruddeusuuarios;
}