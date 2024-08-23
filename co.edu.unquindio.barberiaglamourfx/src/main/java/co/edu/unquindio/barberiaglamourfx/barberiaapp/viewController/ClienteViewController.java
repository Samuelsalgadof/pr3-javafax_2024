package co.edu.unquindio.barberiaglamourfx.barberiaapp.viewController;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.ClienteController;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service.IClienteControllerService;
import javafx.fxml.FXML;

public class ClienteViewController {
    IClienteControllerService clienteControllerService;

    @FXML
    void initialize () {clienteControllerService = new ClienteController();}

}
