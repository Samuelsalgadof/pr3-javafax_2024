package co.edu.unquindio.barberiaglamourfx.barberiaapp;

public class contador {
    public static void main(String[] args) {
        int numero =10;


        int contador = contadodigitos(numero);
        System.out.println("el numero tiene  " + contador + "digitos");
    }

    public static int contadodigitos(int numero) {


        if (numero<10){
            return 1;
        }else {
            return 1 + contadodigitos(numero/10);
        }
    }


}
