/*Esto es una rama
 */
package a4.pkg5_grafos;

import javax.swing.JFrame;

/**
 *
 * @author darkd
 */
public class A45_GRAFOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("GRAFO");
        ventana.add(new Lienzo());
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}
