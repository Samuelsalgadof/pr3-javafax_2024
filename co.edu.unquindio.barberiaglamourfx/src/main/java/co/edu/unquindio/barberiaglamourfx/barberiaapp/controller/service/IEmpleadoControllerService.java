package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.*;

public interface IEmpleadoControllerService {
    List<EmpleadoDto> obtenerEmpleados();

    boolean agregarEmpleado(EmpleadoDto empleadoDto);

    boolean eliminarEmpleado(String cedula);

    boolean actualizarEmpleado(String cedulaActual, EmpleadoDto empleadoDto);
}
.