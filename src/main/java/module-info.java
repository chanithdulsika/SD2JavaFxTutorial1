module com.example.test2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens com.example.test2 to javafx.fxml;
    exports com.example.test2;
}