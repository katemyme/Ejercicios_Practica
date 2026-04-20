import javax.swing.*;

// 2. Número mayor
//Dado un arreglo de números, encuentra el valor más grande dentro del arreglo sin usar funciones predefinidas.
public class SegundoEjercicio {
    public static void main(String[] args) {
        int[] Numeros = new int[5];
        int numero;
        int mayor;
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese el " + (i + 1) + " numero"));
            Numeros[i] = numero;
        }
        mayor =Numeros[0];
        for ( int i =1 ; i <Numeros.length; i ++){
            if (Numeros[i] > mayor ){
                mayor = Numeros[i];
            }

        }
        JOptionPane.showMessageDialog(null, " el numero mayor es : " + mayor);
    }
}
