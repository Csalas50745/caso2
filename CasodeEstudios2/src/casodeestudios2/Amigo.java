/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudios2;

/**
 *
 * @author charliesalas
 */
class Amigo {
    private String nombre;
    private double dineroGastado;

    public Amigo(String nombre) {
        this.nombre = nombre;
        this.dineroGastado = 0;
    }

    public void agregarGasto(double gasto) {
        this.dineroGastado += gasto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDineroGastado() {
        return dineroGastado;
    }
}
