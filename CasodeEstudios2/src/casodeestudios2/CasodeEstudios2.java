/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casodeestudios2;

import javax.swing.JOptionPane;

/**
 *
 * @author charliesalas
 */
public class CasodeEstudios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Amigo[] amigos = new Amigo[6];
        amigos[0] = new Amigo(JOptionPane.showInputDialog("Digite su nombre: "));
        amigos[1] = new Amigo(JOptionPane.showInputDialog("Digite su nombre: "));
        amigos[2] = new Amigo(JOptionPane.showInputDialog("Digite su nombre: "));
        amigos[3] = new Amigo(JOptionPane.showInputDialog("Digite su nombre: "));
        amigos[4] = new Amigo(JOptionPane.showInputDialog("Digite su nombre: "));
        amigos[5] = new Amigo(JOptionPane.showInputDialog("Digite su nombre: "));

        // Aqui se registran los gastos de cada usuario
        amigos[0].agregarGasto(Integer.parseInt(JOptionPane.showInputDialog("Digite sus gastos:")));
        amigos[1].agregarGasto(Integer.parseInt(JOptionPane.showInputDialog("Digite sus gastos:")));
        amigos[2].agregarGasto(Integer.parseInt(JOptionPane.showInputDialog("Digite sus gastos:")));
        amigos[3].agregarGasto(Integer.parseInt(JOptionPane.showInputDialog("Digite sus gastos:")));
        amigos[4].agregarGasto(Integer.parseInt(JOptionPane.showInputDialog("Digite sus gastos:")));
        amigos[5].agregarGasto(Integer.parseInt(JOptionPane.showInputDialog("Digite sus gastos:")));

        // Aqui se registra cada gasto
        double gastoTotal = 0;
        for (Amigo amigo : amigos) {
            gastoTotal += amigo.getDineroGastado();
        }

        for (Amigo amigo : amigos) {
            System.out.println("El gasto de " + amigo.getNombre() + " es: " + (amigo.getDineroGastado() / gastoTotal) * 100 + "%");

        }

        Grupo grupo = new Grupo(6);

        grupo.agregarMovimiento("Tavo", -5);
        grupo.agregarMovimiento("David", -20);
        grupo.agregarMovimiento("Greivin", 115);
        grupo.agregarMovimiento("Joshua", -60);
        grupo.agregarMovimiento("Andres", -60);

        grupo.calcularSaldoTotal();

    }
}
