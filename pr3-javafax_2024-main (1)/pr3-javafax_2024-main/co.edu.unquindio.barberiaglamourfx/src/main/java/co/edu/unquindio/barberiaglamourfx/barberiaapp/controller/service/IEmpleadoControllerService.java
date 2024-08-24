package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service;


import co.edu.unquindio.barberiaglamourfx.barberiaapp.dto.EmpleadoDto;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public interface IEmpleadoControllerService {
    List<EmpleadoDto> obtenerEmpleados();

    boolean agregarEmpleado(EmpleadoDto empleadoDto);

    boolean eliminarEmpleado(String cedula);

    boolean actualizarEmpleado(String cedulaActual, EmpleadoDto empleadoDto);
}
