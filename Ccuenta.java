    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
     */
    package cuentas;

    /**
     *
     * @author David
     */
    public class Ccuenta {

        private String nombre;
        private String cuenta;
        private double saldo;
        private double tipoInteres;

        public Ccuenta() {
        }

        public Ccuenta(String nom, String cue, double sal, double tipo) {
            nombre = nom;
            cuenta = cue;
            saldo = sal;
            tipoInteres = tipo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCuenta() {
            return cuenta;
        }

        public void setCuenta(String cuenta) {
            this.cuenta = cuenta;
        }

        public double getSaldo() {
            return saldo;
        }

        public double getTipoInteres() {
            return tipoInteres;
        }

        public void setTipoInteres(double tipoInteres) {
            this.tipoInteres = tipoInteres;
        }

        public double estado() {
            return saldo;
        }

        public void ingresar(double cantidad) throws Exception {
            if (cantidad < 0)
                throw new Exception("No se puede ingresar una cantidad negativa");
            saldo += cantidad;
        }

        public void retirar(double cantidad) throws Exception {
            if (cantidad <= 0)
                throw new Exception("No se puede retirar una cantidad negativa");
            if (saldo < cantidad)
                throw new Exception("No hay suficiente saldo");
            saldo -= cantidad;
        }
    }