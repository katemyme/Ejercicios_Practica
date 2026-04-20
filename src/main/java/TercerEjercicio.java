import javax.swing.*;
//Escribe un programa que recorra un arreglo y cuente cuántos números pares contiene.
//
//Ejemplo:
//Arreglo: [1, 2, 3, 4, 5, 6]
//Resultado esperado: 3
import javax.swing.*;

public class TercerEjercicio {
    public static void main(String[] args) {
        int[] Numeros = new int[5];
        String listaPares = "";


        for (int i = 0; i < 5; i++) {
            Numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el " + (i + 1) + " numero:"));
        }


        for (int i = 0; i < Numeros.length; i++) {
            if (Numeros[i] % 2 == 0) {

                listaPares += Numeros[i] + " ";
            }
        }


        if (listaPares.equals("")) {
            JOptionPane.showMessageDialog(null, "No se encontraron números pares.");
        } else {
            JOptionPane.showMessageDialog(null, "Los números pares son: " + listaPares);
        }
    }
}