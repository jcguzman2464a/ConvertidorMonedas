import javax.swing.*;
import java.util.ArrayList;


public class ConversorDeMonedas {

        public static void main(String[] args) {

            Moneda moneda = new Moneda();
            ReglasNegocio reglas = new ReglasNegocio();


            while (true) {

                JOptionPane.showMessageDialog(null,"Conversor de Moneda de uno");

                String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                if (ValidarNumero(input) == true) {
                    double Minput = Double.parseDouble(input);

                    reglas.cantidad(Minput);
                    reglas.listaCambios();

                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == respuesta) {
                        System.out.println("Selecciona opción Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
                break;


            }

        }

        public static boolean ValidarNumero(String input) {
            try {
                double x = Double.parseDouble(input);
                return x >= 0;
            } catch (NumberFormatException e) {
                return false;
            }
        }



    }