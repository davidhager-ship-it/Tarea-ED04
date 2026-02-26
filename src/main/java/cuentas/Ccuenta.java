package cuentas;

/**
 * Clase que gestiona los datos de una cuenta bancaria.
 * Permite realizar operaciones de ingreso, retiro y consulta de saldo.
 * * @author David
 * @version 1.0
 */
public class Ccuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Número completo de la cuenta bancaria */
    private String cuenta;
    /** Saldo disponible en la cuenta */
    private double saldo;
    /** Tipo de interés de la cuenta */
    private double tipoInteres;

    /**
     * Constructor vacío por defecto
     */
    public Ccuenta() {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public Ccuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /** @return El nombre del titular */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre El nombre a establecer */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return El número de cuenta */
    public String getCuenta() {
        return cuenta;
    }

    /** @param cuenta El número de cuenta a establecer */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** @return El saldo actual */
    public double getSaldo() {
        return saldo;
    }

    /** @return El tipo de interés */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /** @param tipoInteres El interés a establecer */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Devuelve el saldo disponible actualmente
     * @return saldo de la cuenta
     */
    public double estado() {
        return saldo;
    }

    /**
     * Método para ingresar dinero
     * @param cantidad Cantidad a sumar al saldo
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Método para retirar dinero
     * @param cantidad Cantidad a restar del saldo
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo -= cantidad;
    }
}