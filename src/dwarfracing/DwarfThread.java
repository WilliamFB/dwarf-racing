package dwarfracing;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DwarfThread implements Runnable {

    JLabel label;
    JFrame pista;
    String nome;
    boolean fim;
    boolean mostrouResultado;
    
    @Override
    public void run() {

        Random r = new Random();

        label.setLocation(0, label.getY()); //reset
        
        while (!fim) {
            int n = r.nextInt(9);
            if ((label.getX() + 120) < pista.getWidth()) {
                label.setLocation(label.getX() + n, label.getY());
                pista.repaint();
                try {
                    Thread.sleep(15);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DwarfThread.class.getName()).log(Level.SEVERE, null, ex);
                }              
            }
            else{
                fim = true;
            }        
        }
        if(fim && !mostrouResultado){
            mostrouResultado = true;
            JOptionPane.showMessageDialog(pista, "Dwarf: " + nome); 
        }
    }
}
