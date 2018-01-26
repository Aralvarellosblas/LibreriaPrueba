package dialogos;

import javax.swing.JOptionPane;

/**
 *Librería para metodos de introducir y mostrar datos
 * 
 * @author Arturo
 */
public class Dialogos{

    /**
     * Metodo para mostrar un mensaje en pantalla
     *
     * @param mensaje mensaje que se muestra
     */
    public static void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * Metodo que recoje y devuelve una palabra o palabras mostrando en pantalla
     * el mensaje deseado
     *
     * @param mensaje mensaje que se muestra
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
     * @param mensaje mensaje que se muestra
     * @return devuelve el numero recogido
     */
    public static int recogerInt(String mensaje){
        int dato;
        dato=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
    /**
     * Este metodo recoje un numero decimal que se pide por pantalla
     * 
     * @param mensaje mensaje que se muestra
     * @return devuelve el numero recogido
     */
    public static float recogerFloat(String mensaje){
        float dato;
        dato=Float.parseFloat(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
    /**
     * El metodo muestra un mensaje por pantalla con tres botones de respuesta
     * devuelve el numero relacionado con la respuesta
     * 
     * @param mensaje mensaje que se muestra
     * @return un numero de respuesta 0 para SI, 1 para NO y 2 para CANCELAR
     */
    public static int confirmar(String mensaje){
        int respuesta=JOptionPane.showConfirmDialog(null, mensaje);
        return respuesta;
    }
}
