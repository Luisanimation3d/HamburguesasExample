public class Hamburguesa {
    private String TipoPan;

    private String carne;

    private double precio;

    private String nombreH;

    public Hamburguesa(String tipoPan, String carne, double precio, String nombreH) {
        this.TipoPan = tipoPan;
        this.carne = carne;
        this.precio = precio;
        this.nombreH = nombreH;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" +
                "TipoPan='" + TipoPan + '\'' +
                ", carne='" + carne + '\'' +
                ", precio=" + precio +
                ", nombreH='" + nombreH + '\'' +
                '}';
    }
}
