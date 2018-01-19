package dialogos;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Dialogos{

    /**
     * Metodo para mostrar un mensaje en pantalla
     *
     * @param mensaje
     */
    public static void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * Metodo que recoje y devuelve una palabra o palabras mostrando en pantalla
     * el mensaje deseado
     *
     * @param mensaje
     * @return Devuelve el String introducido
     */
    public static String recogerString(String mensaje){
        String dato;
        dato=JOptionPane.showInputDialog(mensaje);
        return dato;
    }
    /**
     * Este metodo recoje un numero entero que se pide por pantalla
     * 
     * @param mensaje
     * @return devuelve el numero recogido
     */
    public static int recogerInt(String mensaje){
        int dato;
        dato=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
}
