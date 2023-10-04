public class Moneda {

    // Nombre de la moneda
    private String nombre;

    // Símbolo de la moneda
    private String simbolo;

    // Tipo de cambio
    private double tipoCambio;

    public Moneda() {
    }

    public Moneda(String nombre, String simbolo, double tipoCambio) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.tipoCambio = tipoCambio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }



    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }




    @Override
    public String toString() {
        return "Moneda " +
                nombre + '\'' +
                simbolo + '\'' +
                ",S tipoCambio=" + tipoCambio +
                '.';
    }
}
