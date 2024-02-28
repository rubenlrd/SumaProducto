/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaproducto;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

/**
 *
 * @author rmlrd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf()); 
        } catch (Exception e) {
            System.err.println("No se puede iniciar la aplicaciòn");
        }
        
        Principal principal = new Principal(); 
        principal.setVisible(true);
    }
    
}
