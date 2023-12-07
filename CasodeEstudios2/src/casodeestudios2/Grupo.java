/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudios2;

/**
 *
 * @author charliesalas
 */
public class Grupo {

Movimiento[] movimientos;

public Grupo(int tamaño) {
 movimientos = new Movimiento[tamaño];

class Movimiento {

   String nombre; 
   double monto; 

   public Movimiento(String nombre, double monto) {
   this.nombre = nombre;
   this.monto = monto;
            }
        }
    }

    public void agregarMovimiento(String nombre, double monto) {
        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] == null) {
                movimientos[i] = new Movimiento(nombre, monto);
                break;
            }
        }
    }

    public void calcularSaldoTotal() {
        String nombre = movimientos[0].nombre;
        double total = 0;

        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] != null && movimientos[i].nombre.equals(nombre)) {
                total += movimientos[i].monto;
            }
        }

        System.out.println("El total de deudas de " + nombre + " es de: " + total + " dolares.");
    }
}
    
