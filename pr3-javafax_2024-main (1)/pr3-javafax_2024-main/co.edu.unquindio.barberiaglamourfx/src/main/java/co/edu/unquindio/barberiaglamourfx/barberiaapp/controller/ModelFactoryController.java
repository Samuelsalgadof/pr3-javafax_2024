package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service.IModelFactoryService;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.dto.EmpleadoDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.BarberiaMapper;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.mappers.BarberiaMapper;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.*;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.*;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.Utils.BarberiaUtils;

import java.util.ArrayList;
import java.util.List;

public class ModelFactoryController implements IModelFactoryService {
    Barberia barberia;
    co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.mappers.BarberiaMapper mapper = co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.mappers.BarberiaMapper.INSTANCE;


    //------------------------------  Singleton ------------------------------------------------
    // Clase estatica oculta. Tan solo se instanciara el singleton una vez
    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        cargarDatosBase();
    }

    private void cargarDatosBase() {
        barberia = BarberiaUtils.inicializarDatos();
    }

    public Barberia getBanco() {
        return barberia;
    }

    public void setBanco(Barberia
        this.barberia=barberia;
    }


    @Override
    public List<EmpleadoDto> obtenerEmpleados() {
        return  mapper.getEmpleadosDto(barberia.taEmpleados());
    }

    @Override
    public boolean agregarEmpleado(co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.EmpleadoDto empleadoDto) {
        return false;
    }

    @Override
    public boolean agregarEmpleado(EmpleadoDto empleadoDto) {
        try{
            if(!banco.verificarEmpleadoExistente(empleadoDto.cedula())) {
                Empleado empleado = mapper.empleadoDtoToEmpleado(empleadoDto);
                getBanco().agregarEmpleado(empleado);
            }
            return true;
        }catch (EmpleadoException e){
            e.getMessage();
            return false;
        }
    }

    @Override
    public boolean eliminarEmpleado(String cedula) {
        boolean flagExiste = false;
        try {
            flagExiste = getBanco().eliminarEmpleado(cedula);
        } catch (EmpleadoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flagExiste;
    }

    @Override
    public boolean actualizarEmpleado(String cedulaActual, co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.EmpleadoDto empleadoDto) {
        return false;
    }

    @Override
    public boolean actualizarEmpleado(String cedulaActual, EmpleadoDto empleadoDto) {
        try {
            Empleado empleado = mapper.empleadoDtoToEmpleado(empleadoDto);
            getBanco().actualizarEmpleado(cedulaActual, empleado);
            return true;
        } catch (EmpleadoException e) {
            e.printStackTrace();
            return false;
        }
    }
}


