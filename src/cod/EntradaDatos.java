package cod;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aferreiradominguez
 */
public class EntradaDatos {

    /**
     * Programa para recibir numeros tecleados por el usuario
     * @param value  introduce el parámetro 0 para trabajar en consola o introduce 1 para ventana un numero!=0||1 hace que el programa devuelva un 0.
     * @return el valor introducido
     */
    public int introducir(int value) {
        int introducido=0;
        if (value == 0) {
            System.out.println("introduce valor");
            Scanner dato = new Scanner(System.in);
            introducido = dato.nextInt();
            return introducido;
        }
        if (value == 1) {
            introducido = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce valor", "Inserta un numero", JOptionPane.PLAIN_MESSAGE));
            return introducido;
        }
        else{
        return introducido;
        }
    }
}
