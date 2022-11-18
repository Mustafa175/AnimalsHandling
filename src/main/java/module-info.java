module com.example.animalshamdling {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.Animalshandling to javafx.fxml;
    exports com.example.Animalshandling;
}