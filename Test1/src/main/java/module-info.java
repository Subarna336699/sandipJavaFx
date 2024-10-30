module com.example.test1 {
    requires javafx.controls; // Required for JavaFX controls
    requires javafx.fxml;
    requires java.sql; // Required for JavaFX FXML

    opens com.example.test1 to javafx.fxml; // Allows FXML to access the package
    exports com.example.test1; // Exports the package for other modules
}
