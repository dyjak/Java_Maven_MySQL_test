module test.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens test.test to javafx.fxml;
    exports test.test;
}