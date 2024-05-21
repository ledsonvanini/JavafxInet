module com.fx.inet {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires java.desktop;

    opens com.fx.inet to javafx.fxml;
    exports com.fx.inet;
    exports com.fx.inet.controllers;
    exports com.fx.inet.models;
    exports com.fx.inet.views;
}
