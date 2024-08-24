module co.edu.unquindio.barberiaglamourfx.barberiaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires org.mapstruct;


    opens co.edu.unquindio.barberiaglamourfx.barberiaapp to javafx.fxml;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.viewController;
    opens co.edu.unquindio.barberiaglamourfx.barberiaapp.viewController to java.fx.fxml;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.controller;
<<<<<<< HEAD
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.dto;
    //exports co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.mappers;
=======
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.mappers;
>>>>>>> 18baae1c93281db954c6f8e22b945330e2fc8c0f
    //exports co.edu.unquindio.barberiaglamourfx.barberiaapp.model;
    opens co.edu.unquindio.barberiaglamourfx.barberiaapp.controller to javafx.fxml;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.dto;

}