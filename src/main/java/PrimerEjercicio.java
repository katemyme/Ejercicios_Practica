import javax.swing.*;

// 1. Suma de elementos
//Crea un arreglo de números y escribe un programa que calcule la suma total de todos sus elementos.
public class PrimerEjercicio
{
    public static void main(String[] args) {
        int[] Numeros = new int[5];
        int numero;
        int suma = 0;
        for (int i = 0; i < 5; i++){
        numero =Integer.parseInt(JOptionPane.showInputDialog(null,  " ingrese el " + (i+ 1) + " numero"));
        Numeros[i ] =numero;

        suma += Numeros[i];
        }

        JOptionPane.showMessageDialog(null, " la sumatoria de los numeros son: " + suma);
    }

}
