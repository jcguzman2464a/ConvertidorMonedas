import javax.swing.*;
import java.util.*;

public class ReglasNegocio {

    private JComboBox<Moneda> comboMoneda;

    private Moneda moneda;

    private ArrayList<Moneda> monedas;

    public void listaCambios () {


            // Lista de monedas principales
            monedas = new ArrayList<>();

            monedas.add(new Moneda("Peso Mexicano", "MXN", 1.0));
            monedas.add(new Moneda("Euro", "EUR", 19.58));
            monedas.add(new Moneda("Dólar Estadounidense", "USD", 19.92));
            monedas.add(new Moneda("Libra Esterlina", "GBP", 16.94));
            monedas.add(new Moneda("Yen Japonés", "JPY", 3.87));
            monedas.add(new Moneda("Franco suizo", "CHF", 19.62));
            monedas.add(new Moneda("Dólar Canadiense", "CAD", 17.59));
            monedas.add(new Moneda("Dólar Australiano", "AUD", 16.15));
            monedas.add(new Moneda("Dólar Neozelandes", "NZD", 11.89));
            monedas.add(new Moneda("Yuan Chino", "CNY", 133.74));
            monedas.add(new Moneda("Won Surcoreano", "KRW", 15080.00));

            // Muestra la lista de monedas en un cuadro de lista
            JList<Moneda> lista = new JList<>(monedas.toArray(new Moneda[0]));
            JOptionPane.showMessageDialog(null, lista);
            int seleccion = lista.getSelectedIndex();

            // Realiza la conversion de la cantidad ingresada a la moneda seleccionada
            if (seleccion != -1) {
                Moneda monedaSeleccionada = monedas.get(seleccion);
                double cantidadConvertida = convertir(monedaSeleccionada.getSimbolo());
                String mensaje = String.format("%.2f %s = %.2f %s", monedaSeleccionada.getTipoCambio(), moneda.getSimbolo(), cantidadConvertida, monedaSeleccionada.getSimbolo());
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }

    public double convertir(String codigoMoneda) {
       // Moneda moneda = new Moneda();
        moneda.setSimbolo(codigoMoneda);
        return cantidad(Double.parseDouble(codigoMoneda)) * moneda.getTipoCambio();
    }


    public double cantidad(double cantidad){


        return cantidad;
    }
}