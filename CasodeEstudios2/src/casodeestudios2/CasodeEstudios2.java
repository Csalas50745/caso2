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

        // Aqui se registra cada nuevo en el app
        
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

        // Aqui se registra cada gasto en el viaje
        double gastoTotal = 0;
        for (Amigo amigo : amigos) {
            gastoTotal += amigo.getDineroGastado();
        }

        for (Amigo amigo : amigos) {
            System.out.println("El gasto de " + amigo.getNombre() + " es: " + (amigo.getDineroGastado() / gastoTotal) * 100 + "%");

        }

        // Aqui se registra cuanto debe:
        
        Grupo grupo = new Grupo(6);

        grupo.agregarMovimiento(" ", -5);
        grupo.agregarMovimiento(" ", -20);
        grupo.agregarMovimiento(" ", 115);
        grupo.agregarMovimiento(" ", -60);
        grupo.agregarMovimiento(" ", -60);

        grupo.calcularSaldoTotal();

    }
}
