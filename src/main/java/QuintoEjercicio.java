import javax.swing.JOptionPane;

public class QuintoEjercicio {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos elementos tendrá el arreglo?"));

        int[] arreglo = new int[n];


        for (int i = 0; i < n; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + ":"));
        }


        int[] unicos = new int[n];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            boolean repetido = false;


            for (int j = 0; j < contador; j++) {
                if (arreglo[i] == unicos[j]) {
                    repetido = true;
                    break;
                }
            }


            if (!repetido) {
                unicos[contador] = arreglo[i];
                contador++;
            }
        }


        String resultado = "Arreglo sin duplicados:\n[";
        for (int i = 0; i < contador; i++) {
            resultado += unicos[i];
            if (i < contador - 1) {
                resultado += ", ";
            }
        }
        resultado += "]";

        JOptionPane.showMessageDialog(null, resultado);
    }
}