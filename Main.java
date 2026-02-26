package cuentas;

/**
 * Clase principal que ejecuta la lógica de la aplicación bancaria.
 * * @author David
 */
public class Main {

    /**
     * Método principal de entrada al programa
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Ccuenta cuenta1 = new Ccuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, 695f);
    }

    /**
     * Método que realiza las operaciones de retiro e ingreso sobre una cuenta
     * @param cuenta1 El objeto cuenta sobre el que se opera
     * @param cantidad La cantidad que se usará para el ingreso
     */
    public static void operativa_cuenta(Ccuenta cuenta1, float cantidad){
        double saldoActual;

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
