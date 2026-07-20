package Ejercicio4_6;

public class ProfesorTitular extends Profesor {

    private int anos = 0;

    @Override
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }

    protected void imprimirAnos() {
        System.out.println("Años = " + anos);
    }
}
