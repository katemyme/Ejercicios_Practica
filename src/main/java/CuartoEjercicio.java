//4. Invertir un arreglo
//Crea un programa que invierta el orden de los elementos de un arreglo sin usar métodos ya existentes.
//
//Ejemplo:
//Arreglo: [1, 2, 3, 4]
//Resultado esperado: [4, 3, 2, 1]
import javax.swing.JOptionPane;

public class CuartoEjercicio {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        String resultado = "";
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Ingrese el número " + (i + 1) + ":")
            );
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            resultado += numeros[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Arreglo invertido: " + resultado);
    }
}
